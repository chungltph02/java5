package java5.sof2021.controllers.admin;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java5.sof2021.bean.AccountModel;
import java5.sof2021.bean.ProductModel;
import java5.sof2021.entities.Account;
import java5.sof2021.entities.Category;
import java5.sof2021.entities.Product;
import java5.sof2021.mapper.Productmapper;
import java5.sof2021.reposittory.CategoryRepository;
import java5.sof2021.reposittory.ProductRepository;

@Controller
@RequestMapping("/admin/products")
public class ProductController {
	@Autowired
	private ProductRepository proRep;
	@Autowired
	private CategoryRepository cateRep;
	@Autowired
	HttpServletRequest request;
	@Autowired
	private Productmapper mapper;


	@GetMapping("/create")
	public String create(@ModelAttribute("products") ProductModel pro ,HttpServletRequest request) {
		List<Category> lstcategory = cateRep.findAll();
		request.setAttribute("category", lstcategory);
		return "admin/products/create";
	}

	@PostMapping("/store")
	public String store(ProductModel model) {
		Product pro = new Product();

		pro.setName(model.getName());
		pro.setImage(model.getImage());
		pro.setPrice(model.getPrice());
		pro.setCreated_date(model.getCreate_date());
		pro.setAvailable(model.getAvailable());
		pro.setCategory(model.getCategory());

		this.proRep.save(pro);
		return "redirect:/admin/products/index";

	}

	@GetMapping("index")
	public String index(Model model, @RequestParam(name = "size", defaultValue = "3") Integer size,
			@RequestParam(name = "page", defaultValue = "0") Integer page) {

		Pageable pageable = PageRequest.of(page, size);
		Page<Product> p = this.proRep.findAll(pageable);
		model.addAttribute("data", p);
		return "admin/products/index";
	}

	@PostMapping("/update/{id}")
	public String update(@PathVariable("id") Product pro, ProductModel model) {

		pro.setName(model.getName());
		pro.setImage(model.getImage());
		pro.setPrice(model.getPrice());
		pro.setCreated_date(model.getCreate_date());
		pro.setAvailable(model.getAvailable());
		pro.setCategory(model.getCategory());

		this.proRep.save(pro);

		return "redirect:/admin/products/index";
	}

	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable("id") Product pro) {
		List<Category> lstcategory = cateRep.findAll();
		model.addAttribute("category",lstcategory);

		model.addAttribute("pro", pro);
		return "admin/products/edit";
	}
	@GetMapping("delete/{id}")
	public String delete(@PathVariable("id") Product pro) {
		//System.out.println(account.getEmail());
	
		this.proRep.delete(pro);

		return "redirect:/admin/products/index";
	}

}

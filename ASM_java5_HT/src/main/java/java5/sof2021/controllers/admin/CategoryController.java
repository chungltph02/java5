package java5.sof2021.controllers.admin;

import java.util.List;

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

import java5.sof2021.bean.CategoryModel;
import java5.sof2021.entities.Account;
import java5.sof2021.entities.Category;
import java5.sof2021.reposittory.CategoryRepository;

@Controller
@RequestMapping("/admin/categories")
public class CategoryController {
	@Autowired
	private CategoryRepository cateRepo;

	@GetMapping("/create")
	public String create(@ModelAttribute("categories") CategoryModel cate) {
		return "admin/categories/create";
	}

	@PostMapping("/store")
	public String store(CategoryModel model) {
		Category cate = new Category();
		cate.setName(model.getName());
		this.cateRepo.save(cate);
		return "redirect:/admin/categories/index";
	}

	@GetMapping("delete/{id}")
	public String delete(@PathVariable("id") Category cate) {

		this.cateRepo.delete(cate);

		return "redirect:/admin/categories/index";
	}
	
	@PostMapping("/update/{id}")
	private String update(@PathVariable("id")Category cate, CategoryModel catemodel) {
	cate.setName(catemodel.getName());	
	this.cateRepo.save(cate);
	return "redirect:/admin/categories/index";
		
	}
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable("id") Category cate) {

		model.addAttribute("cate", cate);
		return "admin/categories/edit";
	}
	@GetMapping("index")
	public String index(Model model, @RequestParam(name = "size", defaultValue = "3") Integer size,
			@RequestParam(name = "page", defaultValue = "0") Integer page) {
		Pageable pageable = PageRequest.of(page, size);
		Page<Category> p = this.cateRepo.findAll(pageable);
		model.addAttribute("data", p);
	

		
		return "admin/categories/index";
	}

}

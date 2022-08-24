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

import java5.sof2021.bean.OrderModel;
import java5.sof2021.bean.ProductModel;
import java5.sof2021.entities.Account;
import java5.sof2021.entities.Category;
import java5.sof2021.entities.Order;
import java5.sof2021.entities.Product;
import java5.sof2021.reposittory.AccountRepository;
import java5.sof2021.reposittory.OrderRepostitory;

@Controller
@RequestMapping("/admin/order")
public class OrderController {
	@Autowired
	OrderRepostitory dao;
	@Autowired
	AccountRepository accRep;
	@Autowired HttpServletRequest request;
	
	@GetMapping("/create")
	public String create(@ModelAttribute("order") OrderModel ord ,HttpServletRequest request) {
		List<Account> lstcategory = accRep.findAll();
		request.setAttribute("account", lstcategory);
		return "admin/order/create";
	}
	@PostMapping("/store")
	public String store(OrderModel model) {
		Order ord = new Order();		
		ord.setAccount(model.getAccount());
		ord.setCreate_date(model.getCreate_date());
		ord.setAddress(model.getAddress());

		this.dao.save(ord);
		return "redirect:/admin/order/index";

	}
	@GetMapping("index")
	public String index(Model model, @RequestParam(name = "size", defaultValue = "3") Integer size,
			@RequestParam(name = "page", defaultValue = "0") Integer page) {
		Pageable pageable = PageRequest.of(page, size);
		Page<Order> p = this.dao.findAll(pageable);
		model.addAttribute("data", p);
		return "admin/order/index";
	}
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable("id") Order ord) {
		List<Account>lstAccount=this.accRep.findAll();
		model.addAttribute("account",lstAccount);
		model.addAttribute("ord", ord);
		return "admin/order/edit";
	}
	@GetMapping("delete/{id}")
	public String delete(@PathVariable("id") Order ord) {
		//System.out.println(account.getEmail());
	
		this.dao.delete(ord);

		return "redirect:/admin/order/index";
	}
	

}

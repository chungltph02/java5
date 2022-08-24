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

import java5.sof2021.bean.OrderDetailModel;
import java5.sof2021.bean.OrderModel;
import java5.sof2021.entities.Account;
import java5.sof2021.entities.Order;
import java5.sof2021.entities.Order_details;
import java5.sof2021.entities.Product;
import java5.sof2021.reposittory.OrderDetailRepo;
import java5.sof2021.reposittory.OrderRepostitory;
import java5.sof2021.reposittory.ProductRepository;

@Controller
@RequestMapping("/admin/orderDetail")
public class OrderDetailController {

	@Autowired
	private OrderDetailRepo oderDetailRepo;

	@Autowired
	private ProductRepository proRepo;

	@Autowired
	private OrderRepostitory orderRepo;

	@GetMapping("/create")
	public String create(@ModelAttribute("orderDetail") OrderDetailModel orderBean, Model model) {

		List<Order> order = this.orderRepo.findAll();
		model.addAttribute("dsOrder", order);
		List<Product> pro = this.proRepo.findAll();
		model.addAttribute("dsPro", pro);
		return "admin/orderDetail/create";
	}

	@PostMapping("/store")
	public String store(OrderDetailModel model) {
		Order_details order = new Order_details();
		order.setQuantity(model.getQuantity());
		order.setPrice(model.getPrice());
		int idStrOr = model.getOrder().getId();
		Order or = this.orderRepo.findById(idStrOr).get();
		order.setOrder(or);

		int idStrPro = model.getProduct().getId();
		Product pro = this.proRepo.findById(idStrPro).get();
		order.setProduct(pro);

//	  order.setOrder(model.getOrder());
//	  order.setProduct(model.getProduct());
//	  order.setPrice(model.getQuantity());
//	  order.setQuantity(model.getQuantity());
	  
		this.oderDetailRepo.save(order);
		return "/admin/orderDetail/index";
	}
	@GetMapping("delete/{id}")
	public String delete(@PathVariable("id") Order_details order) {

	
		this.oderDetailRepo.delete(order);

		return "redirect:/admin/orderDetail/index";
	}
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable("id") Order_details order) {

		model.addAttribute("ord", order);
		return "admin/orderDetail/edit";
	}



	@GetMapping("index")
	public String index(Model model, @RequestParam(name = "size", defaultValue = "3") Integer size,
			@RequestParam(name = "page", defaultValue = "0") Integer page) {
		Pageable pageable = PageRequest.of(page, size);
		Page<Order_details> p = this.oderDetailRepo.findAll(pageable);
		model.addAttribute("data", p);
		return "admin/orderDetail/index";
	}

}

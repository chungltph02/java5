package java5.sof2021.controllers.admin;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java5.sof2021.bean.user;

@Controller
@RequestMapping("admin/users")
public class UserController {
	@GetMapping("create")
	public String create(@ModelAttribute("user") user user) {
		return "admin/users/create";
	}
	@PostMapping("store")
	public String store(@Valid @ModelAttribute("user") user user,
			BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("form ko hop le");
		}else {
				System.out.println("form hop le");
			
		}
		return "admin/users/create";// duong dan file jsp
	}

}

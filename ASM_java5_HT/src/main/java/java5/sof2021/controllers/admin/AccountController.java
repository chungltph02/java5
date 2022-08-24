package java5.sof2021.controllers.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java5.sof2021.bean.AccountModel;
import java5.sof2021.entities.Account;
import java5.sof2021.reposittory.AccountRepository;

@Controller
@RequestMapping("/admin/accounts")
public class AccountController {
	@Autowired
	private AccountRepository accountRepo;

	@GetMapping("/create")
	public String create(@ModelAttribute("accounts") AccountModel acc) {
		return "admin/accounts/create";
	}

	@PostMapping("/store")
	public String store(AccountModel model) {
		Account acc = new Account();

		acc.setFullname(model.getFullname());
		acc.setUsername(model.getUsername());
		acc.setEmail(model.getEmail());
		acc.setPassword(model.getPassword());
		acc.setPhoto(model.getPhoto());
		acc.setAdmin(model.getAdmin());
		acc.setActivated(0);

		this.accountRepo.save(acc);

		return "redirect:/admin/accounts/index";
	}

	@GetMapping("delete/{id}")
	public String delete(@PathVariable("id") Account account) {
		System.out.println(account.getEmail());
	
		this.accountRepo.delete(account);

		return "redirect:/admin/accounts/index";
	}


	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable("id") Account acc) {

		model.addAttribute("acc", acc);
		return "admin/accounts/edit";
	}

	@PostMapping("/update/{id}")
	public String update(@PathVariable("id")  Account account,AccountModel model) {
		
		account.setFullname(model.getFullname());
		account.setUsername(model.getUsername());
		account.setEmail(model.getEmail());
		account.setPassword(model.getPassword());
		account.setPhoto(model.getPhoto());
		account.setAdmin(model.getAdmin());
		account.setActivated(0);

		this.accountRepo.save(account);

		return "redirect:/admin/accounts/index";
	}

	@GetMapping("index")
	public String index(Model model, @RequestParam(name = "size", defaultValue = "3") Integer size,
			@RequestParam(name = "page", defaultValue = "0") Integer page) {

		Account a=this.accountRepo.findByEmail("%chung01@gmail.com%");
		System.out.println(a.getFullname());
		Pageable pageable = PageRequest.of(page, size);
		Page<Account> p = this.accountRepo.findAll(pageable);
		model.addAttribute("data", p);
		return "admin/accounts/index";
	}
}

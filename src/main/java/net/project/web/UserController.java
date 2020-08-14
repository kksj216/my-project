package net.project.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	private List<User> users = new ArrayList<User>();
	
	@PostMapping("/create")
	public String Create(User user) {
	
		System.out.println("user "+ user);
		if (user.getEmail().isBlank()) return "redirect:/list";
		if (user.getName().isBlank()) return "redirect:/list";
		if (user.getPassword().isBlank()) return "redirect:/list";
		if (user.getUserID().isBlank()) return "redirect:/list";
		
		users.add(user);
		return "redirect:/list";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("users", users); 
		return "list";
	}
	
}

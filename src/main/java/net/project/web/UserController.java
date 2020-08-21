package net.project.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.project.domain.User;
import net.project.domain.UserRepository;

@Controller
@RequestMapping("/users") //("/users")
public class UserController {
	//private List<User> users = new ArrayList<User>();
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "/user/login";
	}
	
	@PostMapping("/login")
	public String login(String userID, String password, HttpSession session) {
		User user = userRepository.findByUserID(userID);
		
		if (user == null) {
			System.out.println("Login fail! at user == null");
			return "redirect:/users/loginForm";
		}

		if (!password.equals(user.getPassword())) {
			System.out.println("Login fail! at password..");
			return "redirect:/users/loginForm"; 
		}
		
		System.out.println("Login Success!");
		session.setAttribute("user", user); 
		
		return "redirect:/";
	}
	
	@GetMapping("/form")
	public String form() {
		return "/user/form";
	}
	
	@PostMapping("")
	public String Create(User user) {
	
		System.out.println("user "+ user);
		if (user.getEmail().isBlank()) return "redirect:/users";
		if (user.getName().isBlank()) return "redirect:/users";
		if (user.getPassword().isBlank()) return "redirect:/users";
		if (user.getUserID().isBlank()) return "redirect:/users";
		
		//users.add(user);
		userRepository.save(user);
		return "redirect:/users";
	}
	
	@GetMapping("")
	public String list(Model model) {
		model.addAttribute("users", userRepository.findAll()); 
		return "/user/list";
	}
	
	@GetMapping("/{id}/form")
	public String updateForm(@PathVariable Long id, Model model) {
		User user = userRepository.findById(id).get();
		model.addAttribute("user", user);
		return "/user/updateForm";
	}
	
	@PostMapping("/{id}")  // PutMapping
	public String update(@PathVariable Long id, User newUser) {
		User user = userRepository.findById(id).get();
		user.update(newUser);
		userRepository.save(user);
		return "redirect:/users";
	}
	
}

package net.project.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class WelcomeController {
	
	// mastache template을 부르려면 컨트롤러를 통해 호출해야 한다. 
	@GetMapping("/helloworld")  // 특정파일을 호출하는 방식으로, get방식
	public String welcome(String name, int age, Model model) {
		System.out.println("name: "+ name + " age: " + age);
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "welcome"; // 리턴해주는 게 templates에 있는 파일명과 같아야! 
	}
	
}

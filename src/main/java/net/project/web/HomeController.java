package net.project.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.project.domain.QuestionRepository;

@Controller
public class HomeController {
	@Autowired
	private QuestionRepository questionRepository;

	@GetMapping("/home")
	public String index(Model model) {
		model.addAttribute("questions", questionRepository.findAll());
		
		return "/index";
	}
	
}

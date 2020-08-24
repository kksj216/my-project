package net.project.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.project.domain.Answer;
import net.project.domain.AnswerRepository;
import net.project.domain.Question;
import net.project.domain.QuestionRepository;
import net.project.domain.User;

@RestController
@RequestMapping("/api/questions/{questionId}/answers")
public class ApiAnswerController {
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;

	@PostMapping("")
	public Answer create(@PathVariable Long questionId, String contents, HttpSession session) {
		if (!HttpSessionUtils.isLoginUser(session)) {
			return null;
		}
		
		User loginUser = HttpSessionUtils.getUserFromSession(session);
		Question question = questionRepository.findById(questionId).get();
		Answer answer = new Answer(loginUser, question, contents);
		return answerRepository.save(answer);
		//return String.format("redirect:/questions/%d", questionId); 
	}
}

package controllers;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.Author;
import services.AuthorServices;

@Controller
public class AuthorController {
	@Inject
	private AuthorServices authorService;
	
	@RequestMapping("authors")
	public String getAuthors(Model model) {
		
		List <Author> authors = authorService.getAuthors();
		model.addAttribute("authors", authors);
		
		return "author";
	}
	
}

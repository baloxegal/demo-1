package controllers;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.Genre;
import services.GenreServices;

@Controller
public class GenreController {
	@Inject
	private GenreServices genreServices;
	@RequestMapping("genre")
	public String getGenre(Model model) {
		
		List<Genre> genres = genreServices.getGenre();
		model.addAttribute("genres", genres);
		
		return "genre";
	}
}

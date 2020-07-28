package com.example.demo;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.Book;
import services.BookServices;

@Controller
public class BookController {	
	@Inject
	private BookServices bookServices;
	@RequestMapping("books")
	public String getBooks(Model model) {
		
		List <Book> books = bookServices.getBooks();
		
		books.forEach(System.out :: println);
		
		model.addAttribute("books", books);
		
		return "books";
	}

}

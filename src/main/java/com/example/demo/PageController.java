package com.example.demo;

//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import domain.Author;
import domain.Book;
import domain.Genre;

@Controller
@EnableAutoConfiguration
public class PageController {
	
	@RequestMapping("index")
	  public String index(Model model) {
		Author x = new Author("Vasea");
		Author y = new Author("Petea");
		
		Genre f = new Genre("Fair");
		Genre g = new Genre("Kino");
		Genre h = new Genre("Bla-Bla");
				
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("Killer", 1980, true, f,  x));
		books.add(new Book("Poker", 1990, true, g, x));
		books.add(new Book("Hacker", 2010, false, h, y));
		books.add(new Book("Shocker", 2020, true, h, y));
		books.forEach(b -> System.out.println(b));		
	  	model.addAllAttributes(books);
		return "index";
	  }
	
	@RequestMapping("templatesIndex")
	  public String templatesIndexPage() {
	  	return "index";
	  }
	
//	@RequestMapping("/index")
//	@ResponseBody
//	  public String indexPage() throws FileNotFoundException, IOException {
//
//		BufferedReader htmlData = new BufferedReader(new FileReader("src/main/resources/templates/index.html"));
//		
//		String htmlDataPrev;
//		String htmlDataString = "";
//		
//		while((htmlDataPrev = htmlData.readLine()) != null)
//			htmlDataString += htmlDataPrev;
//		
//		htmlData.close();
//	  	return "I'm on the index page!!!" + htmlDataString;
//	  }
	
//	@RequestMapping("/ok")
//	@ResponseBody
//	  public String okPage() {
//	  	return "It works just fine!!!";
//	  }
		
//	@RequestMapping("/omega")
//	@ResponseBody
//	  public String omegaPage() {
//	  	return "<title>Opel Omega</title>"
//	  		 + "<link rel=\"shortcut icon\" href=\"https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTr6wOBD1ySvliuFxyDoV5fCZBWUkcoIbLW3A&usqp=CAU\" type=\"image/x-icon\">"
//	  		 + "<h1>MY OPEL OMEGA B</h1>"
//	  		 + "<p>1994 - 2003</p>"
//	  		 + "<p>X20SE - 116 ps </p>"
//	  		 + "<p>X20XEV - 136 ps </p>"
//	  		 + "<p>X2.2XEV - 144 ps </p>"
//	 		 + "<p>X2.5XEV - 170 ps </p>"
//	 		 + "<p>Y2.6XEV - 177 ps</p>"
//	 		 + "<p>U3.0XEV - 211 ps</p>"
//	 		 + "<p>Y3.2XEV - 218 ps </p>"
//	 		 + "<h3>Very good automobile</h3>"
//	  		 + "<p><img src=\"https://i.piccy.info/i9/08bd9ce9799b4764822f97bca94eb358/1423302543/78872/714646/_21ByL_295ugCWk_7E_28KGrHqJ_21iYEw5C17YTWBMQumsnfqw_7E_7E_3.jpg\" alt=\"Вид заголовка\" width=\"600\" height=\"450\"></p>"
//	  		 + "<p><a href=\"https://www.google.com/search?q=opel+omega+image&safe=active&client=firefox-b-d&sxsrf=ALeKk00lrF89Jk1GIxQ-wcylsXIAf2Ad9A:1594880069065&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjz_eafj9HqAhVys4sKHaN0AJEQ_AUoAXoECDQQAw&biw=1920&bih=966\">Image Omega</a></p>"
//	  		 + "<p><a href=\"https://ru.wikipedia.org/wiki/Opel_Omega\">About Omega</a></p>"
//	  		 + "<p><a href=\"http://localhost:8080/ok\">ok</a></p>";
//	  }
}
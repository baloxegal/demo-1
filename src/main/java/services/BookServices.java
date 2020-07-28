package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import domain.Author;
import domain.Book;
import domain.Genre;

@Service
public class BookServices {

	public BookServices() {
		
	}
	
	public List<Book> getBooks(){
		Author x = new Author("Николай Островский");
		Author y = new Author("Антуан де Сент-Экзюпери");
		Author n = new Author("Михаил Шолохов");
		Author m = new Author("Лев Толстой");
		
		Genre f = new Genre("Революционное мясо");
		Genre g = new Genre("Для покурить");
		Genre h = new Genre("Революция Мексикана");
		Genre p = new Genre("Мясо по французки");
				
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("Как закалялась сталь", 1938, true, "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQuocjZqbeTCT0l4VJGIZc_9VBtA9iOyp6HjA&usqp=CAU", f,  x));
		books.add(new Book("Маленький принц", 1958, true, "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQdS5OdROIedW7Yg6NifgBCOmV9bVWcdCUb6g&usqp=CAU", g, y));
		books.add(new Book("Тихий дон", 1948, false, "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSgqbXzoa9GQAMuSwNcBUjI_RSq-HnwblwbyA&usqp=CAU\" class=",h, n));
		books.add(new Book("Война и мир", 1888, true, "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSFBD1YM1DIN7KWPIUdcSY4s8SfOEJyclPNOw&usqp=CAU",p, m));
		
		books.forEach(b -> System.out.println(b));		
	  	
		return books;
	}

}

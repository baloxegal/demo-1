package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import domain.Author;

@Service
public class AuthorServices {
	
	public AuthorServices() {
		
	}
	
	public List<Author> getAuthors(){
		
		List <Author> authors = new ArrayList<>();		
		
		return authors;
	}

}

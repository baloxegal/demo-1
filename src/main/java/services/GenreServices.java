package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import domain.Genre;

@Service
public class GenreServices {
	
	public GenreServices() {
		
	}
	
	public List<Genre> getGenre(){
		
		List<Genre> genres = new ArrayList<>();
		
		return genres;
	}

}

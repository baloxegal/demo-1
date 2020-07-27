package db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import domain.Genre;

@Repository
public interface GenreInterface extends CrudRepository<Genre, Long>  {

}

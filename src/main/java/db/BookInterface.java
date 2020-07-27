package db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import domain.Book;

@Repository
public interface BookInterface extends CrudRepository<Book, Long>  {

}

package db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import domain.Author;

@Repository
public interface AuthorInterface extends CrudRepository<Author, Long> {

}

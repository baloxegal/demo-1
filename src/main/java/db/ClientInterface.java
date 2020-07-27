package db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import domain.Client;

@Repository
public interface ClientInterface extends CrudRepository<Client, Long>  {

}

package in.thiru.repo;

import org.springframework.data.repository.CrudRepository;

import in.thiru.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}

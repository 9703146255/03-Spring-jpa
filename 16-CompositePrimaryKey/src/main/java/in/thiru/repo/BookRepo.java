package in.thiru.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.thiru.entity.Book;
import in.thiru.entity.BookPK;

public interface BookRepo extends JpaRepository<Book, BookPK> {

}

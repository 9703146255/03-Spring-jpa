package in.thiru.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.entity.Book;
import in.thiru.entity.BookPK;
import in.thiru.repo.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	public void saveBook() {
		BookPK pk = new BookPK(101, "spring");

		Book book = new Book("HOWARD", 500.00, pk);

		bookRepo.save(book);

	}
	public void getBooks()
	{
		BookPK Pk=new BookPK(101,"spring");
		
		Optional<Book> findById = bookRepo.findById(Pk);
		if(findById.isPresent())
		{
			System.out.println(findById.get());
		}
		
	}

}

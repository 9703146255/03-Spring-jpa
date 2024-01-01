package in.thiru;
/*
 Object ==> 
 */
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.model.Book;
import in.thiru.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

		BookRepository repository = run.getBean(BookRepository.class);
		System.out.println(repository.getClass().getName());

		
		
		
		
		//save(), saveAll(),findById(),findAllById(),findAll(),existById(),count,deleteById(),deleteAllById(),delete(),deleteAll(Iterable),deleteAll()
//		Book b=new Book();
//		//b.setBookId(10001);
//		b.setBookName("wings of fire");
//		b.setBookPrice(100.00);
//		
//		repository.save(b);

		//or 
		
		
		//01] save()
		// ======================================================================
		// save the data into the database table
//		System.out.println("01]save()");
//		Book b = new Book(100, "adv java", 900.00);
//		repository.save(b);
		
		
		
		

		//02] saveAll() ==>// save the multiple records in the database table
		// ======================================================================
		
//		System.out.println("02]saveAll()");
//		Book b1 = new Book(101, "java", 200.00);
//		Book b2 = new Book(102, "python", 400.00);
//		Book b3 = new Book(103, "cpp", 800.00);
//		Book b4 = new Book(104, "aws", 600.00);
//
//		List<Book> booksList = Arrays.asList(b1, b2, b3, b4);
//		repository.saveAll(booksList);
		
		
		
		
		

		//03] findById()  ==>	// findById ==> retrieve record based on primary key
		// ======================================================================
		
		
//		System.out.println("03]findById()");
//		Optional<Book> getById = repository.findById(104);
//		if (getById.isPresent()) {
//
//			Book book = getById.get();
//			System.out.println("id :: " + book.getBookId());
//			System.out.println("name :: " + book.getBookName());
//			System.out.println("salary :: " + book.getBookPrice());
//		}
		
		
		//or
		
		
		
//		System.out.println("03]findById()");
//		Book book = repository.findById(104).get();
//		System.out.println(book);
		
		
		
		
		
		
		
		
		

		//04] findAllById()
		// ======
		// findAllById ==> retrieve records based on multiple primary key
//		System.out.println("04]findAllById()");
//=====================================================
		
		List<Integer> ids = Arrays.asList(102, 103, 104);

		Iterable<Book> getByIds = repository.findAllById(ids);

		//01]by using lambda expressions
		//getByIds.forEach(s -> System.out.println(s));
		
		
		//02]by using method reference
		//getByIds.forEach(System.out::println);
		
		
		
		//03]for (Book book : getByIds) {System.out.println(book);}
		
		
		//04]by using iterator() method
		//Iterator<Book> iterator = getByIds.iterator();  while(iterator.hasNext()){System.out.println(iterator.next());}
		
		
		//by using spliterator() method
		//getByIds.spliterator().forEachRemaining(s->System.out.println(s));
		
		//getByIds.spliterator().forEachRemaining(System.out::println);
	
		
		
		
		
		
		//05] findAll
		// ============================================================================
		//to get all objects in the db table
	
//		System.out.println("05]findAll()");
//		Iterable<Book> findAll = repository.findAll();
//		findAll.forEach(s->System.out.println(s));
		
		
		
		
		
		
		//06] count()
		// ======
		//count no of records present in the db table
//		System.out.println("06]count()");
//		long count = repository.count();
//		System.out.println("total no of records found in DB Books table is :: "+count);
		
		
		
		
		
		
		
		
		
		//07] deleteById()
		// ======
		//delete the record based on primary key id
//		System.out.println("07]deleteById()");
//		repository.deleteById(103);
		
		
		
		
		
		
		
//		//08]delete multiple records based on the ids
//		System.out.println("08]deleteAllById()");
//		repository.deleteAllById(Arrays.asList(102,103));
		
	
		
		
		
		
//		//09]delete book object
//		repository.delete(b4);
		
		
		
		
		
		
		
//		//10]delete all books
//		repository.deleteAll();
		
		
		
		
		
		
	}

}

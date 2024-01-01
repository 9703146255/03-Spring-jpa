package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.model.Contacts;
import in.thiru.repo.ContactsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		ContactsRepository bean = run.getBean(ContactsRepository.class);
		
		Contacts c=new Contacts();
		c.setContactId(1001);
		c.setContactName("thirumala");
		c.setContactNumber(9234567890L);
		
		bean.save(c);
		
		Iterable<Contacts> findAll = bean.findAll();
		findAll.forEach(s->System.out.println(s));
		
		long count = bean.count();
		System.out.println("total no of records"+count);
		
	}

}

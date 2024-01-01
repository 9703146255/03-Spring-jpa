package in.thiru;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.entity.ContactUs;
import in.thiru.repo.ContactUsRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		ContactUsRepo repo = run.getBean(ContactUsRepo.class);

		ContactUs cu1 = new ContactUs();
		cu1.setcId(1);
		cu1.setcName("vijay");
		cu1.setcEmail("vijju@gmail.com");
		cu1.setPhoneNo(6955151551L);

		ContactUs cu2 = new ContactUs();
		cu2.setcId(2);
		cu2.setcName("kiran");
		cu2.setcEmail("kiran@gmail.com");
		cu2.setPhoneNo(9703146257L);

		ContactUs cu3 = new ContactUs();
		cu3.setcId(3);
		cu3.setcName("bhannnu");
		cu3.setcEmail("bhannnu@gmail.com");
		cu3.setPhoneNo(9564645L);

		ContactUs cu4 = new ContactUs();
		cu3.setcId(4);
		cu4.setcName("chakra");
		cu4.setcEmail("chakra@gmail.com");
	
		
		
		ContactUs cu5 = new ContactUs();
		cu5.setcId(10);
		cu5.setcName("chinnu");
		cu5.setcEmail("chinnu@gmail.com");
		cu5.setPhoneNo(465446546l);

		List<ContactUs> asList = Arrays.asList(cu1, cu2, cu3, cu4, cu5);
		
		repo.saveAll(asList);

	}

}

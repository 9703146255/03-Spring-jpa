package in.thiru;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.entity.OrderDetails;
import in.thiru.repo.OrderDetailsRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

		OrderDetailsRepo repo = run.getBean(OrderDetailsRepo.class);

		OrderDetails os1 = new OrderDetails();
		os1.setOrderBy("thiru");
		os1.setOrderPlacedDate(new Date());
		
		OrderDetails os2 = new OrderDetails();
		os2.setOrderBy("vijay");
		os2.setOrderPlacedDate(new Date());
		
		
		
		
		List<OrderDetails> asList = Arrays.asList(os1,os2);
		
		repo.saveAll(asList);
		
		List<OrderDetails> findAll = repo.findAll();
		findAll.forEach(s->System.out.println(s));
		
		

	}

}

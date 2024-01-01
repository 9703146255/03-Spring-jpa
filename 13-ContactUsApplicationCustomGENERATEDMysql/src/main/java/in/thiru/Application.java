package in.thiru;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.entity.OrderDetails;
import in.thiru.repo.OrderDetailsRepo;
import in.thiru.service.OrderService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

		OrderService bean = run.getBean(OrderService.class);
		OrderDetailsRepo bean2 = run.getBean(OrderDetailsRepo.class);

		bean.saveOrders();

		List<OrderDetails> findAll = bean2.findAll();
		findAll.forEach(s -> System.out.println(s));

	}

}

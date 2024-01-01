package in.thiru;

import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.dto.EmployeeProjectionDto;
import in.thiru.entity.Employee;

import in.thiru.service.EmployeeService;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmployeeService bean = context.getBean(EmployeeService.class);
		
		//bean.insertEmployeeHql(1008, "sales", "male", "vinod", 45000.00);
		
		
		
		bean.insertEmployeeJpql(1009, "farmer", "MALE", "VIJJU", 10000.00);
		
		
		
	}

}

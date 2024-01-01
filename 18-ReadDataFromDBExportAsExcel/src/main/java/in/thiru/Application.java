package in.thiru;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
	
		EmployeeService bean = run.getBean(EmployeeService.class);
		
		bean.exportEmployeesToExcel();
	
	}

}

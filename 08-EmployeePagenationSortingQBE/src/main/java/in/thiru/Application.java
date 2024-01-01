package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
	
	
		EmployeeService service = run.getBean(EmployeeService.class);
		
		//service.saveEmps();
		
		//service.empSort("empSal");
		
		//service.empPagingation(4, 2);//pagesize(no of records),pageNo1,2,3

		service.empQBE();
	}

}

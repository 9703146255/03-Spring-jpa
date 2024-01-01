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
		
		
		
		//service.getEmpName("thiru");
		
		
		//service.getByEmpDeptName("Sales");
		
		
		//service.getByEmpNameAndEmpDept("thiru", "Sales");
		
		//service.getById(101);
		//service.getAllEmps();
		
		service.getEmpsByName("jhon");
		
		//service.getSalGreater(19000.00);
		
		
		
	}

}

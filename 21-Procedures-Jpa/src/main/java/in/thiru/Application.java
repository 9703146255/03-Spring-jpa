package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import in.thiru.service.EmployeeService;

@SpringBootApplication
@EnableJpaRepositories
public class Application {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
	
	
		EmployeeService bean = run.getBean(EmployeeService.class);
//		bean.callEmpProcedure();
	
	
		bean.callingSp();
		
	}

}

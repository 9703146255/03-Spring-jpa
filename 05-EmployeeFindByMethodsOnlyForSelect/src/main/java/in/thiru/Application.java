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
		
		
		//findBy	==>	  methods	[findBy,getBy,readBy,queryBy][we can perform only select opertions
		//=======================================================
		
		//service.getEmpName("John Doe");	
		
		
		//service.getByEmpDeptName("Engineering");
		
		
		//service.getByEmpNameAndEmpDept("jhon", "Sales");
		
		//service.getSalGreater(19000.00);
		
		//service.readBySalBetween(50000.00, 60000.00);
		
		//service.readByOrderByEmpSal();
		
		
		
		
		//custome queries
		//===============
		
		//service.getById(101);
		//service.getAllEmps();
		
		
		
		
		
	}

}

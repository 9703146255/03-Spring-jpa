package in.thiru.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.thiru.model.Employee;
import in.thiru.service.EmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner {

	private EmployeeService empService;

	public EmployeeRunner(EmployeeService empService)
	{

		this.empService = empService;
	}

	@Override
	public void run(String... args) throws Exception {

//		empService.saveEmp();
//		empService.saveEmps();
		
//		empService.getMultipleEmps();
//		empService.getEmp();
//		empService.getAllEmps();
		
		
//		empService.countEmp();
//		empService.checkEmp();
		
		
//		empService.deleteAllEmps();
//		empService.deleteByEmpId();
//		empService.deleteByEmpIds();
//		empService.deleteByEntity(new Employee());
	}

}

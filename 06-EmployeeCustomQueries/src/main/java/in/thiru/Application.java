package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.entity.Employee;
import in.thiru.repo.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmpRepository empRepo = context.getBean(EmpRepository.class);
		
		
//		//get all the employees
//		List<Employee> allEmps = empRepo.getAllEmps();
//		allEmps.forEach(System.out::println);
		
		
		
		//get all emmployee by id
		
//		Employee byEmpId = empRepo.getByEmpId(101);
//		System.out.println(byEmpId);
		
		
		
//		//get employees by native query or Sql query
//		
//		List<Employee> empsSql = empRepo.getEmpsSql();
//		empsSql.forEach(s->System.out.println(s));
		
		
		
		//delete emplyee by id
		//empRepo.deleteEmpById(105);
		
		//empRepo.deleteEmp(104);
		
//		 List<Employee> allEmps = empRepo.getAllEmps();
//		allEmps.forEach(s->System.out.println(s));
		
		
		//empRepo.updateEmphql(102,"charan singh");
		
		
		//empRepo.updateEmpsql(103, "GOLLA THIRUMALESH");
		
	//	empRepo.insertEmployee(10,"kiran", 1000.00);
		
		
		empRepo.insertEmployee("engineering", "Female", "kiravani", 1000.00);
		
		
		
	}

}

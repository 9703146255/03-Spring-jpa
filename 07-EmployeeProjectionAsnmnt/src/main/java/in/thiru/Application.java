package in.thiru;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.entity.Employee;
import in.thiru.repo.EmployeeRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
	
	
	
		EmployeeRepo bean = run.getBean(EmployeeRepo.class);
		
//	     Employee3 emp1=new Employee3();
//	     emp1.setEmpName("kiran");
//	     emp1.setEmpSal(2000.00);
//	     emp1.setEmpAdd("hyd");
//	     
//	     
//	     Employee3 emp2=new Employee3();
//	     emp2.setEmpName("thiru");
//	     emp2.setEmpSal(1000.00);
//	     emp2.setEmpAdd("chennai");
//	     
//	     
//	     List<Employee3> asList = Arrays.asList(emp1,emp2);
//	     
//	     List<Employee3> saveAll = bean.saveAll(asList);
//	     
//	     System.out.println("record inserted....");
//	     
//	     saveAll.forEach(s->System.out.println(s));
	     
	     
	     
	     
	     //===================================================
	     List<Object[]> empNameAndSalary = bean.getEmpNameAndSalary();
	     for (Object[] objects : empNameAndSalary)
	     {
			for (Object objects2 : objects) 
			{
				System.out.println(objects2);
			}
		 }
	     
	     
	     
	
	
	
	
	}

}

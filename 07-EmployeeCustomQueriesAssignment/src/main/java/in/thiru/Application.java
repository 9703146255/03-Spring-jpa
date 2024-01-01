package in.thiru;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.dto.EmployeeProjectionDto;
import in.thiru.entity.Employee;
import in.thiru.repo.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmpRepository empRepo = context.getBean(EmpRepository.class);
		

		
		 
		
		//01]insert the query by using data jpa
		//==========================================================================================================
		//empRepo.insertEmployee(1006,"MARKETING", "MALE", "KRANTHI", 100005.00);
		
		
		
		
		
		//02]select two columns
		//==========================================================================================================
//		List<EmployeeProjectionDto> nameAndDeptHql = empRepo.getNameAndDeptHql(101);
//		System.out.println(nameAndDeptHql);
		
		
		
		
		
		//03] update the data 
		//==========================================================================================================
//		empRepo.updateEmpsql(101, "jhon");	
//		List<EmployeeProjectionDto> nameAndDeptHqlAll = empRepo.getNameAndDeptHqlAll();
//		nameAndDeptHqlAll.forEach(s->System.out.println(s));
		
		
		
		
		
		
		
		
		
		
//		List<Object[]> nameAndDeptHqlAll = empRepo.getNameAndDeptHqlAll();  //XXXXXXXXXXXXXXXXXXXXXXX[MANDATORY FOR BELOW USING
//		
//		
//		nameAndDeptHqlAll.forEach(s->System.out.println(s));


		
		//method-1] Retrieve [using for each loop]
		//=============================================
//		for (Object[] objects : nameAndDeptHqlAll) {
//			
//			System.out.println(objects[0]+" : "+objects[1]);
//		}
		
		
		
		
		
		//method-2] Retrieve  [Using enhanced for loop]
		//===============================================
//		for (Object[] objects : nameAndDeptHqlAll) {
//		    System.out.println(objects[0] + " : " + objects[1]);
//		}

		
		
		
		//  method-3]Retrieve (Using Java Streams)
		//=============================================
//		nameAndDeptHqlAll.stream()
//		    .map(objects -> objects[0] + " : " + objects[1])
//		    .forEach(System.out::println);
		
		
		
		
		
	}

}

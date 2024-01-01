package in.thiru.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import in.thiru.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{

	  // You can define custom query methods here if needed
	
//	   @Query(nativeQuery = true, value = "call employee_procedure()")
//	    List<Employee> getAllEmployees();
	   
	   @Procedure("employee_procedure")
	   List<Employee> getAllEmployees();

}

package in.thiru.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import in.thiru.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{

	  // You can define custom query methods here if needed
	
	 @Procedure("employee_procedure1")
	   void callEmployeeProcedure();

}

package in.thiru.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.thiru.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	@Query("select empName,empSal From Employee ")
	 List<Object[]> getEmpNameAndSalary();

}

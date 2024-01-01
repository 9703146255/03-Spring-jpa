package in.thiru.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.thiru.dto.EmployeeDto;
import in.thiru.entity.Employee3;

public interface EmployeeRepo extends JpaRepository<Employee3, Integer> {
	
//	@Query("select e.empName,e.empSal From Employee3 e")
//	 List<Object[]> getEmpNameAndSalary();
	
	
	
	@Query("select new in.thiru.dto.EmployeeDto(e.empName,e.empSal) From Employee3 e")
	 List<EmployeeDto> getEmpNameAndSalary();
	
	

}

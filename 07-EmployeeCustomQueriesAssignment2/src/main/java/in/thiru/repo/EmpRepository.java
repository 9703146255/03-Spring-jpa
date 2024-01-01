package in.thiru.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.thiru.dto.EmployeeProjectionDto;
import in.thiru.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

public interface EmpRepository extends JpaRepository<Employee, Integer>
{

	
	
	 
//
//	//===================================================================================================
////	//01]insert the query by using data jpa
//	//===================================================================================================
//
//	
////BY USING SQL QUERIES
////====================
////	@Transactional
////	@Modifying
////	@Query(value = "INSERT INTO emp_table (emp_id, emp_dept, emp_gender, emp_name, emp_salary) VALUES (:id, :dept, :gender, :name, :salary)", nativeQuery = true)
////	void insertEmployee(@Param("id") Integer id,@Param("dept") String dept,@Param("gender") String gender,@Param("name") String name, @Param("salary") Double salary);
//	
//	//or
//	
//	
////	@Transactional
////	@Modifying
////	@Query(value = "INSERT INTO emp_table (emp_id, emp_dept, emp_gender, emp_name, emp_salary) VALUES (:id, :dept, :gender, :name, :salary)", nativeQuery = true)
////	void insertEmployee(Integer id, String dept, String gender, String name, Double salary);
//
//	
//	
//
//
//	
//	
//
////	@Modifying
////	@Transactional
////	@Query(value = "update emp_table set emp_name=:empName where emp_id =:empId", nativeQuery = true)
////	public void updateEmpsql(Integer empId, String empName);
////	
////	
////	
////	@Query("SELECT new in.thiru.dto.EmployeeProjectionDto(e.empName, e.empDept) FROM Employee e WHERE e.empId = :empId")
////	List<EmployeeProjectionDto> getNameAndDeptHql(@Param("empId") Integer empId);
////
////	
////	
//////	@Query("SELECT new in.thiru.dto.EmployeeProjectionDto(e.empName, e.empDept) FROM Employee e")
//////	List<EmployeeProjectionDto> getNameAndDeptHqlAll();
////	 
////	
	@Query("SELECT e.empName, e.empDept FROM Employee e")
	List<Object[]> getNameAndDeptHqlAll();
}

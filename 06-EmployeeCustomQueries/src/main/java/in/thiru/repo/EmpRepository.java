package in.thiru.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import in.thiru.dto.EmployeeProjectionDto;
import in.thiru.entity.Employee;
import jakarta.transaction.Transactional;

public interface EmpRepository extends JpaRepository<Employee, Integer>
{

	
	
	
	
	//CUSTOM QUERIES
	//=============
	//HQL Queries
	
	//01
	@Query("select empName,empId from Employee")
	public List<Employee> getAllEmps();
	
	//02
	//SQL QUERY
	@Query(value = "select * from emp_table", nativeQuery = true)
	public List<Employee> getEmpsSql();
	
	//HQL QUERY
	@Query("select empId, empName from Employee where empId =:id")
	public Employee getByEmpId(Integer id);
	

	@Modifying
	@Transactional
	@Query("delete From Employee where empId=:empId")
	public void deleteEmp(Integer empId);
	
	
	
	
	
	@Modifying
	@Transactional
	@Query("update Employee set empName=:empName where empId =:empId ")
	public void updateEmphql(Integer empId, String empName);
	
	
	@Modifying
	@Transactional
	@Query(value = "update emp_table set emp_name=:empName where emp_id =:empId", nativeQuery = true)
	public void updateEmpsql(Integer empId, String empName);
	
	
	
	@Query("select new in.thiru.repo empName, empDept From Employee")
    public void getNameAndDepthql(String empName, String empDept);
  
	
	
	
//	 @Query("SELECT new in.thiru.dto.EmployeeNameAndDeptDto(e.empName, e.empDept) FROM Employee e WHERE e.empId = :empId")
//	    List<EmployeeNameAndDeptDto> getNameAndDeptHql(@Param("empId") Long empId);


	@Modifying
	@Query(value = "INSERT INTO emp_table (emp_dept, emp_gender, emp_name, emp_salary) VALUES (:dept, :gender, :name, :salary)", nativeQuery = true)
	void insertEmployee(@Param("dept") String dept,@Param("gender") String gender,@Param("name") String name, @Param("salary") Double salary);
	


	
	

	
	
	
}

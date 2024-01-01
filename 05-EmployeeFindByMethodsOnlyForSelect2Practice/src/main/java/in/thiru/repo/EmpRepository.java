package in.thiru.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.thiru.entity.Employee;

public interface EmpRepository extends CrudRepository<Employee, Integer>
{

	
	
	//findByXXXXXX() methods
	//==========================
	//retrive non-primary key column than we can use findByXXXX() METHOD
	
	//?==> positional parameter ;; it is used to assign the values at run time
	
	//:=  ==> named parameter which is used to assign the values at run time
	
	
	//findByEmpNameAndEmpDept ==> we must pass in method first as empName, second should be empDept[dont put reverse]
	
	
	
	//select * from emp_table where empName= :name ;
	public List<Employee> findByEmpName(String name);
	
	
	//select * from emp_table where deptName =: dept;
	public List<Employee> findByEmpDept(String dept);
	
	
	//select * from emp_table where empName= :name And deptName =: dept;
	public List<Employee> findByEmpNameAndEmpDept(String name, String dept);
	
	//select * from emp_table where empSalary >=: salary
	public List<Employee> findByEmpSalaryGreaterThanEqual(Double salary);
	
	//CUSTOM QUERIES
	//=============
	
	
	@Query("from Employee")
	public List<Employee> getAllEmps();
	
	
	@Query("from Employee where empId =:id")
	public Employee getByEmpId(Integer id);
	
	@Query("From Employee where empName =:empName")
	public List<Employee> getEmpsByName(String string);
	
	
	
	
	
	
}

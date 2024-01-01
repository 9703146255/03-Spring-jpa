package in.thiru.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.thiru.entity.Employee;
import in.thiru.repo.EmpRepository;

@Service
public class EmployeeService {

	private EmpRepository empRepository;

	public EmployeeService(EmpRepository empRepository) {

		this.empRepository = empRepository;
	}

	
	
	
	
	
	
	//CUSOME QUERIES
	//THESE IS TWO TYPES
	//1) Sql 2) Hql 
	//=====================================================================
	
	
	public void getAllEmps()
	{
		List<Employee> allEmps = empRepository.getAllEmps();
		
		allEmps.forEach(s->System.out.println(s));
	}
	
	
	public void getById(Integer id)
	{
		Employee byEmpId = empRepository.getByEmpId(id);
		
		System.out.println(byEmpId);
	}
	
	public void getEmpsByName(String empName)
	{
		 List<Employee> empsByName = empRepository.getEmpsByName(empName);
		 empsByName.forEach(s->System.out.println(s));

	}
	
	
	
	
	
	//findByXXXXXXXXXXXXXXX() METHODS
	//===============================
	public void getEmpName(String empName) {
		List<Employee> getEmpNameVar = empRepository.findByEmpName(empName);

		getEmpNameVar.forEach(System.out::println);
	}

	
	
	public void getByEmpDeptName(String dept) {
		List<Employee> getByEmpDeptNameVar = empRepository.findByEmpDept(dept);
		getByEmpDeptNameVar.forEach(System.out::println);

	}
	
	
	
	public void getByEmpNameAndEmpDept(String empName,String empDept)
	{
		List<Employee> getByEmpNameAndEmpDeptVar = empRepository.findByEmpNameAndEmpDept(empName, empDept);
	
		getByEmpNameAndEmpDeptVar.forEach(s->System.out.println(s));
	}
	
	
	
	public void getSalGreater(Double salary)
	{
		List<Employee> findByEmpSalaryGreaterThanEqualvar = empRepository.findByEmpSalaryGreaterThanEqual(salary);
	
		findByEmpSalaryGreaterThanEqualvar.forEach(s->System.out.println(s));
	}

}

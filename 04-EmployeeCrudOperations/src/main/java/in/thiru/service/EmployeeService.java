package in.thiru.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import in.thiru.entity.Employee;
import in.thiru.repo.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) 
	{

		this.employeeRepository = employeeRepository;
	}
	
	
	public void saveEmps()
	{
		Employee emp1=new Employee();
		emp1.setEmpId(101);
		emp1.setEmpName("thiru");
		emp1.setEmpGender("Male");
		emp1.setEmpDept("Sales");
		emp1.setEmpSalary(10000.00);
		
		
		Employee emp2=new Employee();
		emp2.setEmpId(102);
		emp2.setEmpName("charan");
		emp2.setEmpGender("Male");
		emp2.setEmpDept("IT");
		emp2.setEmpSalary(20000.00);
		
		
		Employee emp3=new Employee();
		emp3.setEmpId(103);
		emp3.setEmpName("thiru");
		emp3.setEmpGender("Male");
		emp3.setEmpDept("Sales");
		emp3.setEmpSalary(25000.00);
		
		
		Employee emp4=new Employee();
		emp4.setEmpId(104);
		emp4.setEmpName("sandhy");
		emp4.setEmpGender("Famale");
		emp4.setEmpDept("Sales");
		emp4.setEmpSalary(10000.00);
		
		
		List<Employee> saveEmpList = Arrays.asList(emp1,emp2,emp3,emp4);
		
		
		employeeRepository.saveAll(saveEmpList);
		
		
	}

}

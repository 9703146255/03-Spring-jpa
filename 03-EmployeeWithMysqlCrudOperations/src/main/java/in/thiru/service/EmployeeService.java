package in.thiru.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.thiru.model.Employee;
import in.thiru.repo.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository empRepo;

	public EmployeeService(EmployeeRepository empRepo) {

		this.empRepo = empRepo;
	}

	public void getAllEmps() {
		Iterable<Employee> allEmps = empRepo.findAll();
		allEmps.forEach(s -> System.out.println(s));

	}

	public void getMultipleEmps() {
		Iterable<Employee> mulEmps = empRepo.findAllById(Arrays.asList(2, 3, 4));

		mulEmps.forEach(s -> System.out.println(s));
	}

	public void getEmp() {
		Optional<Employee> getId = empRepo.findById(2);
		if (getId.isPresent()) {
			Employee employee = getId.get();
			System.out.println(employee.getEmpId());
			System.out.println(employee.getEmpName());
			System.out.println(employee.getEmpDept());
			System.out.println(employee.getEmpGender());
			System.out.println(employee.getEmpSal());
		}
	}

	public void saveEmp() {

		Employee emp1 = new Employee();
		emp1.setEmpId(1);
		emp1.setEmpName("thirumalesh");
		emp1.setEmpDept("software");
		emp1.setEmpGender("male");
		emp1.setEmpSal(10000.00);

		empRepo.save(emp1);
	}

	public void saveEmps() {

		Employee emp2 = new Employee();
		emp2.setEmpId(2);
		emp2.setEmpName("vinay");
		emp2.setEmpDept("sales");
		emp2.setEmpGender("male");
		emp2.setEmpSal(20000.00);

		Employee emp3 = new Employee();
		emp3.setEmpId(3);
		emp3.setEmpName("charan");
		emp3.setEmpDept("java developer");
		emp3.setEmpGender("male");
		emp3.setEmpSal(30000.00);

		Employee emp4 = new Employee();
		emp4.setEmpId(4);
		emp4.setEmpName("vijay");
		emp4.setEmpDept("python");
		emp4.setEmpGender("male");
		emp4.setEmpSal(50000.00);

		Employee emp5 = new Employee();
		emp5.setEmpId(5);
		emp5.setEmpName("sanjay");
		emp5.setEmpDept("software");
		emp5.setEmpGender("male");
		emp5.setEmpSal(15000.00);

		empRepo.saveAll(Arrays.asList(emp2, emp3, emp4, emp5));

	}

	public void countEmp() 
	{
		long count = empRepo.count();
		System.out.println("no of employees in a emp table is :: " + count);
	}

	public void checkEmp() 
	{
		boolean checkId = empRepo.existsById(1);
		System.out.println("check given employee present or not ::" + checkId);
	}

	public void deleteAllEmps() 
	{
		empRepo.deleteAll();
	}

	public void deleteByEmpId() 
	{
		empRepo.deleteById(4);
	}

	public void deleteByEmpIds() 
	{
		List<Integer> empIds = Arrays.asList(2, 3);

		empRepo.deleteAllById(empIds);

	}
	
	public void deleteByEntity(Employee emp)
	{
		empRepo.delete(emp);
	}

}

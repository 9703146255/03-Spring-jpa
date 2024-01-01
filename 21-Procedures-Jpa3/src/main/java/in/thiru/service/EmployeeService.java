package in.thiru.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.entity.Employee;
import in.thiru.repo.EmployeeRepo;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;

	@Transactional
	public void callEmpProcedure() {

		List<Employee> allEmployees = empRepo.getAllEmployees();
		allEmployees.forEach(s->System.out.println(s));
	}
}

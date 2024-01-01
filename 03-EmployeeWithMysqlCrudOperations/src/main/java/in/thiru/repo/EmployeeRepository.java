package in.thiru.repo;

import org.springframework.data.repository.CrudRepository;

import in.thiru.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}

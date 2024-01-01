package in.thiru.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.thiru.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}

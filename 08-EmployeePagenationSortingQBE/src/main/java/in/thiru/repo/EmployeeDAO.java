package in.thiru.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.thiru.entity.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer>
{

}

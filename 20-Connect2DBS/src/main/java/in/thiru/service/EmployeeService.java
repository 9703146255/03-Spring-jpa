package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.thiru.entity.Employee;
import jakarta.persistence.EntityManager;

@Service
public class EmployeeService {
	
	@Autowired
    @Qualifier("mysqlEntityManagerFactory")
    private EntityManager entityManager;

    public void saveEmployee(Employee employee) {
        entityManager.persist(employee);
    }



}

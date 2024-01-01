package in.thiru.service;

import org.springframework.stereotype.Service;

import in.thiru.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	
	
	
	
	
	  @PersistenceContext
	  private EntityManager entityManager;
	  
	  
//HQL[BY USING HQL QUERY]
 //=======================================
	  
	    @Transactional
	    public void insertEmployeeHql(Integer id, String dept, String gender, String name, Double salary) {
	        Employee employee = new Employee(id, name, gender, dept, salary);
	        entityManager.persist(employee);
	    }
	    
	    
	    @Transactional
	    public void insertEmployeeJpql(Integer id, String dept, String gender, String name, Double salary) {
	        entityManager.createQuery(
	                "INSERT INTO Employee(empId, empDept, empGender, empName, empSalary) " +
	                        "VALUES (:id, :dept, :gender, :name, :salary)")
	                .setParameter("id", id)
	                .setParameter("dept", dept)
	                .setParameter("gender", gender)
	                .setParameter("name", name)
	                .setParameter("salary", salary)
	                .executeUpdate();
	    }
	  

}

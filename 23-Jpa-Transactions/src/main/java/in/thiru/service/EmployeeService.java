package in.thiru.service;

import org.springframework.stereotype.Service;

import in.thiru.entity.Address;
import in.thiru.entity.Employee;
import in.thiru.repo.AddressRepo;
import in.thiru.repo.EmployeeRepo;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

	private EmployeeRepo empRepo;
	private AddressRepo addRepo;

	public EmployeeService(EmployeeRepo empRepo, AddressRepo addRepo) {

		this.empRepo = empRepo;
		this.addRepo = addRepo;
	}
	
	
	//@Transactional(rollbackOn = Exception.class)  		==> roll back
	//@Transactional(dontRollbackOn = Exception.class) 		==>not roll back
	//@Transactional										==> roll back
	public void saveData()
	{
		
		Employee emp=new Employee();
		emp.setEmpName("chethan");
		emp.setEmpSal(35000.00);	
		
		Employee save = empRepo.save(emp);
		System.out.println(save);
		
		
		int num=10/0;
		
		
		Address address=new Address();
		address.setCountry("IND");
		address.setState("jaipur");
		address.setType("office");
		address.setEmpId(save.getEmpId());
		
		
		Address save2 = addRepo.save(address);
		System.out.println(save2);
		
		
	}

}

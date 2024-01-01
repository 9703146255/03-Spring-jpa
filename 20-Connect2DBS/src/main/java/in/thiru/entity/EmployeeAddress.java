package in.thiru.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class EmployeeAddress 
{

	@Id
	@GeneratedValue
	private Integer empId;
	private String empAddress;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	
	
	public EmployeeAddress() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeAddress(Integer empId, String empAddress) {
		
		this.empId = empId;
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "EmployeeAddress [empId=" + empId + ", empAddress=" + empAddress + "]";
	}
	
	
}

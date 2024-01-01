package in.thiru.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_table1")
public class Employee
{

	@Id
	private Integer empId;
	private String empName;
	private Double empSal;
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	public Employee(Integer empId, String empName, Double empSal) 
	{
		
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	
	public Employee() {
	}
	
	
}

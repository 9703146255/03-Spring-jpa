package in.thiru.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_db1")
public class Employee {

	@Id
	@GeneratedValue
	private Integer empId;
	private String empName;
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
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empId, String empName) {
	
		this.empId = empId;
		this.empName = empName;
	}
	
}

package in.thiru.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_table")
public class Employee
{

	@Id
	private Integer empId;
	private String empName;
	private String empGender;
	private String empDept;
	private Double empSalary;
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
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public Employee(Integer empId, String empName, String empGender, String empDept, Double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empGender = empGender;
		this.empDept = empDept;
		this.empSalary = empSalary;
	}
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empGender=" + empGender + ", empDept=" + empDept
				+ ", empSalary=" + empSalary + "]";
	}
	
	
	
}

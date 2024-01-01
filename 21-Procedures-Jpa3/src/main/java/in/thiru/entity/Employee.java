package in.thiru.entity;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "emp_table")
public class Employee {

	@Id
	@GeneratedValue
	private Integer empId;
	private String empName;
	private Double empSal;

	@Column(length = 1048576)
	private byte[] empImage;

	public Employee(Integer empId, String empName, Double empSal, byte[] empImage) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empImage = empImage;
	}

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

	public byte[] getEmpImage() {
		return empImage;
	}

	public void setEmpImage(byte[] empImage) {
		this.empImage = empImage;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empImage="
				+ Arrays.toString(empImage) + "]";
	}
	
	

}

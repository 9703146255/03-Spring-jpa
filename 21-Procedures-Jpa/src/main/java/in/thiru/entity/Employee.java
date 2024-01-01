package in.thiru.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="emp_table")
public class Employee 
{

	@Id
	@GeneratedValue
	private Integer empId;
	private String empName;
	private Double empSal;
	
	@Column(length = 1048576)
	private  byte[] empImage;
	
	
	
}

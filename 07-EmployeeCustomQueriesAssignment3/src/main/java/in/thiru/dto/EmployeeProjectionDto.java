package in.thiru.dto;

public class EmployeeProjectionDto {
	
	 private String empName;
	 private String empDept;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
	public EmployeeProjectionDto(String empName, String empDept) {
		
		this.empName = empName;
		this.empDept = empDept;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeProjectionDto [empName=" + empName + ", empDept=" + empDept + "]";
	}
	 
	 
	 
	 

}

package in.thiru.dto;

public class EmployeeDto {
	
	private String empName;
	private Double empSal;
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
		return "EmployeeDto [empName=" + empName + ", empSal=" + empSal + "]";
	}
	public EmployeeDto(String empName, Double empSal) {
		super();
		this.empName = empName;
		this.empSal = empSal;
	}
	
	
	public EmployeeDto() {
		// TODO Auto-generated constructor stub
	}

}

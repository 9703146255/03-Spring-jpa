package in.thiru.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	private String studentName;
	private Double studentFee;
	private String studentEmail;
	private Long studentMobile;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Double getStudentFee() {
		return studentFee;
	}

	public void setStudentFee(Double studentFee) {
		this.studentFee = studentFee;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public Long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Student(Integer studentId, String studentName, Double studentFee, String studentEmail, Long studentMobile) {

		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFee = studentFee;
		this.studentEmail = studentEmail;
		this.studentMobile = studentMobile;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + studentFee
				+ ", studentEmail=" + studentEmail + ", studentMobile=" + studentMobile + "]";
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

}

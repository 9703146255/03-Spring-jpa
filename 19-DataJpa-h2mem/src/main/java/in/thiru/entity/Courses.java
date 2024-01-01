package in.thiru.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer courseId;
	private String courseName;
	private Double courseCost;

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Double getCourseCost() {
		return courseCost;
	}

	public void setCourseCost(Double courseCost) {
		this.courseCost = courseCost;
	}

	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + ", courseCost=" + courseCost + "]";
	}

	public Courses(Integer courseId, String courseName, Double courseCost) {

		this.courseId = courseId;
		this.courseName = courseName;
		this.courseCost = courseCost;
	}

	public Courses() {
		// TODO Auto-generated constructor stub
	}

}

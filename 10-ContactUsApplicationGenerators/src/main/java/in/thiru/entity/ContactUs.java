package in.thiru.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ContactUs 
{
	@Id
	@GeneratedValue
	private Integer cId;
	private String cName;
	private String cEmail;
	private Long PhoneNo;
	
	@CreationTimestamp
	@Column(name = "created_date", updatable = false )
	private LocalDateTime createdDate;
	
	
	@UpdateTimestamp
	@Column(name="update_date", insertable = false  )
	private LocalDateTime updateDate;
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public Long getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		PhoneNo = phoneNo;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	
	
	
	
	

}

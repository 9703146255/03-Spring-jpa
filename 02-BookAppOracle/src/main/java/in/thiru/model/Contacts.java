package in.thiru.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Contacts 
{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer contactId;
	private String contactName;
	private Long contactNumber;
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Contacts [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber=" + contactNumber
				+ "]";
	}
	
	

}

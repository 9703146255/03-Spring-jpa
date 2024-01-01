package in.thiru.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_addrs_TBL111")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	private String country;
	private String state;
	private String type;

	private Integer empId;

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Address(Integer addressId, String country, String state, String type, Integer empId) {
	
		this.addressId = addressId;
		this.country = country;
		this.state = state;
		this.type = type;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", country=" + country + ", state=" + state + ", type=" + type
				+ ", empId=" + empId + "]";
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}

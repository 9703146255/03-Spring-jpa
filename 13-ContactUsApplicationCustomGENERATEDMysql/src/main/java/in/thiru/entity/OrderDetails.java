package in.thiru.entity;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
public class OrderDetails {

	@Id
	private String orderId;
	private String orderBy;
	private Date orderPlacedDate;

}

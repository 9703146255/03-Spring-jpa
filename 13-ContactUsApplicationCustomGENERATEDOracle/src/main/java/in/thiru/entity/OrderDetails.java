package in.thiru.entity;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
public class OrderDetails {
	
	
	@Id
	@GenericGenerator(name="order_id_gen", strategy = "in.thiru.generator.OrderIdGenerator")
	@GeneratedValue(generator ="order_id_gen")
	@Column(name="custom_id")
	private String orderId;
	private String orderBy;
	private Date orderPlacedDate;

	
	
	

}

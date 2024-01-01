package in.thiru.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/*

 @GeneratedValue(strategy = GenerationType.UUID)
 IF YOU WANT TO GENERATE UNIQUE ALPA-NUMERIC VALUE THEN WE SHOULD USE ==> UUID
 
 */
@Entity
@Data
public class Mobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String mobileId;
	private String mobileName;
	private Double mobilePrice;
	private String mobileShop;
	
	
	

}



/*
 
@Getter:

Generates getter methods for all non-static fields in the class.
@Setter:

Generates setter methods for all non-final fields in the class.
@NoArgsConstructor:

Generates a no-argument constructor.
@AllArgsConstructor:

Generates a constructor with parameters for all fields in the class.
@ToString:

Generates a toString() method that includes the class name and the values of all fields.
@EqualsAndHashCode:

Generates equals() and hashCode() methods based on the fields of the class.
*/
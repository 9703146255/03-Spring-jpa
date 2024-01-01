package in.thiru.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
	
	
	
	private String shopName;
	private String shopLocation;
	
	@EmbeddedId
	private ShopPk shopPk;
	
	
	
	

}

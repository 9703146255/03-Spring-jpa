package in.thiru.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Sequence {
	@Id
	private String id;
	private Long value;

}

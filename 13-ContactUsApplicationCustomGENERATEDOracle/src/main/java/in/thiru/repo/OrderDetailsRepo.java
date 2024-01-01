package in.thiru.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.thiru.entity.OrderDetails;

public interface OrderDetailsRepo extends JpaRepository<OrderDetails, Integer>
{

}

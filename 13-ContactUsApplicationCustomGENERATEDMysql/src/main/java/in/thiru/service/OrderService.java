package in.thiru.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.entity.OrderDetails;
import in.thiru.repo.OrderDetailsRepo;
import jakarta.transaction.Transactional;

@Service
public class OrderService {

	@Autowired
	private SequenceService sequenceService;

	@Autowired
	private OrderDetailsRepo orderRepository;

	@Transactional
	public void saveOrders() {
		OrderDetails order1 = new OrderDetails();
		order1.setOrderId(sequenceService.getNextOrderId());
		order1.setOrderBy("thirumalesh");
		order1.setOrderPlacedDate(new Date());

		// Set other order details as needed
		OrderDetails order2 = new OrderDetails();
		order2.setOrderId(sequenceService.getNextOrderId());
		order2.setOrderBy("kiran");
		order2.setOrderPlacedDate(new Date());

		OrderDetails order3 = new OrderDetails();
		order3.setOrderId(sequenceService.getNextOrderId());
		order3.setOrderBy("vinay");
		order3.setOrderPlacedDate(new Date());

		OrderDetails order4 = new OrderDetails();
		order4.setOrderId(sequenceService.getNextOrderId());
		order4.setOrderBy("chandu");
		order4.setOrderPlacedDate(new Date());

		List<OrderDetails> asList = Arrays.asList(order1, order2, order3, order4);

		orderRepository.saveAll(asList);
	}

}

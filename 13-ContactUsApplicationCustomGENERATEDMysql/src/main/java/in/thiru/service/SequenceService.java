package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.entity.Sequence;
import in.thiru.repo.SequenceRepo;
import jakarta.transaction.Transactional;

@Service
public class SequenceService {

	@Autowired
	private SequenceRepo sequenceRepository;

	// Retrieve the sequence entity from the database with the id "ORDER_ID"
	@Transactional
	public String getNextOrderId() {

		Sequence sequence = sequenceRepository.findById("ORDER_ID").orElseGet(() -> {
			// If the sequence does not exist, create a new one
			// first time is not availabe thats why we need to create by using orElseGet()
			// method
			Sequence newSequence = new Sequence();
			newSequence.setId("ORDER_ID");
			newSequence.setValue(1L);
			return sequenceRepository.save(newSequence);
		});

		// Get the current value from the sequence
		Long nextValue = sequence.getValue();

		sequence.setValue(nextValue + 1);
		// Save the updated sequence entity back to the database
		sequenceRepository.save(sequence);

		// Format the value as "OD" + three-digit format
		String formattedValue = String.format("%03d", nextValue);

		// Concatenate the "OD" prefix with the formatted numeric value
		return "OD" + formattedValue;
	}
}

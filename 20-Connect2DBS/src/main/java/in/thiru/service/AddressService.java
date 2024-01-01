package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;

@Service
public class AddressService {

    @Autowired
    @Qualifier("h2EntityManagerFactory")
    private EntityManager entityManager;

    public void saveAddress(Address address) {
        entityManager.persist(address);
    }
}

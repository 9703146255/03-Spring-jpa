package in.thiru.repo;

import org.springframework.data.repository.CrudRepository;

import in.thiru.model.Contacts;

public interface ContactsRepository extends CrudRepository<Contacts, Integer>{

}

package in.thiru.repo;

import org.springframework.data.repository.CrudRepository;

import in.thiru.entity.Sequence;

public interface SequenceRepo extends CrudRepository<Sequence, String>
{

}

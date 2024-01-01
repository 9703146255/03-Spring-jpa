package in.thiru.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.thiru.entity.Vegetables;

public interface VegetableRepo extends JpaRepository<Vegetables, Integer> {

}

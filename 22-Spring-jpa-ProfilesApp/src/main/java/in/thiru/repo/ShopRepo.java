package in.thiru.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.thiru.entity.Shop;
import in.thiru.entity.ShopPk;

public interface ShopRepo extends JpaRepository<Shop, ShopPk>{

}

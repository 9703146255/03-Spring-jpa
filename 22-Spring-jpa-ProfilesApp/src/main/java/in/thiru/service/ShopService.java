package in.thiru.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.entity.Shop;
import in.thiru.entity.ShopPk;
import in.thiru.repo.ShopRepo;

@Service
public class ShopService {

	@Autowired
	private ShopRepo shopRepo;

	public void saveShopData() {

		ShopPk pk1 = new ShopPk(101, "ABC-HYD");
		ShopPk pk2 = new ShopPk(102, "ABC-HYD");
		ShopPk pk3 = new ShopPk(103, "ABC-HYD");
		ShopPk pk4 = new ShopPk(104, "ABC-HYD");
		ShopPk pk5 = new ShopPk(105, "ABC-HYD");

		Shop shop1 = new Shop("Flipkart", "Delhi", pk1);
		Shop shop2 = new Shop("Flipkart", "Delhi", pk2);
		Shop shop3 = new Shop("Flipkart", "Delhi", pk3);
		Shop shop4 = new Shop("Flipkart", "Delhi", pk4);
		Shop shop5 = new Shop("Flipkart", "Delhi", pk5);

		List<Shop> asList = Arrays.asList(shop1, shop2, shop3, shop4, shop5);
		List<Shop> saveAll = shopRepo.saveAll(asList);

		System.out.println("records inserted...");

		System.out.println(saveAll);

	}

}

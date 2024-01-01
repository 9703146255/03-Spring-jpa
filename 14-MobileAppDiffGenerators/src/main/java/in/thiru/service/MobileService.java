package in.thiru.service;

import org.springframework.stereotype.Service;

import in.thiru.entity.Mobile;
import in.thiru.repo.MobileRepo;

@Service
public class MobileService {

	private MobileRepo mobileRepo;

	public MobileService(MobileRepo mobileRepo) {

		this.mobileRepo = mobileRepo;
	}
	
	
	public void saveMobiles()
	{
		Mobile mobile=new Mobile();
		
		mobile.setMobileName("Redmi");
		mobile.setMobilePrice(50000.00);
		mobile.setMobileShop("FLIPKART");
		
		mobileRepo.save(mobile);
	}
	
	
	
	
	

}

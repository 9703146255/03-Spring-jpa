package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.entity.Mobile;
import in.thiru.repo.MobileRepo;
import in.thiru.service.MobileService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
	
		MobileService bean = run.getBean(MobileService.class);
		 MobileRepo bean2 = run.getBean(MobileRepo.class);
		
		bean.saveMobiles();
//		Iterable<Mobile> findAll = bean2.findAll();
//		findAll.forEach(s->System.out.println(s));
	
	}

}

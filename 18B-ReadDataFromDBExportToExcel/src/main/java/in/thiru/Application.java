package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.service.VegetableService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
	
	
		VegetableService bean = run.getBean(VegetableService.class);
		//bean.exportDataFromDBToExcel();
		bean.importDataFromExcel();
	
	}

}

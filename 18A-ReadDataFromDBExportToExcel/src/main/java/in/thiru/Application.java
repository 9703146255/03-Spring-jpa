package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.service.StudentService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
	
		StudentService bean = run.getBean(StudentService.class);
		bean.exportDataFromDBToExcel();
	}

}

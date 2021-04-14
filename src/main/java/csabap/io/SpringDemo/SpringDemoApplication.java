package csabap.io.SpringDemo;

import csabap.io.SpringDemo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class SpringDemoApplication {



	public static void main(String[] args) {
		System.out.println("README:TXT");
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}

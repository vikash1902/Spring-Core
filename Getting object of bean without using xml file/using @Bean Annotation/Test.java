package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test {
	@Bean
	public Student getStudent() {
		
		// creating object of student
		Student student = new Student();
		
		return student;
	}

}

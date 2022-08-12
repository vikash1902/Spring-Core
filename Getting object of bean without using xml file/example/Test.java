package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test {
	@Bean
	public Book getbook() {
		Book book = new Book();
		return book;
	}
	
	@Bean(name = {"vikash","con","run"})
	public Student getStudent() {
		
		// creating object of student
		Student student = new Student(getbook());
		
		return student;
	}

}

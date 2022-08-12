package javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new AnnotationConfigApplicationContext(Test.class);
		Student temp = ctx.getBean("con",Student.class);
		System.out.println(temp);
		
		temp.study();
	}

}

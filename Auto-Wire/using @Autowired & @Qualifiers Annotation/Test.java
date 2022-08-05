package autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext("autowiring/annotation/autoconfig.xml");
		Student std = (Student) cnt.getBean("student");
		System.out.println(std);

	}

}

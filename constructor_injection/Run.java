package ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run1 {

	public static void main(String[] args) {
		ApplicationContext contxt = new ClassPathXmlApplicationContext("ci/config.xml");
		Person p = (Person) contxt.getBean("person");
		System.out.println(p);

	}

}

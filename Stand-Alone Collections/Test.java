package standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
	
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("standalone/collection/config.xml");
		Person per = (Person) cxt.getBean("person", Person.class);
		System.out.println(per.getFriend());
		System.out.println(per.getFriend().getClass().getName());
		System.out.println("-------------------------------------------------------------------");
		System.out.println(per.getFeestructure());
		System.out.println(per.getFeestructure().getClass().getName());
		System.out.println("-------------------------------------------------------------------");
		System.out.println(per.getProperties());
		System.out.println(per.getProperties().getClass().getName());

	}

}

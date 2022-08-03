package collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext("collection/collectionconfig.xml");

		Emp emp = (Emp) context.getBean("vikash1");
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
		System.out.println(emp.getMobiles());
		System.out.println(emp.getCourses());
		System.out.println(emp.getProp());
	}
}

package spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext ctx;

	public static void main(String args[]) throws Exception {
		ctx = new ClassPathXmlApplicationContext("spel/Spel.xml");
		 Demo d1 = ctx.getBean("demo",Demo.class);
		 System.out.println(d1);
		 
	}
}

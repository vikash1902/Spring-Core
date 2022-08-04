package lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
public static void main(String args[]) {
	AbstractApplicationContext cnt = new ClassPathXmlApplicationContext("lifecycle/config.xml");
	// registering ShutdownHook
    cnt.registerShutdownHook();	
	Book book = (Book) cnt.getBean("book");
	System.out.println(book);
	
}
}

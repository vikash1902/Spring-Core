package lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
public static void main(String args[]) {
	AbstractApplicationContext cnt = new ClassPathXmlApplicationContext("lifecycle/config.xml");
	Car car = (Car) cnt.getBean("car");
	System.out.println(car);
	// registering ShutdownHook
    cnt.registerShutdownHook();	
}
}

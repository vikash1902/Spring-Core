package stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext("stereotype/config.xml");
		Student student = (Student) cnt.getBean("student",Student.class);
		 System.out.println(student.hashCode());
		Student student2 = (Student) cnt.getBean("student",Student.class);
		System.out.println(student2.hashCode());
	}

}

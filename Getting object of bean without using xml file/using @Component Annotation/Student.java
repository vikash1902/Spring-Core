package javaconfig;

import org.springframework.stereotype.Component;

@Component("first")
public class Student {
	public void study() {
		System.out.println("hello you are reading");

}
}

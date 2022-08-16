package com.SpringJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.SpringJdbc.dao.StudentDao;
import com.SpringJdbc.entities.Student;


public class App {
	public static void main(String[] args) {
		System.out.println("Program executed");
		// Spring Jdbc => JdbcTemplet
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		
		
		 // insert Query
		  
		  Student std = new Student(); std.setStd_id(3); std.setStd_name("Rohit");
		  std.setStd_city("Patna");
		  
		  int result = studentDao.insert(std);
		  System.out.println("the number of row affected.." + result);
		  
		  // update Query
		  
		  Student student = new Student(); student.setStd_id(3);
		  student.setStd_name("Mohit"); student.setStd_city("Patna"); int result1 =
		  studentDao.change(student);
		  System.out.println("the number of row affected..." + result1);
		 
		  // delete operation
		  
		  Student student = new Student(); student.setStd_id(3); int result1 =
		  studentDao.delete(student); System.out.println("the number of row affected.."
		  + result1);
		  
		  // Selecting Single Row
		  
		  Student student = studentDao.getStudent(1); System.out.println(student);
		 
		  // Selecting all row
		  List<Student> student = studentDao.getAllStudent();
		  for (Student s : student) 
		  {
		    System.out.println(s);
		  }
	}
}

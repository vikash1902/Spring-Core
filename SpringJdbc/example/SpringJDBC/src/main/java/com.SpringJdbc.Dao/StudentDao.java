package com.SpringJdbc.dao;

import java.util.List;

import com.SpringJdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);

	public int change(Student student);

	public int delete(Student student);

	public Student getStudent(int studentId);

	public List<Student> getAllStudent();

}

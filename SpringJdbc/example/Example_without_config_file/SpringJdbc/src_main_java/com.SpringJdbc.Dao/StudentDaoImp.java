package com.SpringJdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.SpringJdbc.entities.Student;

public class StudentDaoImp implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		// insert Query
		String query = "insert into student(std_id,std_name,std_city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getStd_id(), student.getStd_name(), student.getStd_city());
		return r;
	}

	public int change(Student student) {
		// update Query
		String query = "update student set std_name = ?, std_city = ? where std_id = ?";
		int r = this.jdbcTemplate.update(query, student.getStd_name(), student.getStd_city(), student.getStd_id());
		return r;
	}

	public int delete(Student student) {
		// Delete Operation
		String query = "delete from student where std_id = ?";
		int r = this.jdbcTemplate.update(query, student.getStd_id());
		return r;
	}

	public Student getStudent(int studentId) {
		// Selecting Single Object
		String query = "select * from student where std_id = ?";
		RowMapper<Student> rowMapper = (RowMapper<Student>) new RowMapperImp();
		Student r = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return r;
	}

	public List<Student> getAllStudent() {
		// Select all student
		String query = "select * from student ";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImp());
		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}

package com.SpringJdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.SpringJdbc.entities.Student;

public class RowMapperImp implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setStd_id(rs.getInt(1));
		student.setStd_name(rs.getString(2));
		student.setStd_city(rs.getString(3));
		return student;
	}

}

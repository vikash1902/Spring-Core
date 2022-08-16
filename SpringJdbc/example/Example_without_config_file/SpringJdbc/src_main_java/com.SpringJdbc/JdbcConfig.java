package com.SpringJdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.SpringJdbc.dao.StudentDao;
import com.SpringJdbc.dao.StudentDaoImp;

@Configuration
public class JdbcConfig {
	
	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://10.199.62.114:5432/Vikas@Spring");
		ds.setUsername("visa");
		ds.setPassword("visa");
		return ds;
	}
	
	@Bean("jdbcTamplate")
	public JdbcTemplate getTemplet() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean("studentDao")
	public StudentDao getStudentdao() {
		StudentDaoImp studentDao = new StudentDaoImp();
		studentDao.setJdbcTemplate(getTemplet());
		return studentDao;
	}
	

}

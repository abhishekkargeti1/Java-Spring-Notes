package com.Practise3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.Userdao.Userdaoimp;

@Configuration
public class Config {

	@Bean("ds")
	public DriverManagerDataSource getdatasource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://Localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("1808");
		return ds;
	}
	
	@Bean("jdbctemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(getdatasource());
		return temp;
	}
	
	@Bean("userdao")
	public Userdaoimp getdao() {
		
		Userdaoimp userdaoimp = new Userdaoimp();
		userdaoimp.setTemp(getTemplate());
		return userdaoimp;
	}
	
	
	
}

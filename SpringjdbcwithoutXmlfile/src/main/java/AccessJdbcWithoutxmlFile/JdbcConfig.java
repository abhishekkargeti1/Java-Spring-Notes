package AccessJdbcWithoutxmlFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.UserDao.UserdaoImp;

@Configuration
public class JdbcConfig {
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
			DriverManagerDataSource ds = new DriverManagerDataSource();
			ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			ds.setUrl("jdbc:mysql://Localhost:3306/springjdbc");
			ds.setUsername("root");
			ds.setPassword("1808");
			return ds;
	}
	
	@Bean("jdbctemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbctemplate = new JdbcTemplate();
		jdbctemplate.setDataSource(getDataSource());
		return jdbctemplate;
	}
	
	@Bean("userdao")
	public UserdaoImp userdao() {
		UserdaoImp  userdao = new UserdaoImp();
		userdao.setTemp(getTemplate());
		return userdao;
	}
	
}

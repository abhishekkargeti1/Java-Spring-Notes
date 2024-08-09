package com.SpringJdbc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringJdbc1/Config.xml");
      String query ="insert into student (id,name,city) values (?,?,?)";
      JdbcTemplate temp=(JdbcTemplate)context.getBean("jdbcTemplate");
      int result = temp.update(query,18043,"Abhishek","Delhi");
      System.out.println("Number of Row affected "+result);
    }
}

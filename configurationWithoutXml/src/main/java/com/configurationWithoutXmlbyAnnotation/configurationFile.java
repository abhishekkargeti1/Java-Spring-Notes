package com.configurationWithoutXmlbyAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configurationFile {
	
	
	@Bean()
	public Example getBean() {
			
			Example example = new Example(getTest());
			return example;
			
		}
	@Bean
	public Test getTest() {
		Test test =new Test();
		return test;
	}
		
}

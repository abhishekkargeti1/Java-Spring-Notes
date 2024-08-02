package com.configurationWithoutXmlbyAutoWireAnnotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configurationFile {
	
	@Bean(name= {"Bean"})
	public Example getObject() {
		return new Example(getObject1());
	}
	
	@Bean
	public Example1 getObject1() {
		return new Example1();
	}
}

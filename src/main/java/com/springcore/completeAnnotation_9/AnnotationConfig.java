package com.springcore.completeAnnotation_9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.completeAnnotation_9") // use this if you dont want to use @Bean in below
public class AnnotationConfig {
	
	@Bean
	public Student getStudent() {
		Student student = new Student();
		student.setStudId(3001);
		student.setStudName("Avadhut Patil");
		student.setStudCity(getCity());
		return student;
	}
	
	@Bean
	public City getCity() {
		City city = new City();
		city.setCityName("Shindewadi");
		return city;
	}

}

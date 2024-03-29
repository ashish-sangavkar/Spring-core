package com.springcore.ComponentAnnotation_7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int studId;
	private String studName;
	private City studCity;
	
	
	public City getStudCity() {
		return studCity;
	}

	@Autowired
	public void setStudCity(City studCity) {
		this.studCity = studCity;
	}


	public int getStudId() {
		return studId;
	}

	@Value("1001")
	public void setStudId(int studId) {
		this.studId = studId;
	}

	
	public String getStudName() {
		return studName;
	}

	@Value("Ajay Sargar")
	public void setStudName(String studName) {
		this.studName = studName;
	}


		
}

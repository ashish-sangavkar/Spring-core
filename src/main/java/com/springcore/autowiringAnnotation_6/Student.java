package com.springcore.autowiringAnnotation_6;

import org.springframework.beans.factory.annotation.Autowired;

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


	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}


	public void setStudName(String studName) {
		this.studName = studName;
	}


		
}

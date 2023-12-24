package com.springcore.collectionTypes_2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	private String studName;
	private List<String> studPhones;
	private Set<String> studCities;
	private Map<String, String> studcourses;
	
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public List<String> getStudPhones() {
		return studPhones;
	}
	public void setStudPhones(List<String> studPhones) {
		this.studPhones = studPhones;
	}
	public Set<String> getStudCities() {
		return studCities;
	}
	public void setStudCities(Set<String> studCities) {
		this.studCities = studCities;
	}
	public Map<String, String> getStudcourses() {
		return studcourses;
	}
	public void setStudcourses(Map<String, String> studcourses) {
		this.studcourses = studcourses;
	}
	
	@Override
	public String toString() {
		return "Student [studName=" + studName + ", studPhones=" + studPhones + ", studCities=" + studCities
				+ ", studcourses=" + studcourses + "]";
	}
	
}

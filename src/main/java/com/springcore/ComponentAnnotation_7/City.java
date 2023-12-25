package com.springcore.ComponentAnnotation_7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class City {

	private String cityName;
	
	public String getCityName() {
		return cityName;
	}

	@Value("Delhi")
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
}

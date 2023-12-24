package com.springcore.referenceTypes_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
  public static void main(String[] args) {
    
    ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/referenceTypes_3/config.xml");
    
    ((AbstractApplicationContext) context).refresh();

    Student student = (Student) context.getBean("student");
    
    City city = (City) context.getBean("city");
    
    System.out.println(student.getStudId());
    System.out.println(student.getStudName());
    System.out.println(student.getStudCity().getCityName());
    

    ((AbstractApplicationContext) context).close();

  }
}

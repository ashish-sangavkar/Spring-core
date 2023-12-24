package com.springcore.propertyInjection_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
  public static void main(String[] args) {
    
    ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/propertyInjection_1/config.xml");
    
    ((AbstractApplicationContext) context).refresh();

    Student student = (Student) context.getBean("student");

    System.out.println(student);

    ((AbstractApplicationContext) context).close();

  }
}

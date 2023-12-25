package com.springcore.completeAnnotation_9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App {
	
  public static void main(String[] args) {
    
    ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
   
    Student student = (Student) context.getBean("getStudent");

    System.out.println(student.getStudId());
    System.out.println(student.getStudName());
    System.out.println(student.getStudCity().getCityName());

  }
}

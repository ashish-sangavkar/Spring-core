package com.springcore.beanscope_8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
  public static void main(String[] args) {
    
    ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanscope_8/config.xml");
    
    ((AbstractApplicationContext) context).refresh();

    Student student = (Student) context.getBean("student");

    System.out.println(student.hashCode());
    
    Student student1 = (Student) context.getBean("student");

    System.out.println(student1.hashCode());

    

    ((AbstractApplicationContext) context).close();

  }
}

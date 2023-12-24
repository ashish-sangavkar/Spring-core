package com.springcore.constructorInjection_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
  public static void main(String[] args) {
    
    ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorInjection_4/config.xml");
    
    ((AbstractApplicationContext) context).refresh();

    Addition addition = (Addition) context.getBean("addition");
    
    addition.add();
    
    ((AbstractApplicationContext) context).close();

  }
}

package com.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationConfig {
	
//	private Employee employee;
	
	public ApplicationConfig() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = ac.getBean("emp", Employee.class);
		System.out.println(e);
	}
}

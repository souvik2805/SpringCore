package com.asl.college_new_setter_in_component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CollgeConfig.class);
		
		College clg = context.getBean("college", College.class);
		clg.test();
		
		
		((AnnotationConfigApplicationContext)context).close();
	}
}

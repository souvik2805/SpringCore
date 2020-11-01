package com.asl.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CollgeConfig.class);
		
		College clg = context.getBean("collegeBean", College.class);
		System.out.println(clg);
	}
}

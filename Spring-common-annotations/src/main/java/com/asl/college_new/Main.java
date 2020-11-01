package com.asl.college_new;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CollgeConfig.class);
		
		College clg = context.getBean("colBean2", College.class);
		clg.test();
		System.out.println(clg);
	}
}

package com.asl.di_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Human {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person human_1 = context.getBean("human_1",Person.class);
		System.out.println(human_1);
		
		Person human_2 = context.getBean("human_2",Person.class);
		System.out.println(human_2);
	}

}

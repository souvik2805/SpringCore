package com.asl.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student s1 = context.getBean("student_1", Student.class);
        Student s2 = context.getBean("student_2", Student.class);

        System.out.println(s1);
        System.out.println(s2);
	}

}

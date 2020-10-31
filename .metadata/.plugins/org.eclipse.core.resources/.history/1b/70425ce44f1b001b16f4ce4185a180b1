package com.asl.network;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml ");
		
		sim mysim = context.getBean("sim1", sim.class);
		mysim.calling();
		mysim.data();
	}
}

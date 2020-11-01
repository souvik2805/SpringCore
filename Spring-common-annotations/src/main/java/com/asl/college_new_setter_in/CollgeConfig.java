package com.asl.college_new_setter_in;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollgeConfig {
	
	/*
	@Bean
	public College collegeBean() {    // collegeBean - bean id
		College college = new College();
		return college;
	}
	*/
	
	@Bean
	public Teacher teacherBean() {
		return new MathTeacher();
	}
	
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	@Bean(name= {"colBean1","colBean2"})
	public College collegeBean() {    // collegeBean - bean id
		College college = new College();
		college.setPrincipal(principalBean());
		college.setTeacher(teacherBean());
		return college;
	}

}

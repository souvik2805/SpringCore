package com.asl.college_new_setter_in_component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
	  System.out.println("Hello I souvik. A MATH TEACHER");
	}

}

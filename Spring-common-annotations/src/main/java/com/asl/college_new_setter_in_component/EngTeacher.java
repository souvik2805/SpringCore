package com.asl.college_new_setter_in_component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component

public class EngTeacher implements Teacher {
	@Override
	public void teach() {
		System.out.println("Hi I Your ENGLIDH TEACHER(**I9");

	}

}

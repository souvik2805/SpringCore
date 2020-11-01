package com.asl.college_new_setter_in_component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 @Component("collegeBean")
 public class College {

	public void test() {
		System.out.println("Testing this call Method");
	}
	
}

Default compoent name(bean) is class name in small 

 */

/*
@Component
public class College {

	private Principal principal;
	private Teacher teacher;


	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}



	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("Testing this call Method");
	}
	
}

*/

// @Value annotaitton for literal type => like autowired


@Component
public class College {

//	@Value("${college.Name}")
	private String collegeName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
//	@Qualifier("engTeacher")
	private Teacher teacher;
	
	

   @Required
	public String getCollegeName() {
		return collegeName;
	}




	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}




	public void test() {
		System.out.println(collegeName);
		principal.principalInfo();
		teacher.teach();
		System.out.println("Testing this call Method");
	}
	
}



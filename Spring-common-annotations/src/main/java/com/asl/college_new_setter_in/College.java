package com.asl.college_new_setter_in;


/*
 @Component("collegeBean")
 public class College {

	public void test() {
		System.out.println("Testing this call Method");
	}
	
}

Default compoent name(bean) is class name in small 

 */

public class College {

	private Principal principal;
	private Teacher teacher;


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}



	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("Testing this call Method");
	}
	
}

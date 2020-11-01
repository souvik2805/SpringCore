package com.asl.college_new;


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
	
	public College(Principal principal) {
		this.principal = principal;
	}

	public void test() {
		principal.principalInfo();
		System.out.println("Testing this call Method");
	}
	
}

package com.asl.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("monkeyHeart")
	private Heart heart;
	private int id;

	
	public Human() {
		
	}

	public Human(Heart heart , int id) {
		this.heart = heart;
		this.id = id;
	}

	//Constructor injection.
//	@Autowired
	public Human(Heart heart) {
		this.heart = heart;
	}
	
	// Setter Injection
	/*
	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	*/
	
	
	// Setter Injection
	/*
		@Autowired
		@Qualifier("monkeyHeart")
		public void setHeart(Heart heart) {
			this.heart = heart;
		}
      */
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public void startPumping() {
		if (heart != null) {
			heart.pump();
		} else {
          System.out.println("You are dead...");
		}

	}

}
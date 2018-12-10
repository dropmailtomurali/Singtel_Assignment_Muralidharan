package com.assignment;

public class Bird extends Animal implements Says {
	public String fly() {
		 return "I am flying";
	}
	
	public String says() {
		return "I am singing";
    }
}

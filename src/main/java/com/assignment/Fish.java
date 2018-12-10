package com.assignment;

public class Fish extends Animal implements Swimmers {
	public String swim() {
		return "I am swimming";
    }
	
	public String walk() {
		return "I don't walk";
    }
	
	public String sing() {
		return "I don't sing";
    }
}

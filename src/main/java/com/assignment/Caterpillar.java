package com.assignment;

public class Caterpillar extends Animal {
	public String walk() {
		 return "I am walking";
	}
	
	public Butterfly metamorphosis() {
        return new Butterfly();
    }
}

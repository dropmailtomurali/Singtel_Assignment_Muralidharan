package com.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest 
{
    
	private Bird bird = new Bird();
	
	@Test
	public void testFly() throws Exception {
	        assertEquals( "I am flying", bird.fly());
	}
	
	@Test
	public void testWalk() throws Exception {
	        assertEquals( "I am walking", bird.walk());
	}
	
	@Test
	public void testSing() throws Exception {
	        assertEquals( "I am singing", bird.sing());
	}
	
}

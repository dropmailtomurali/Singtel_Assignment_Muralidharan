package com.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest 
{
    
	private Bird bird = new Bird();
	private Duck duck = new Duck();
	private Chicken chicken = new Chicken();
	private Rooster rooster = new Rooster();
	
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
	
	@Test
	public void testDuck() throws Exception {
	        assertEquals( "Quack, quack", duck.says());
	        assertEquals( "I am swimming", duck.swim());
	}
	
	@Test
	public void testChicken() throws Exception {
	        assertEquals( "Cluck, cluck", chicken.says());
	        assertEquals( "I cannot fly", chicken.fly());
	}
	
	@Test
	public void testRooster() throws Exception {
	        assertEquals( "Cock-a-doodle-doo", rooster.says());
	}
}

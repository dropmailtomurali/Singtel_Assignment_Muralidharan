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
	        assertEquals( "I am singing", bird.says());
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
	
	@Test
	public void testParrotWithDogs() throws Exception {
			Parrot parrotWithDogs = new Parrot(new Dog());
	        assertEquals( "Woof, woof", parrotWithDogs.says());
	}
	
	@Test
	public void testParrotWithCats() throws Exception {
			Parrot parrotWithCats = new Parrot(new Cat());
	        assertEquals( "Meow", parrotWithCats.says());
	}
	
	@Test
	public void testParrotWithRooster() throws Exception {
			Parrot parrotWithRooster = new Parrot(new Rooster());
	        assertEquals( "Cock-a-doodle-doo", parrotWithRooster.says());
	}
}

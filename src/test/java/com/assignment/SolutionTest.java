package com.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest 
{
    
	private Bird bird = new Bird();
	private Duck duck = new Duck();
	private Chicken chicken = new Chicken();
	private Rooster rooster = new Rooster();
	private Fish fish = new Fish();
	private Shark shark = new Shark();
	private Clownfish clownfish = new Clownfish();
	private Dolphin dolphin = new Dolphin();
	private Butterfly butterfly = new Butterfly();
	private Caterpillar caterpillar = new Caterpillar();
	
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
	
	@Test
	public void testFish() throws Exception {
	        assertEquals( "I am swimming", fish.swim());
	        assertEquals( "I don't walk", fish.walk());
	        assertEquals( "I don't sing", fish.sing());
	}
	
	@Test
	public void testShark() throws Exception {
	        assertEquals( "Large", shark.getSizeAttribute());
	        assertEquals( "Grey", shark.getColorAttribute());
	        assertEquals( "Eat other fish", shark.getBehaviorAttribute());
	}
	
	@Test
	public void testClownfish() throws Exception {
	        assertEquals( "Small", clownfish.getSizeAttribute());
	        assertEquals( "Orange", clownfish.getColorAttribute());
	        assertEquals( "Make jokes", clownfish.getBehaviorAttribute());
	}
	
	@Test
	public void testDolphin() throws Exception {
	        assertEquals( "I am swimming", dolphin.swim());
	}
	
	@Test
	public void testButterfly() throws Exception {
	        assertEquals( "I am flying", butterfly.fly());
	}
	
	@Test
	public void testCaterpillar() throws Exception {
	        assertEquals( "I am walking", caterpillar.walk());
	        assertEquals( "I am flying", caterpillar.metamorphosis().fly());
	}
}

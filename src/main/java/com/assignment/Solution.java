package com.assignment;

import java.util.Arrays;
import java.util.List;

/**
 * @author MuralidharanKesavaraj
 * @version 1.0
 * @category Singtel Assignment	
 */

public class Solution 
{
    public static void main( String[] args )
    {
    	int flyingAnimals = 0, walkingAnimals = 0, singingAnimals = 0, swimmingAnimals = 0;
    	for (Animal animal : new Animal[]{
    			new Bird(),
    			new Duck(),
    			new Chicken(),
    			new Rooster(),
    			new Parrot(),
    			new Fish(),
    			new Shark(),
    			new Clownfish(),
    			new Dolphin(),
    			//new Frog(),
    			new Dog(),
    			new Butterfly(),
    			new Cat()}) {
    				if("I am flying".equals(animal.fly()))
    					flyingAnimals++;
    				else if("I am walking".equals(animal.walk()))
    					walkingAnimals++;
    				else if("I am singing".equals(animal.says()))
    					singingAnimals++;
    				else if("I am swimming".equals(animal.swim()))
    					swimmingAnimals++;
    				
    			};
    			System.out.println("Number of animals that can fly: "+flyingAnimals);
    			System.out.println("Number of animals that can walk: "+walkingAnimals);
    			System.out.println("Number of animals that can sing: "+singingAnimals);
    			System.out.println("Number of animals that can swim: "+swimmingAnimals);
    }
}

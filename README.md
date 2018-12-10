# Singtel_Assignment_Muralidharan

1. Can you implement the sing() method for the bird?
a. How did you unit test it?
  - Unit Test created using JUnit
b. How did you optimize the code for maintainability?
  - The return type is changed to String instead of System Out.

2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound?
a. A duck says: “Quack, quack”
b. A duck can swim
c. A chicken says: “Cluck, cluck”
d. A chicken cannot fly (assumption: its wings are clipped but ignore that)
  - Duck and Chicken Classes implemented
  - Added swim method to Duck
  - Added says method to Chicken
  - Unit Test done

3. Now how would you model a rooster?
a. A rooster says: “Cock-a-doodle-doo”
b. How is the rooster related to the chicken?
c. Can you think of other ways to model a rooster without using inheritance?
  - Rooster Class Created extending Chicken class
  - Added says method to Rooster
  - Unit Test Completed

4. Can you model a parrot? We are specifically interested in three parrots, one that
lived in a house with dogs one in a house with cats, the other lived on a farm next to
the rooster.
a. A parrot living with dogs says: “Woof, woof”
b. A parrot living with cats says: “Meow”
c. A parrot living near the rooster says: “Cock-a-doodle-doo”
d. How do you keep the parrot maintainable? What if we need another parrot
lives near a Duck? Or near a phone that rings frequently?
  - Added Dog, Cat classes
  - Added a constructor to return respective sounds for Parrot class
  - Unit Test done

B. Model fish as well as other swimming animals
1. In addition to the birds, can you model a fish?
a. Fishes don’t sing
b. Fishes don’t walk
c. Fishes can swim
  - Created Fish Class with the attributes
  - Unit Test done

2. Can you specialize the fish as a Shark and as a Clownfish?
a. Sharks are large and grey
b. Clownfish are small and colourful (orange)
c. Clownfish make jokes
d. Sharks eat other fish
  - Implemented Shark and Clownfish classes with respective attributes
  - Unit test done
  
3. Dolphins are not exactly fish, yet, they are good swimmers
a. Can you model a dolphin that swims without inheriting from a fish class?
b. How do you avoid duplicating code or introducing unneeded overhead?
  - Created Dolphin class implementing Swimmers interface
  - Unit test done

D. Model animals that change their behaviour over time
1. Can you model a butterfly?
a. A butterfly can fly
b. A butterfly does not make a sound
  - Created butterfly class with its attribute
  - Unit test done

2. Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly?
a. A caterpillar cannot fly
b. A caterpillar can walk (crawl)
  - Created Caterpillar class with its attribute
  - Created metamorphosis method to return Butterfly type
  - Unit test done

E. Counting animals
1. Can you share the code to count:
a. how many of these animals can fly?
b. how many of these animals can walk?
c. how many of these animals can sing?
d. how many of these animals can swim?
  - Counted the individual number of animals with different
characteristics and printed it

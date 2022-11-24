package PolyMorphism;

// Dog is a child class from Animal (parent class).
public class Dog extends Animal {
	private String name;
	private int breed;
	
	// We can override a method of a parent class.
	public void eat() {
		System.out.println("Pedigree");
	}
	public void name() {
		System.out.println("Charlie - this is a dog.");
	}
	
	// We can overload a method this way.
	// Same method as before, with different parameters.
	// This one is taking an 'integer' as parameter.
	public void eat(int numberOfTimes) {
		// With this overloading method, we want our method to do something different.
		// We are going to print out the number of times for 'Pedigree' with a 'for' loop.
		for (int i = 0; i < numberOfTimes; i++) {
			System.out.println("Pedigree");	
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBreed() {
		return breed;
	}
	
	public void setBreed(int breed) {
		this.breed = breed;
	}
}

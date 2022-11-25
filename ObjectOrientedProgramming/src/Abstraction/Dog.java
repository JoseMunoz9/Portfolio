package Abstraction;

// Child class from Animal class.

public class Dog extends Animal implements AnimalStuff {
	
	String name = "Charlie";
	int age = 7;

	@Override
	public void makeNoise() {
		System.out.println("Woof");	
	}
	
	public void printName() {
		System.out.println("My name is: " + name);
	}
	
	public void printAge() {
		System.out.println("I'm " + age + " years old.");
	}

	@Override
	public void poop() {
		System.out.println(name + " just pooped.. Ewwh!");
		
	}
	
}

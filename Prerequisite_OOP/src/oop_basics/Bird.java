package oop_basics;

// We are using 'extends' to inherit to the class 'Animal'.
// Bird is a child class from 'Animal'.
public class Bird extends Animal{
	
	public Bird(String type, String name, int age, int weight, String origin) {
		super(type, name, age, weight, origin);
	}

	public void move() {
		System.out.println("Flapping wings...");
		
	}
}

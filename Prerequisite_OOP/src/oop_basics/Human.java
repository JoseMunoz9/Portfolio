package oop_basics;

public class Human {
	String name;
	int age;
	int heightInInches;
	String eyeColour;
	
	// Constructor Method:
	public Human(String name, int age, int heightInInches, String eyeColour) {
		super();
		this.age = age;
		this.eyeColour = eyeColour;
		this.heightInInches = heightInInches;
		this.name = name;
	}
	
	public void speak() {
		System.out.println("Hi, my name is: " + name);
		System.out.println("I am " + heightInInches + " inches tall");
		System.out.println("I am " + age + " years old.");
		System.out.println("My eye colour is " + eyeColour);
	}
	
	public void eat() {
		System.out.println("eating...");
	}
	
	public void walk() {
		System.out.println("walking...");
	}
	
	public void work() {
		System.out.println("working...");
	}
}

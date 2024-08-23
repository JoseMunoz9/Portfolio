package oop_basics;

//We are using 'extends' to inherit to the class 'Animal'.
//Fish is a child class from 'Animal'.
public class Fish extends Animal{
	
	public Fish(String type, String name, int age, int weight, String origin) {
		super(type, name, age, weight, origin);
	}

	public void swim() {
		System.out.println("Swimming...");
	}

	public void move() {
		System.out.println("The fish is swimming...");
		
	}

}

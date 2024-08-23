package oop_basics;

public abstract class Animal {
	String type;
	String name;
	int age;
	int weight;
	String origin;
	
	// Constructor Method:
	public Animal(String type, String name, int age, int weight, String origin) {
		super();
		this.type = type;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.origin = origin;
		
	}
	
	public void eat() {
		System.out.println("This is a " + type + ", their name is: " + name + ".");
		System.out.println(name + " is " + age + " years old and their weight is: " + weight + " kilos.");
		System.out.println(name + " is from " + origin + " and right now they are eating.");
	}
	
	public void sleep() {
		System.out.println(name + " takes a nap around 3pm or so. They will be going for a nap soon.");
	}
	
	public void fly() {
		System.out.println(name + " can fly an altitude of over 10,000 feet.");
	}
	
	public void swim() {
		System.out.println(name + " is trained to swim at about 0.86 mph (1.38 km/h)");
	}
	
	public abstract void move();

}

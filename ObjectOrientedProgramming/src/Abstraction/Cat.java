package Abstraction;

//Child class from Animal class.

public class Cat extends Animal implements AnimalStuff {
	
	String name = "Luna";
	int age = 4;

	@Override
	public void poop() {
		System.out.println(name + " does not want to poop yet!");
	}

	@Override
	public void makeNoise() {
		System.out.println("Meow!");
	}

	@Override
	public void printName() {
		System.out.println("My name is: " + name);
	}

	@Override
	public void printAge() {
		System.out.println("I'm " + age + " years old.");
	}

}

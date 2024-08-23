package oop_basics;

public class Sparrow extends Bird implements Flyable{

	public Sparrow(String type, String name, int age, int weight, String origin) {
		super(type, name, age, weight, origin);
	}
	@Override
	public void fly() {
		System.out.println("Sparrow flying high...");
	}

}
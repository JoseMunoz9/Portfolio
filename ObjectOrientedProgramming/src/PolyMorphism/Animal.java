package PolyMorphism;
// Parent class ANIMAL
public class Animal {
	private String name;
	private String color;

	public void eat() {
		System.out.println("Steak");		
	}
	
	public String getName() {
		return name;
	}
	public void type() {
		System.out.println("Dog & Cat");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

}

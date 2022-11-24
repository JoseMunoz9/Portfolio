package PolyMorphism;

// Cat is a child class from Animal (parent class).
public class Cat extends Animal {
	private String name;
	private String litterPreference;
	
	// We can override a method of a parent class.
	public void eat() {
		System.out.println("Whiskas");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLitterPreference() {
		return litterPreference;
	}
	
	public void setLitterPreference(String litterPreference) {
		this.litterPreference = litterPreference;
	}

}

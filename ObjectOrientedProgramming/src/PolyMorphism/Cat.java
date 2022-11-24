package PolyMorphism;

public class Cat  extends Animal {
	private String litterPreference;
	
	public void eat() {
		System.out.println("Wiskas");
	}
	
	public String getLitterPreference() {
		return litterPreference;
	}
	
	public void setLitterPreference(String litterPreference) {
		this.litterPreference = litterPreference;
	}

}

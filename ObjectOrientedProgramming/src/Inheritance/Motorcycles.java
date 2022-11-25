package Inheritance;

// Child class from Vehicles.

public class Motorcycles extends Vehicles{
	
	// Attributes.
	private String color = "Black";
	private int tyres = 2;
	private int wheels = 2;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		System.out.println("This Motorcyle is: " + color);
		this.color = color;
	}
	public int getTyres() {
		return tyres;
	}
	public void setTyres(int tyres) {
		this.tyres = tyres;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

}

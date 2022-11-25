package Inheritance;

// Child class from Vehicles.

public class Trucks extends Vehicles {
	
	// Attributes.
	private String color = "Blue";
	private int tyres = 18;
	private int wheels = 18;
	
	public  String getColor() {
		return color;
	}
	public void setColor(String color) {
		System.out.println("This truck is: " + color);
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

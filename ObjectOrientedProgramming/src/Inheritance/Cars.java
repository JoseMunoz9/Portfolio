package Inheritance;

// Child class from Vehicles.

public class Cars extends Vehicles {
	
	// Attributes.
	private String type = "Sport";
	private String color = "Black";
	private int doors = 2;
	private int wheels = 4;
	private int tyres = 4;
	
	public void sport() {
		System.out.println("Sport vehicle.");
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		System.out.println("This car is: " + color);
		this.color = color;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getTyres() {
		return tyres;
	}
	public void setTyres(int tyres) {
		this.tyres = tyres;
	}
	

}

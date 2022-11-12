package model;

public abstract class Automobile {
	
	protected String colour;
	
	public Automobile(String colour) {
		this.colour = colour;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}

}

package model;

public class Toyota extends Automobile{

	public Toyota(String colour) {
		super(colour);
	}
	@Override
	public String toString() {
		return "This is a " + this.colour+ "Toyota";
	}

}

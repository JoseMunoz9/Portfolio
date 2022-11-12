package model;

public class Ford extends Automobile {
	
	public Ford(String colour) {
		super(colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "This is a " + this.colour + "Ford";
	}

}

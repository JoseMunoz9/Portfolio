package model;

public class Audi extends Automobile{
	
	public Audi(String colour) {
		super(colour);
	}
	
	@Override
	public String toString() {
		return "This is a " + this.colour + " Audi";
	}

}

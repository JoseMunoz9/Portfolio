package model;

import interfaces.Luxury;
import interfaces.Sport;

public class Fiesta extends Ford implements Sport, Luxury{
	
	public Fiesta(String colour) {
		super(colour);
	}
	
	@Override
	public void applyTurbo() {
		// TODO Auto-generated method stub
		System.out.println("Applying turbo in Fiesta");
	}
	
	@Override
	public void chillChampagne() {
		System.out.println("Champagne is getting chill");
	}

}

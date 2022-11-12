package model;

import interfaces.Luxury;

public class Corolla extends Toyota implements Luxury{
	
	public Corolla(String colour) {
		super(colour);
	}
	
	@Override
	public void chillChampagne() {
		System.out.println("Champagne is cold for Corolla");
	}

}

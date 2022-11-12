package model;

import interfaces.Family;
import interfaces.Luxury;

public class Focus extends Ford implements Family, Luxury{
	
	public Focus(String colour) {
		super(colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void chillChampagne() {
		System.out.println("Champagne cold from Focus");
	}
	
	@Override
	public void openExtraSit() {
	System.out.println("Extra sits available");
	}
	
	@Override
	public String toString() {
		return super.toString()+ "";
	}
}

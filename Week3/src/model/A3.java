package model;

import interfaces.Sport;

public class A3 extends Audi implements Sport{
	
	public A3(String colour) {
		super(colour);
	}
	
	@Override
	public void applyTurbo() {
		System.out.println("Turbo in A3");
	}

}

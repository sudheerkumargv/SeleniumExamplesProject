package com.java.ex.interfaces;

public class ConceptCar  implements Car,ElectriCar{

	@Override
	public void speed() {
	System.out.println("speed");
		
	}

	@Override
	public void applyBreak() {
		System.out.println("applyBreak");
		
	}

	@Override
	public void accelarate() {
		System.out.println("accelarate");
		
	}
	
	public static void main(String[] args) {
		ConceptCar c = new ConceptCar();
		c.speed();
		c.batter();
		c.applyBreak();
		
	}

	@Override
	public void batter() {
		System.out.println("battery");
		
	}

	
}

package com.java.ex.abstraction;

public class ConceptCar extends Car {

	@Override
	public void applyBreak() {
		System.out.println("break applied in concept car");
		
	}
	
	public static void main(String[] args) {
		ConceptCar c = new ConceptCar();
		c.applyBreak();
	}
}

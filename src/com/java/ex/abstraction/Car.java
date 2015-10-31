package com.java.ex.abstraction;

public abstract class Car {

	public void accelarate()
	{
		System.out.println("accelarate in car");
	}
	
	public void speed()
	{
		System.out.println("speed in car");
	}
	
	public abstract void applyBreak();
}

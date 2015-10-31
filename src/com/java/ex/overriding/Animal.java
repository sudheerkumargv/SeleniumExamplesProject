package com.java.ex.overriding;

public class Animal {

	
	public void eat()
	{
		System.out.println("eat in Animal");
	}
	
	int run(int speed)
	{
		System.out.println(speed+" in animal");	
		return speed;
	}
}

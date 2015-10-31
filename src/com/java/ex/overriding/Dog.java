package com.java.ex.overriding;

public class Dog extends Animal
{
	public int run(int speed)
	{
		System.out.println(speed +" in dog");
		return speed;
	}
	
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.run(10);
		
		Animal a = new Dog();
		a.run(20);
		a.eat();
		
	}
	
	
	
}

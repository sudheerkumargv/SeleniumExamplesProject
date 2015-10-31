package com.java.ex.variablesdatatypes;

public class VariableDemo 
{

	
	int model = 1234;
	String color = "red"; //Declaring and Assigning Some Value
	int type; //Delcaring
	float speed =125.5f;
	
	
	
	public static void main(String[] args) {
		VariableDemo demo = new VariableDemo();
		
		demo.displayDetailsOfLocalVariable();
		System.out.println("---------------");
		demo.displayDetailsOfInstanceVariables();
		
		System.out.println(demo.model);
		
	}
	
	
	
	public void displayDetailsOfInstanceVariables()
	{
		model= 89;
		int power = 50;
		System.out.println(model);
		System.out.println(color);
		System.out.println(type);
		System.out.println(speed);
		System.out.println(power);
	
	}
	
	public void displayDetailsOfLocalVariable()
	{
		model = 567;
		String color = "red"; //Declaring and Assigning Some Value
		int type=1;
		int power = 25;
		
		System.out.println(model);
		System.out.println(color);
		System.out.println(type);
		System.out.println(speed);
		System.out.println(power);
		
	}
	
}

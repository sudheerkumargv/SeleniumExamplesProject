package com.java.ex;

public class HelloWorld 
{
	
	int x = 10;
	int y = 20;
	boolean b = false;
	
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		System.out.println("Hello Java");
		System.out.println("Hello Selenium");
	}
	
	
	public void display()
	{
		int z = x+y;
		System.out.println(z);
	}
	
	public void print()
	{
		System.out.println(b);
	}
	
	public int add()
	{
		return x+y;
	}
}

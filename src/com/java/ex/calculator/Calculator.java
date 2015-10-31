package com.java.ex.calculator;

public class Calculator 
{
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int addResult = calc.add(10, 20);
		System.out.println(addResult);
		
		int subResult = calc.sub(20, 10);
		System.out.println(subResult);
	}
	
	public int add(int a, int b)
	{
		int result = a+b;
		return result;
	}
	
	
	public int sub(int a,int b)
	{
		int result = a-b;
		return result;
	}
	
	public int multipication(int a,int b)
	{
		int result = a*b;
		return result;
	}
	
	public int divide(int a , int b)
	{
		int result = a/b;
		return result;
	}
	
}

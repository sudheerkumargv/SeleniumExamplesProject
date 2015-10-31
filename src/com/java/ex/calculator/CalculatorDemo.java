package com.java.ex.calculator;
import com.java.ex.calculator.Calculator;

public class CalculatorDemo 
{
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int addResult = calc.add(10, 40);
		System.out.println(addResult);
		
		
		int mulResult = calc.multipication(20, 30);
		System.out.println(mulResult);
		
		int divideResult = calc.divide(20, 2);
		System.out.println(divideResult);
	}
	
}

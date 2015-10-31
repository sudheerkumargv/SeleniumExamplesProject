package com.selenium.ex.demo;

public class Operators
{
	short s = 10;
	
		public static void main(String[] args) {
			int a = 10;
			a = a-1;
			System.out.println(a); //9
			
			int b = a--;  
			System.out.println(b); // 9
			System.out.println(a);// 8
			
			int c = --a;
			System.out.println(c); // 7
			System.out.println(a); // 7
		}
		
		
}

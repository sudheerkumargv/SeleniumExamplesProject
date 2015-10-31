package com.java.ex.operators;

public class OperatorExample {
	public static void main(String[] args) {
		OperatorExample opr = new OperatorExample();
//		System.out.println("***Arithematic Examples***");
//		opr.exArithematic();
		
//		System.out.println("***Logical Examples***");
//	    opr.exLogical();
	   
//	    System.out.println("***Increment & Decrement Examples***");
//		opr.exIncNDec();
		
		System.out.println("***Relational Examples***");
		opr.exRelatational();
	}

	public void exArithematic() {
		int a = 20;
		int b = 10;
		System.out.println(a + b); 
		System.out.println(a - b); 
		System.out.println(a * b); 
		System.out.println(a / b); 
		System.out.println(a % b); 
	}

	public void exLogical() {
		boolean a = true;
		boolean b = false;
		System.out.println(a && b); 
		System.out.println(a || b); 
		System.out.println(!a); 
	}

	public void exIncNDec() {
		int a = 10;
		int b = ++a; // pre increment -> a =a+1; b=a;
		System.out.println("a="+a +"  "+ "b=" + b);

		int a1 = 10;
		int b1 = a1++; // post incremen -> b1=a1;-> b1=10 , a1 = a1+1;
		System.out.println("a1="+a1 +"  "+ "b1=" + b1);

		int a2 = 10;
		int b2 = --a2; // pre decrement -> a2 = a2-1; b2=a;
		System.out.println("a2="+a2 +"  "+ "b2=" + b2);

		int a3 = 10;
		int b3 = a3--; // post decrement, b3 = a3; a3=a3-1;
		System.out.println("a3="+a3 +"  "+ "b3=" + b3);
	}

	public void exRelatational() {
		int a = 20;
		int b = 10;
		System.out.println(a > b);  
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
	}

}

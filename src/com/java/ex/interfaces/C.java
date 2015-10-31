package com.java.ex.interfaces;

public class C  implements A,B{

	
	public void display()
	{
		System.out.println("display");
	}
	
	
	public static void main(String[] args) {
		C c = new C();
		c.display();
		c.view();
		c.print();
	}
	
	
	
	


	@Override
	public void view() {
		System.out.println("view");
		
	}


	@Override
	public void print() {
		System.out.println("print");
		
	}
}

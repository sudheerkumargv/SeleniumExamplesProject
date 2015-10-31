package com.java.ex.accessmodifiers;

public class PrivateEx {

	private int model=1234;
	
	private void display()
	{
		
	}
	
	public static void main(String[] args) {
		PrivateEx ex = new PrivateEx();
		System.out.println(ex.model);
		ex.display();
	}
}

package com.java.ex.execeptions;

public class ArithematicException {

	public static void main(String[] args)
	{
		String s = null;
		int arr[] = new int[3];
		int a = 10;
		int b = 10;
		int c = 0;
		
		try
		{
			c = a/b;
			arr[2] = 0;
			s.toLowerCase();
			
		}
		finally
		{
			System.out.println("finally handled");
		}

		System.out.println(c);
		System.out.println("Done");
	}
}

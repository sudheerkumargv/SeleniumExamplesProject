package com.java.ex.loopingstatements;

public class LoopingStatementsEx {
	public static void main(String[] args) {
		LoopingStatementsEx ex = new LoopingStatementsEx();
		//ex.whileEx();
		//ex.doWhileEx();
		//ex.doWhileEx1();
		ex.forLoopEx();
	}
	
	public void whileEx()
	{
		//Print 0 to 9
		int i =0;
		while(i<=9)
		{
			System.out.println(i);
			++i;
		}
		
	}
	
	public void doWhileEx()
	{
		//print 0 to 9
		int i = 0;
		do
		{
			System.out.println(i);
			++i;
		}
		while(i<=9);
		System.out.println("Done");
		
	}
	
	public void doWhileEx1()
	{
		//print 0 to 9
		int i = 9;
		do
		{
			System.out.println(i);
			--i;
		}
		while(i>=0);
		System.out.println("Done");
		
	}
	
	public void forLoopEx()
	{
		System.out.println("0 to 9");
		for(int i =0;i<=9;i++)
		{
			System.out.println(i);
		}
		System.out.println("9 to 0");
		for(int i =9;i>=0;i--)
		{
			System.out.println(i);
		}
	}
	
	
	
}

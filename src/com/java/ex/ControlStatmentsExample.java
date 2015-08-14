package com.java.ex;

public class ControlStatmentsExample 
{
	public static void main(String[] args)
	{
		ControlStatmentsExample cntrl = new ControlStatmentsExample();
		//cntrl.exIF();
		//cntrl.exIF_ELSE();
		//cntrl.exSWITCH();
		//cntrl.loopingStmtEx();
		//cntrl.breakNContinueEx();
		int x = cntrl.add(10, 20);
		System.out.println(x);
	}




	public void exIF()
	{
		int age = 18;
		if(age==18)
		{
			System.out.println("You are eligible for applying voter card");
		}
	}
	
	public void exIF_ELSE()
	{
		int age = 17;
		if(age==18)
		{
			System.out.println("You are eligible for applying voter card");
		}
		else
		{
			System.out.println("You are not eligible for applying voter card");
		}
	}
	
	public void exSWITCH()
	{
		int age = 61;
		switch(age)
		{
		case 18:
			System.out.println("You are eligble as you are age is "+age);
			break;
		case 17: 
			System.out.println("You are not eligble as you are age is "+age);
			break;
		case 60: 
			System.out.println("You are eligble to get it in fastrack as you are age is "+age);
			break;
		default:
				System.out.println("Sorry we didnt understand you are age:"+age);
		}
	}
	
	
	public void loopingStmtEx()
	{
		System.out.println("##############while loo p started#############");
		int count =1;
		while(count <=10)
		{
			System.out.println(count);
			++count;  // count = count+1;
		}
		System.out.println("##############while loop ended#############");
		
		System.out.println("##############do-while loop started#############");
		int count1 =1;
		do{
			System.out.println(count1);
			++count1;
		}while(count1<=10);	
		System.out.println("##############d0-while loop ended#############");
		
		System.out.println("##############for loop started#############");
		for(int count2=1;count2<=10;++count2)
		{
			System.out.println(count2);
		}
		System.out.println("##############for loop ended#############");
		
	}
	
	
	public void breakNContinueEx()
	{
		System.out.println("##############Break Stmt started#############");
		for(int i=1;i<=10;i++)
		{
		 System.out.println(i);
		 if(i==5)
		  {
		     break;
		  }
		}
		System.out.println("##############Break Stmt Ended#############");
		
		System.out.println("##############Continue Stmt started#############");
		for(int i=1;i<=10;i++)
		{
		  if(i==5)
		  {
		    continue;
		  }
		 System.out.println(i);
		}
		System.out.println("##############Continue Stmt Ended#############");
	}
	
	public int add(int a ,int b)
	{
		int c = a+b;
		System.out.println(c);
		return c;
	}
	

}
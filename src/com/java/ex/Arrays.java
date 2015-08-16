package com.java.ex;

public class Arrays 
{
	public static void main(String[] args)
	{
		int size =3;
		int arr[] = new int[size];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		size=4;
		//arr[3]=4;
		
		
		int a[] = {1,2,3,4};
		System.out.println(a.length);
		
//		int b[][] = new int[2][2];
//		b[0][0] = 1;
//		b[0][1] = 1;
//		b[1][0] = 1;
//		b[1][1] = 1;
//		System.out.println(b.length);
//		System.out.println(b[0].length);
//		System.out.println(b[1].length);
		
		
		int b[][] = new int[2][2];
		b[0][0] = 1;
		b[0][1] = 1;
		b[1][0] = 1;
		b[1][1] = 1;
		b[1][2] = 1;
		b[1][3] = 1;
		System.out.println(b.length);
		System.out.println(b[0].length);
		System.out.println(b[1].length);
		
		 String[][] names = {
		            {"Mr. ", "Mrs. ", "Ms. "},
		            {"Smith", "Jones"}
		        };
		 System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][2] + names[1][1]);
		
	}
}

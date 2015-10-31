package com.java.ex.arrays;

public class ArraysEx 
{
	public static void main(String[] args) {
		
		int arr[] = { 101,102,103,104,105,106};
		System.out.println(arr.length);
		String sarr[] = { "sudheer","kumar","ambitious","technologies"};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		for(int i=0;i<sarr.length;i++)
		{
		System.out.println(sarr[i]);	
		}
		
		
	}
	
	public void arrExWay1()
	{
		int arr[]= new int[5];
		arr[0]=101;
		arr[1]=102;
		arr[2]=103;
		arr[3]=104;
		arr[4]=105;
		
		
		for(int i =0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
}

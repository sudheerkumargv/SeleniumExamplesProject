package com.java.ex.execeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExOfCheckedException {
	public static void main(String[] args) throws FileNotFoundException 
	{
		ExOfCheckedException ex = new ExOfCheckedException();
		
			ex.display();
			System.out.println("Done main method");
		
	}

	
	
	
	public void display() throws FileNotFoundException
	{
		File file = new File("d:\\abc1.txt");
		FileReader reader = new FileReader(file);
		System.out.println("Done");
		
	}
}

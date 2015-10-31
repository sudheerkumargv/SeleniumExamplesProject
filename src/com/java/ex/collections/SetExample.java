package com.java.ex.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		boolean a1 =set.add(3);
		boolean a2 = set.add(3);
		set.add(4);
		set.remove(0);
		
		System.out.println(a1);
		System.out.println(a2);
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext())
		{
			Integer next = iterator.next();
			System.out.println(next);
		}
		
		if(set.contains(30))
		{
			System.out.println("exists");
		}
		else
		{
			System.out.println("Not Exists");
		}
		
		
	}
}

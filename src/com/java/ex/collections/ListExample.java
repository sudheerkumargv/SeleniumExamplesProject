package com.java.ex.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
		public static void main(String[] args) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(3);
			list.add(4);
			list.remove(0);
			
			
			for(int i=0;i<list.size();i++)
			{
				Integer integer = list.get(i);
				System.out.println(integer);
			}
			
			Iterator<Integer> iterator = list.iterator();
			while(iterator.hasNext())
			{
				Integer next = iterator.next();
				System.out.println(next);
			}
			
			
			
			
		}
}

package com.java.ex.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample 
{
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "A");
		map.put(102, "B");
		map.put(103, "C");
		map.put(104, "D");
		map.put(104, "E");
		map.put(105, "F");
		
		map.remove(101);
		
		//retrieve single element
		String valueOfMap = map.get(102);
		System.out.println(valueOfMap);
		
		//retrieve all the elements
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext())
		{
			Integer i = iterator.next();
			String value = map.get(i);
			System.out.println(value);
		}
		
		
	}
}

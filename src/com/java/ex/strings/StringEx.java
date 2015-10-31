package com.java.ex.strings;

public class StringEx {

	public static void main(String[] args) {
//		String s = " abcdefghij  ";
//		char charAt = s.charAt(3);
//		System.out.println(charAt);//c
//		
//		System.out.println("LowerCase:"+s.toLowerCase());
//		System.out.println("UpperCase:"+s.toUpperCase());
//		System.out.println("trim:"+s.trim());
//		System.out.println("lenght:"+s.length());//12
//		String replace = s.replace('c', 'z');
//		System.out.println(replace==s);
//		System.out.println("replaced String"+replace);
//		System.out.println("The actual string:"+s);
//		System.out.println("only begin string:"+s.substring(2));
//		System.out.println(s.substring(2, 5)); //2 to (5-1), begin, end-1
		
		String s1 ="aBC";
		String s2="abc";
		String s3= new String("abc");
		String s4= new String("abc");
		
//		boolean r1 = s1==s2; //when we use "==" it compares object's adress
//		System.out.println(r1);
//		
//		boolean r2 = s3==s4;
//		System.out.println(r2);
//		
//		boolean r3 = s1.equals(s2);
//		boolean r4 = s3.equals(s4);
//		boolean r5 = s1.equals(s3);
//		System.out.println(r3 +":" + r4 + ":" + r5);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
	}
	
}

package com.java.ex;

public class StringEx {
	public static void main(String[] args) {
		String s="abcdefgh"; //0-7
		System.out.println(s.charAt(2)); //c
		System.out.println(s.concat("ijkl")); //abcdefeghijkl
		System.out.println(s); //?
		System.out.println(s.toUpperCase());
		System.out.println(s.substring(3, 7)); //defg
	}
}

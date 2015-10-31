package com.java.ex.accessmodifiers.sub;

import com.java.ex.accessmodifiers.AProEx;

public class BExPro extends AProEx{
	public static void main(String[] args) {
		BExPro b = new BExPro();
		int a = b.modelNo;
		b.msg();
	}
}

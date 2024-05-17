package com.Unboxing;

public class Unboxing {

	public static void main(String[] args) {
		
		Integer aObj = Integer.valueOf(45);
		Boolean bObj = Boolean.valueOf(true);
		
		int a = aObj.intValue();
		boolean b = bObj.booleanValue();
		
		
		System.out.println(a);
		System.out.println(b);
	}

}

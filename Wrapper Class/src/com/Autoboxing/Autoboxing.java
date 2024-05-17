package com.Autoboxing;

public class Autoboxing {
	public static void main(String[] args) {
		int a = 5;
		boolean b = true;
		
		Integer aObj = Integer.valueOf(a);
		Boolean bObj = Boolean.valueOf(b);
		
		if (aObj instanceof Integer) {
			System.out.println("An object of integer is created");
		}
		
		if (bObj instanceof Boolean) {
			System.out.println("An object of Boolean is created");
		}
		
		
		System.out.println(aObj);
		System.out.println(bObj);
	}
}

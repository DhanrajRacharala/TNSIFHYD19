package com.Encapsulation;

public class MainEncapsulatio2 {
	
	public static void main(String[] args) {
		Encapsulation2 e2 = new Encapsulation2();
		System.out.println(e2.age); // prints 20
		System.out.println(e2.name); // results an error bcoz it a private
		System.out.println(e2.a); // results an error bcoz it a private
		System.out.println(e2.bark1()); // prints 20
	}
	

}

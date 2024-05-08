package com.OverloadAndOverride;

public class MainOverloadA_B {

	public static void main(String[] args) {
		OverloadB b1 = new OverloadB();
		System.out.println(b1.display(5)); // gets override and prints display() in OverloadB
		System.out.println(b1.display1());
	}

}

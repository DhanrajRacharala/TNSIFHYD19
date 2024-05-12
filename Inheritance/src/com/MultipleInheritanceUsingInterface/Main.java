package com.MultipleInheritanceUsingInterface;

public class Main extends Animal implements Dog {
	
	public void bark() {
		System.out.println("I am in bark method");
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.bark();
		m.getAnimal();
	}

}

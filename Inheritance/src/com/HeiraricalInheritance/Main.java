package com.HeiraricalInheritance;

public class Main {
	public static void main(String[] args) {
		Cat c = new Cat();
		System.out.println("Cat method \n");
		c.getAnimal();
		c.shouting();
		System.out.println("----------------------------------------");
		System.out.println("Dog methods \n");
		
		Dog d = new Dog();
		d.bark();
		d.getAnimal();
	}

}

package com.constructors;

public class ParameterizedConstructor {
	public String name = "Raju";
	public int age = 17;
	public String section = "IOT";
	
	public ParameterizedConstructor(String name, int age, String section) {
		this.name = name;
		this.age = age;
		this.section = section;
	}
	
	public void getNameAgeSection() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.section);
	}
	
}

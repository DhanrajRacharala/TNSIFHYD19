package com.InstanceAndStatic;

public class Test_InstanceAndStatic {

	public static void main(String[] args) {
		InstanceAndStatic ias = new InstanceAndStatic();
		System.out.println(ias.a);
		ias.display();
		System.out.println(ias.getInteger(45));
		System.out.println("");
		
		System.out.println(InstanceAndStatic.b);
		InstanceAndStatic.display1();
		System.out.println(InstanceAndStatic.getinteger1(78));

	}

}

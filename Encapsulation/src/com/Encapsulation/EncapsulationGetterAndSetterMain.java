package com.Encapsulation;

public class EncapsulationGetterAndSetterMain {
	public static void main(String[] args) {
		EncapsulationGetterAndSetter gs = new EncapsulationGetterAndSetter();
		
		System.out.println("Before setting"); 
		System.out.println(); 
		
		System.out.println(gs.getName());
		System.out.println(gs.getAddress());
		System.out.println(gs.getRollNo());
		System.out.println(gs.getSurName()); 
		
		System.out.println("----------------------------------------------------");
		System.out.println("After setting"); 
		System.out.println(); 
	
		
		
		gs.setName("Suresh"); // sets name (public) as  
		System.out.println(gs.getName()); 
		
		gs.setAddress("Bangalore");
		System.out.println(gs.getAddress());
		
		gs.setRollNo(20);
		System.out.println(gs.getRollNo());
		
		gs.setSurName("Bhatti");
		System.out.println(gs.getSurName()); 
		
		
		
	}
}

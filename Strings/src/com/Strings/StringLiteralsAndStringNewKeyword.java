package com.Strings;

public class StringLiteralsAndStringNewKeyword {

	public static void main(String[] args) {

		String s1 = "Internet";
		System.out.println(s1);
		String s2 =  new String( "Internet");
		System.out.println(s2);
		String s3 = "Technology" ;
		System.out.println(s3);
		
		
		System.out.println();
		
		System.out.println(s1.equals(s2)); // equals method compare based on content i.e, values
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		
		System.out.println();
		
		System.out.println(s1.compareTo(s2)); // compareTo method compare based on ASCII values 
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s2));
		
		System.out.println();
		
		System.out.println(s1 == s2); // == operator compare based on reference i.e, memory location
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);


	}

}

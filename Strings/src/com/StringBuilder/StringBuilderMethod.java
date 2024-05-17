package com.StringBuilder;

public class StringBuilderMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Python "); // StringBuilder is mutable
		System.out.println(sb); 
		
		sb.append("Java "); 
		System.out.println(sb); 
		
		sb.insert(0, "hi ");
		System.out.println(sb); 
		
		sb.replace(0, 2, "Hey");
		System.out.println(sb); 
		
		sb.delete(0, 4);
		System.out.println(sb);

	}

}

package com.StringBuffer;

public class StringBufferMethod { 

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello "); // String Buffer is mutable where as String literal and also with new keydword are not mutable
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

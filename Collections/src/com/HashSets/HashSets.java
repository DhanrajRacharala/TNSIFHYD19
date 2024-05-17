package com.HashSets;

import java.util.Iterator;
import java.util.*;

public class HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashSet<Integer> a = new HashSet<Integer>();
//		a.add(1);
//		a.add(2);
//		a.add(3);
//		a.add(4);
//		
//		System.out.println(a);
//		
//		for (int i=5; i<=10; i++) {
//			a.add(i);
//		}
//		
//		System.out.println(a);
//		
//		a.remove(2); // giving index number
//		System.out.println(a);
//		
//		System.out.println(a.contains(5));
//		
//		a.remove(8); // giving index number
//		
//		System.out.println(a);
//		
//		System.out.println(a.size());
//		
//		Iterator<Integer> itr = a.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		for (int i : a) {
//			System.out.println(i);
//		}
//		 
//		a.clear();
		
		HashSet<String> h = new HashSet<String>();
		h.add("Java");
		h.add("Python");
		h.add("C");
		h.add("Java");
		h.add("python");
		h.add("C++");
		
		System.out.println(h);
		
		for (String i : h) {
			System.out.println(i);
		}

	}

}

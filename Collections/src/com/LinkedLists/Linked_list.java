package com.LinkedLists;

import java.util.*;
import java.util.Iterator;

public class Linked_list {
	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		System.out.println(a);
		
		for (int i=5; i<=10; i++) {
			a.add(i);
		}
		
		System.out.println(a);
		
		a.remove(2); // giving index number
		System.out.println(a);
		
		System.out.println(a.get(3)); //  giving index number
		
		a.set(1, 3); // replacing the element with index 
		
		System.out.println(a);
		
		a.remove(8); // giving index number
		
		System.out.println(a);
		
		System.out.println(a.size());
		
		Iterator<Integer> itr = a.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		a.clear();
}
}

package com.HashMaps;
import java.util.*;

public class HashMaps {

	public static void main(String[] args) {
		
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		
		h.put(1, "Java");
		h.put(2, "Python");
		h.put(3, "Ruby");
		h.put(4, "C++");
		
		System.out.println(h);
		
		System.out.println(h.get(1)); // we pass the reference of the key
			
		System.out.println(h.remove(3)); // removes based on the key
		
		for (int i: h.keySet()) {
			System.out.println("key: " + i+" value: "+h.get(i) );
		}
		System.out.println();
		for (String j: h.values()) {
			System.out.println(j);
		}

	}

}

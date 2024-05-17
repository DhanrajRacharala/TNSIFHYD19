package com.sriindu.threads;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome Dhanraj");
		System.out.println(Thread.activeCount()); // it gives no of threads running
		System.out.println(Thread.currentThread().getName()); // it return the built in main thread
		System.out.println(Thread.currentThread().getId()); // gives the id of the main thread
		System.out.println(Thread.currentThread().getPriority()); // gives the normal priority i.e, 5
	}

}

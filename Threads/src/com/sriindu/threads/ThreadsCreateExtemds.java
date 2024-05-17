package com.sriindu.threads;

public class ThreadsCreateExtemds {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.start();
	}

}


class Employee extends Thread {
	
	public void run() {
		System.out.println("Running");
	}
}
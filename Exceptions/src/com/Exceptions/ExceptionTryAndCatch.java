package com.Exceptions;

public class ExceptionTryAndCatch {
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		try {
			int b = 50/5;
			a[5] = 6;
			
			// System.out.println(a);
		}
		
		catch (ArithmeticException  e) {
			System.out.println(e);
		}
		
		catch (ArrayIndexOutOfBoundsException f) {
			System.out.println(f);
		}
		
		catch (Exception g) {
			System.out.println(g);
		}
	}

}

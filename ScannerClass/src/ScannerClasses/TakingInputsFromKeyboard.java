package ScannerClasses;
import java.util.*; // importing scanner class or we can write as import java.util.Scanner;

public class TakingInputsFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		System.out.println(i);
	
		String s = sc.next();
		System.out.println(s);
		
		long l = sc.nextLong();
		System.out.println(l);
		
		double d = sc.nextDouble();
		System.out.println(d);
		
		
		String g = sc.nextLine();
		System.out.println(g);
		
		float f = sc.nextFloat();
		System.out.println(f);
		
		char c = sc.nextLine().charAt(0);
		System.out.println(c);

	}

}

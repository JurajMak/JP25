package vjezbanje;

import java.util.Scanner;

public class oduzimanje {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Oduzmi broj: ");
		float a = sc.nextFloat();
		System.out.print("Sa brojem: ");
		float b = sc.nextFloat();
		
		System.out.println("Rezultat je: "+ (a-b));
		
		sc.close();
		
	}

}

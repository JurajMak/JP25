package vjezbanje;

import java.util.Scanner;

public class viseoperacija {

	public static void main(String[] args) {
		float a;
		float b;
		String oper;
		
		Scanner br = new Scanner(System.in);
		System.out.print("Upiši broj: ");
		a =br.nextFloat();
		
		Scanner op =  new Scanner(System.in);
		System.out.print("Unesi željenu operaciju: ");
		oper=op.next();
		
		System.out.print("Upiši broj: ");
		b = br.nextFloat();
		
		
		if(oper.equals("+"))
		{ System.out.println("Rezultat je: "+ (a+b));}
		
		if(oper.equals("-"))
		{System.out.println("Rezultat je: "+ (a-b));}
		
		if(oper.equals("/"))
		{System.out.println("Rezultat je: "+ (a/b));}
		
		if(oper.equals("*"))
		{System.out.println("Rezultat je: "+ (a*b));}
		
		br.close();
		op.close();
		
	
	
		
	}


}

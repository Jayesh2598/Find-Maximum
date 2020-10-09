package com.capgemini.findMax;

import java.util.Scanner;

public class FindMaximum {
	
	static Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome!");
		
		System.out.println("Enter three Integers:");
		int a1 = SC.nextInt();
		int a2 = SC.nextInt();
		int a3 = SC.nextInt();
		System.out.println("The maximum of the three Integers is: "+findMaximum(a1, a2, a3));
		
		System.out.println("Enter three Floats:");
		Float b1 = SC.nextFloat();
		Float b2 = SC.nextFloat();
		Float b3 = SC.nextFloat();
		System.out.println("The maximum of the three Floats is: "+findMaximum(b1, b2, b3));
		
		System.out.println("Enter three Strings:");
		String c1 = SC.next();
		String c2 = SC.next();
		String c3 = SC.next();
		System.out.println("The maximum of the three Strings is: "+findMaximum(c1, c2, c3));
	}
	
	public static <E extends Comparable<E>> E findMaximum(E a, E b, E c) {
		E maximum;
		if(a.compareTo(b)>0 && a.compareTo(c)>0)
			maximum = a;
		else if(b.compareTo(a)>0 && b.compareTo(c)>0)
			maximum = b;
		else
			maximum = c; 
		return maximum;
	}
}

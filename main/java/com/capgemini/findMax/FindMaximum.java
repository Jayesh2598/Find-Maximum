package com.capgemini.findMax;

import java.util.Scanner;

public class FindMaximum {
	
	static Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome!");
		System.out.println("Enter three float values:");
		float a = SC.nextFloat();
		float b = SC.nextFloat();
		float c = SC.nextFloat();
		System.out.println("The maximum of the three is "+ findMax(a, b, c));
	}
	
	public static Float findMax (Float a , Float b, Float c) {
		Float maximum;
		if(a.compareTo(b)>0 && a.compareTo(c)>0)
			maximum = a;
		else if(b.compareTo(a)>0 && b.compareTo(c)>0)
			maximum = b;
		else
			maximum = c; 
		return maximum;
	}
}

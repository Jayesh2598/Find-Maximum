package com.capgemini.findMax;

import java.util.Scanner;

public class FindMaximum<E extends Comparable<E>> {

	static Scanner SC = new Scanner(System.in);

	E a, b, c;

	public FindMaximum(E a, E b, E c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public E testMaximum() {
		return findMaximum(a, b, c);
	}

	public static void main(String[] args) {
		System.out.println("Welcome!");

		System.out.println("Enter three Integers:");
		int a1 = SC.nextInt();
		int a2 = SC.nextInt();
		int a3 = SC.nextInt();
		FindMaximum<Integer> maxInt = new FindMaximum<Integer>(a1, a2, a3);
		System.out.println("The maximum of the three Integers is: " + maxInt.testMaximum());

		System.out.println("Enter three Floats:");
		Float b1 = SC.nextFloat();
		Float b2 = SC.nextFloat();
		Float b3 = SC.nextFloat();
		FindMaximum<Float> maxFloat = new FindMaximum<Float>(b1, b2, b3);
		System.out.println("The maximum of the three Floats is: " + maxFloat.testMaximum());

		System.out.println("Enter three Strings:");
		String c1 = SC.next();
		String c2 = SC.next();
		String c3 = SC.next();
		FindMaximum<String> maxString = new FindMaximum<String>(c1, c2, c3);
		System.out.println("The maximum of the three Strings is: " + maxString.testMaximum());
	}

	public static <E extends Comparable<E>> E findMaximum(E a, E b, E c) {
		E maximum;
		if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
			maximum = a;
		else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
			maximum = b;
		else
			maximum = c;
		return maximum;
	}
}

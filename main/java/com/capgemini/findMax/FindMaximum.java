package com.capgemini.findMax;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaximum<E extends Comparable<E>> {

	static Scanner SC = new Scanner(System.in);

	E maximum;

	public void printMax() {
		System.out.println(maximum);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Test Maximum program!");

	}

	public E findMaximum(E... values) {
		Arrays.sort(values);
		this.maximum = values[values.length - 1];
		printMax();
		return maximum;
	}
}

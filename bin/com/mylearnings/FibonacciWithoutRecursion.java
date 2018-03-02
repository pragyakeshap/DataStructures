package com.mylearnings;

public class FibonacciWithoutRecursion {

	public static void main(String[] args) {

		int[] a = new int[15];
		a[0] = 0;
		a[1] = 1;
		System.out.println(a[0]);
		System.out.println(a[1]);
		for (int i = 2; i < 15; i++) {

			a[i] = a[i - 1] + a[i - 2];
			System.out.println(a[i]);
		}

	}

}

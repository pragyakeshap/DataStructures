package com.mylearnings;

public class Fibonacci {

	public static void main(String[] args) {
		
		for(int i = 0; i < 20; i++) {
			System.out.println(fib(i));
		}
		
	}

	public static int fib(int n) {		
		if(n==1 || n == 0) {
			return n;
		}
		return  fib(n-1) + fib(n-2);
		
	}
}

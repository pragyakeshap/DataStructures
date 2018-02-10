package com.mylearnings.codility;

public class DivisibleHighestPowTwo {
	
	Double[] twoPowers = new Double[10];

	public static void main(String[] args) {
		
		DivisibleHighestPowTwo pow = new DivisibleHighestPowTwo();
		pow.initPower();
		pow.checkHighestPow(384);
		
		int i= 100_000_000;
	
	}
	
	
	public int initPower() {
		for(int i=0; i< twoPowers.length ; i++) {
			Double two = 2.0;
			twoPowers[i] = Math.pow(two, new Double(i));
			System.out.println(twoPowers[i]);
		}
		
		return 0;
	}
	
	public int checkHighestPow(int a) {
		if(! (a%2 == 0)) {
			System.out.println("Odd Number");
			return 0;
		}
		for(int i=twoPowers.length-1; i>=0; i--) {
			if(a % twoPowers[i] == 0) {
				System.out.println(i+" is the highest power");
				return i;
			}
		}
		return 0;
	}

}

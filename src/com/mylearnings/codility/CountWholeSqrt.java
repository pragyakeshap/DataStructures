package com.mylearnings.codility;

/*
 * Program to count perfect squareroots with in given range i.e. between a and b
 */

public class CountWholeSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      countSqrt(4,17);
	}

	public static int countSqrt(int a, int b) {
		int count = 0;
		for(int i=a; i <=b; i++) {
			double sqrt = Math.sqrt(new Double(i));
			int x = (int)sqrt;
			if(Math.pow(sqrt, 2) == Math.pow(x, 2)) {
				count++;
				System.out.println(x);
				System.out.println(count);
			}
		}
		
		return count;
	}
}

package com.mylearnings.codility;

import java.util.stream.IntStream;

public class AbsDistinct {

	public static void main(String[] args) {
		int[] A = { -5, -3, -1, 0, 3, 6 };
		System.out.println(distinct(A));
	}

	public static int distinct(int[] A) {

		return (int) IntStream.of(A).map(e -> Math.abs(e)).distinct().count();
	}
	
	public static int mySolution(int[] A) {

		return (int)IntStream.of(A).map(e -> Math.abs(e)).distinct().count();
		
		//return (int) IntStream.of(A).map(e -> Math.abs(e)).distinct().count();
	}
}
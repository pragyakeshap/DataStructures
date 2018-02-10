package com.mylearnings.codility;

public class DavidStairCase {

	public static int solve(int num) {
		switch (num) {
		case 0:
		case 1:
			return 1;
		default:
			if (num < 0)
				return 0;

			int[] waysArr = new int[num];

			waysArr[0] = 1;
			waysArr[1] = 2;
			waysArr[2] = 4;

			for (int i = 3; i < num; i++) {
				waysArr[i] = waysArr[i - 1] + waysArr[i - 2] + waysArr[i - 3];
			}
			int ways = waysArr[waysArr.length - 1];
			waysArr = null;
			return ways;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(solve(5));
	}
}

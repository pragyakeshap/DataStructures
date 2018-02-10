package com.mylearnings.codility;

import java.util.Arrays;

public class MissingInteger {

	public static void main(String[] args) {
		int[] A = new int[] { 1, 3, 6, 4, 1, 2, 5, 9 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		// sort and remove duplication
		int[] AN = Arrays.stream(A).distinct().sorted().toArray();

		for (int i = 0; i < AN.length; i++) {
			if (i > 0 && !(AN[i] == AN[i - 1] + 1)) {
				return (AN[i] + AN[i - 1]) / 2;
			}
		}

		return -1;
	}

	static String findNumber(int[] arr, int k) {
		int[] sorted = Arrays.stream(arr).distinct().sorted().toArray();
		
		for(int i = 0; i < sorted.length ; i++) {
			if(sorted[i]== k) {
				return "YES";			}
		}

		return "NO";

	}

	 static int[] oddNumbers(int l, int r) {
			
			if (r < l) {
				int[] res = {-1};
				
				return res;
			}
	       
	       int[] res = new int[(r - l / 2) + 1];
			int f = 0;
			for (int i = l; i <= r; i++) {

				if (!(i % 2 == 0)) {// i.e. an odd number
					System.out.print(" " + i);
					res[f] = i;
					f++;
				}
			}
			return res;
		}
}

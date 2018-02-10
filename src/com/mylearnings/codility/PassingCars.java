package com.mylearnings.codility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PassingCars {
	public static void main(String[] args) {
		//int[] A = new int[] { 0, 1, 0, 1, 1 };
		//System.out.println(solution(A));
		//System.out.println(testFilter());
		testFilter();
	}

	public static int solution(int[] A) {
		int res = 0;
		int ones = 0;

		for (int i = A.length - 1; i >= 0; i--) {

			if (A[i] == 1)
				ones++;
			else {
				res += ones;
			}

			if (res > 1000000000)
				return -1;
		}
		return res;
	}

	public static void testFilter() {
		String[] presets = { "A", "B", "C", "D", "CA" };

		// Find all matching
		List<String> resultList = Arrays.stream(presets).filter(x -> x.startsWith("C")).collect(Collectors.toList());
		System.out.println(resultList);

		// Find first matching
		String firstResult = Arrays.stream(presets).filter(x -> x.startsWith("C")).findFirst().orElse(null);
		System.out.println(firstResult);

	}
}

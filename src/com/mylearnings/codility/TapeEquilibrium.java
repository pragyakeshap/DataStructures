package com.mylearnings.codility;


/*A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape. Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1]. The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])| In other words, it is the absolute difference between the sum of the first part and the sum of the second part. For example, consider array A such that: A[0] = 3 A[1] = 1 A[2] = 2 A[3] = 4 A[4] = 3 We can split this tape in four places:

P = 1, difference = |3 − 10| = 7 P = 2, difference = |4 − 9| = 5 P = 3, difference = |6 − 7| = 1 P = 4, difference = |10 − 3| = 7

Write a function:
class Solution { public int solution(int[] A); } that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved. For example, given: A[0] = 3 A[1] = 1 A[2] = 2 A[3] = 4 A[4] = 3 the function should return 1, as explained above.

Assume that:
N is an integer within the range [2..100,000]; each element of array A is an integer within the range [−1,000..1,000].

Complexity:
expected worst-case time complexity is O(N); expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments). Elements of input arrays can be modified.
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TapeEquilibrium {

	public static int solution(int[] array) {
		List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
		int leftSum = 0;
		int rightSum = 0;
		List<Integer> ints = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				leftSum = list.get(0);
				rightSum = Arrays.stream(Arrays.copyOfRange(array, 1, list.size())).sum();
			} else if (i != array.length - 1) {
				leftSum = Arrays.stream(Arrays.copyOfRange(array, 0, i + 1)).sum();
				rightSum = Arrays.stream(Arrays.copyOfRange(array, i + 1, list.size())).sum();
			}
			if (i != array.length - 1 || i == 0)
				ints.add(Math.abs(leftSum - rightSum));

		}

		Collections.sort(ints);
		return ints.get(0);
	}

	public static int solution2(int[] A) {
		int expectedMinimum = Integer.MAX_VALUE;
		int tmp = 0;
		int sum = 0;

		sum = Arrays.stream(A, 0, A.length).sum();

		for (int i = 0; i < A.length - 1; i++) {
			tmp += A[i];
			expectedMinimum = Math.min(expectedMinimum, Math.abs(tmp - (sum - tmp)));
		}
		return expectedMinimum;
	}

	public static void main(String[] args) {
		int[] array = { 3, 1, 2, 4, 3 };
		System.out.println(solution(array));
		System.out.println(solution2(array));

	}
}
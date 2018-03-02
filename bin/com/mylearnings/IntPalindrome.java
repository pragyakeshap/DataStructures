package com.mylearnings;

public class IntPalindrome {

	public static void main(String[] args) {
		Integer orig = 1234321;
		Integer rev = 0;

		checkPalindrome(orig, rev);

	}

	private static void checkPalindrome(Integer orig, Integer rev) {
		Integer a = orig;
		while (a % 10 > 0) {
			int rem = a % 10;
			a = a / 10;
			System.out.println(a + " *** a");
			rev = rev * 10 + rem;
			System.out.println(rev + " *** rev");
		}

		if (orig.equals(rev)) {
			System.out.println("Input number is a Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}

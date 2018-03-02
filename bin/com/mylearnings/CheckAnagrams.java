package com.mylearnings;

import java.util.Arrays;

public class CheckAnagrams {

	public static void main(String[] args) {

		String a = "Debit Card";
		String b = "Bad Credit";

		String aCopy = a.replaceAll("\\s", "").toLowerCase();
		String bCopy = b.replaceAll("\\s", "").toLowerCase();
		;
		System.out.println(isAnagram(aCopy, bCopy));

	}

	public static boolean isAnagram(String a, String b) {

		if (a.length() != b.length()) {
			System.out.println("The words are not Anagrams");
			return false;
		} else {
			char[] aa = a.toCharArray();
			char[] bb = b.toCharArray();

			Arrays.sort(aa);
			Arrays.sort(bb);

			// for(int i =0; i <aa.length; i++ ){
			// if(aa[i]) != bb[i]){
			// System.out.println("The words are not Anagrams");
			// return false;
			// }
			// }

			if (Arrays.equals(aa, bb)) {
				System.out.println("The words are Anagrams");
				return true;
			} else {
				System.out.println("The words are not Anagrams");
				return false;
			}

		}

	}

}

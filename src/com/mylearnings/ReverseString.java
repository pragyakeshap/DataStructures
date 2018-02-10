package com.mylearnings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start Time : "+ System.currentTimeMillis());

		ReverseString rs = new ReverseString();
		System.out.println(rs.reverse("Pragya", ""));
		
		System.out.println("End Time : "+ System.currentTimeMillis());
	}
	
	public String reverse(String str, String rev) {
		int length = str.length();
		if(length == 1) {
			return rev+str;
		}
		
		if(str.length()  > 1) {
		
		char lastChar = str.charAt(length-1);
		rev = rev + lastChar ;
		return reverse( str.substring(0, length-1) , rev);	
		
		}
		return "";
		
	}

}

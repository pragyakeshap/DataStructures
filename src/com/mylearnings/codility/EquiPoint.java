package com.mylearnings.codility;

public class EquiPoint {

	public static void main(String[] args) {
		
		int input[] = {1,7,3,2,5,3,4,3,1,1,7,1,5,3};

	}
	
	public void findEquiPoint(int[] in) {
		int l= in.length;
		int leftSum =0;
		int rightSum = 0;
		
		for( int i =0, j= l-1 ; (i<l && j>=0) ; i++, j++) {
			leftSum += in[i];
			rightSum += in[j];
		}
	}

}

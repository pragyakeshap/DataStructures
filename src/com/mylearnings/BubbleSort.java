package com.mylearnings;

public class BubbleSort {

	public static void main(String[] args) {
		int input[] = {5,7,6,8,65,87,12,3,343,44,767,78};
		BubbleSort sort = new BubbleSort();
		int[] out = sort.bubbleSort(input);
		for(int i = 0; i < out.length; i++) {
			System.out.println(out[i]);
		}
	}

	
	public int[] bubbleSort(int inp[]) {
		int len = inp.length;
		for(int i = 0; i < len; i++) {
			// start from 1 else we will get ArrayIndexOutOfBoundsException
			for(int j=1; j< len-i; j++) {
				if(inp[j-1] > inp[j]) {
					int temp = inp[j-1];
					inp[j-1] = inp[j];
					inp[j] = temp;
				}
			}
		}
		return inp;
	}
}

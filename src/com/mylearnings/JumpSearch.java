package com.mylearnings;

public class JumpSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sortedInput[] = {5,6,12,15,18,25,45,65,70,75,78,80,82,83,85,88,90,98,100,105,107};
		JumpSearch se =  new JumpSearch();
		System.out.println(se.jumpSearch(sortedInput, 0, 4, 4, 85));
	}
	
	public int jumpSearch(int[] input , int start , int end, int jump , int search) {
		//int mid = (end - start) /2;
		if(end <= input.length) {
		if((input[start] >= search) || (search < input[end])) {
			for(int i =start ; i <= end ; i++) {
				if(search == input[i]) {
					return i;
				}
			}
		}else {
			return jumpSearch(input , end , end + jump, jump,  search);
		}
		}
		return -1;
	}

}

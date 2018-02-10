package com.mylearnings;

public class BinarySearch {

	public static void main(String[] args) {
		int input[] = {5,7,6,8,65,87,12,3,343,44,767,78};
		int sortedInput[] = {5,6,12,15,18,25,45,65,70,75,78,80,82,83,85,88,90,98,100,105,107};
		BinarySearch search  = new BinarySearch();
		int index = search.binarySearch(sortedInput, 0, sortedInput.length, 65);
		System.out.println(index);
	}
	
	public int binarySearch(int[] input, int startIndex, int endIndex, int search) {
		if(startIndex <= endIndex) {
		
			int mid= startIndex + (endIndex - startIndex)/2;
			int midVal = input[mid];
			if(midVal == search) {
				//System.out.println("Value found at index : "+mid);
				return mid;
			}else if(search < midVal) {
				return binarySearch(input, startIndex , mid-1, search);
			}else {
				return binarySearch(input, mid+1, endIndex, search);
			}
		}
		
		return -1;
	}

}

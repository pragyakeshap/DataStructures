package com.mylearnings;

public class FloorValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr =  {-1, 2, 3, 5, 6, 8, 9, 10};
		FloorValue fv = new FloorValue();
		System.out.println(fv.findFloor(arr, 11));
	}
	
	public int findFloor(int[] a, int key) {
		
		for(int i= 0; i < a.length ; i++) {
			if(a[i] > key) {
				// First element is higher
				if(i == 0) {
				System.out.println("No floor value found !! ");
				return -1;
				}else {
					return a[i-1];
				}
			
			}else if(i == a.length -1) {
				return a[i];
			}
		}
		
		return -1;
	}

}

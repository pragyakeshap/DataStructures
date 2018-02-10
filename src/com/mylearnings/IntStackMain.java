package com.mylearnings;

public class IntStackMain {

	public static void main(String[] args) {
		
		IntStack stack = new IntStack(10);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.printf("Geeks");
	}

}

package com.mylearnings;

public class IntStack {

	int size;
	int[] stack;
	int top;

	 IntStack() {
		size = 50;
		top = -1;
		stack = new int[50];
	}

	 IntStack(int size) {
		this.size = size;
		top = -1;
		stack = new int[size];
	}

	public boolean push(int value) {

		if (!isFull()) {
			stack[++top] = value;
			return true;
		}
		return false;
	}

	public int pop() {
		return stack[top--];
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

}

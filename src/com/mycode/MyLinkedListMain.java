package com.mycode;

public class MyLinkedListMain {

	public static void main(String[] args) {

		MyLinkedList list =  new  MyLinkedList(5);
		list.insertNode(6);
		list.insertNode(7);
		list.insertNode(8);
		list.insertNode(9);
		
		list.traverse();
		System.out.println();
		list.sortList();
		System.out.println();
		list.traverse();
	}

}

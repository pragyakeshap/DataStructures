package com.mycode;

public class MyLinkedList {

	Node head;

	MyLinkedList(int data) {
		head = new Node(data);
	}

	public boolean insertNode(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;

		return true;
	}

	public void traverse() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public boolean deleteNode(int data) {

		if (head.data == data) {
			System.out.println("Found Node !! Deleting ..");
			Node next = head.next;
			return true;
		} else {
			Node first = head;
			Node second = head.next;

			while (true) {
				// Break the loop if we have either found the element or reached
				// the end of list
				if (second.data == data || second == null) {
					break;
				} else {
					first = second;
					second = second.next;
				}

			}

			if (second != null) {
				first.next = second.next;
				return true;
			} else {
				return false;
			}
		}

	}

	public void sortList() {
		Node first = head;
		Node second = head.next;

		while (second != null) {
			if (first.data > second.data) {
				int temp = first.data;
				first.data = second.data;
				second.data = temp;
				System.out.println(first.data);
				System.out.println(second.data);
			}
			
			first = second;
			second = second.next;
		}
	}

}

class Node {

	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}

}

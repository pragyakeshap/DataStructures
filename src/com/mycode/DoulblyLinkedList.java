package com.mycode;

public class DoulblyLinkedList {
	
	
	class DoubleNode{
		
		DoubleNode prev;
		int data;
		DoubleNode next;
		DoubleNode head;
		
		public DoubleNode(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
		
		public boolean addNode(){
			return true;
		}
	}

}

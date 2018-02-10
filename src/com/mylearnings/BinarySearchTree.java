package com.mylearnings;

public class BinarySearchTree {
	
	Node root = null;
	
	class Node{
		int data;
		Node left, right;
		
		Node(int data){
			this.data= data;
			this.left = null;
			this.right = null;
		}
		
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertFirst(70);
		bst.insertFirst(100);
		bst.insertFirst(60);
		bst.insertFirst(30);
		bst.insertFirst(50);
		bst.insertFirst(80);
		bst.insertFirst(40);
		bst.insertFirst(20);

		bst.inorder();
	}
	
	public void insertFirst(int d ) {
		root = insert(d, root);
	}
	
	public void inorder() {
		inorderTraverse(root);
	}

	public Node insert(int d, Node root) {
		
		if(root == null) {
			root =  new Node(d);
			return root; 
		}else if(d < root.data) {
			root.left = insert(d, root.left);
		}else {
			root.right = insert(d, root.right);
		}
	return root;			
	}
	
	public void inorderTraverse(Node root) {
		if(root != null) {
			inorderTraverse(root.left);
			System.out.println(root.data);
			inorderTraverse(root.right);
		}
	}
}

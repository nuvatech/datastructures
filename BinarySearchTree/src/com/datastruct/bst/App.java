package com.datastruct.bst;

public class App {

	public static void main(String[] args) {
		

	Tree<Integer> treeI = new BinarySearchTree<>();
	
	treeI.insert(new Integer(10));
	treeI.insert(new Integer(5));
	treeI.insert(new Integer(20));
	treeI.insert(new Integer(-1));  
	treeI.insert(new Integer(11));
	
	System.out.println("max value in the tree = " + treeI.getMax());
	
	System.out.println("min  value in the tree = " + treeI.getMin());

	
	System.out.println("Version 1");
	
	
	}
	
}

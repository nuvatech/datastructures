package com.datastruct.bst;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {

	private T data;

	private Node<T> leftChild;

	private Node<T> rightChild;

	public Node(T data) {
		super();
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	public String toString() {

		return this.data.toString();
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}

	public Node<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public int compareTo(Node<T> inNode) {
		return this.data.compareTo(inNode.getData());
	}
}
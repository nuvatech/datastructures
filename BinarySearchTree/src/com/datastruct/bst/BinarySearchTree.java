package com.datastruct.bst;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	private void insertNode(T newData, Node<T> node) {
		Node<T> newNode = new Node<T>(newData);
		if (newNode.compareTo(node) < 0) {
			if (node.getLeftChild() != null) {
				insertNode(newData, node.getLeftChild());
			} else {
				node.setLeftChild(newNode);
			}
		} else {
			if (node.getRightChild() != null) {
				insertNode(newData, node.getRightChild());
			} else {
				node.setRightChild(newNode);
			}
		}
	}
	
	private T getMaxNode(Node<T> node) {
		if (node.getRightChild() != null) {
			return (getMaxNode(node.getRightChild()));
		}
		return node.getData();
	}

	private T getMinNode(Node<T> node) {
		if (node.getLeftChild() != null) {
			return (getMinNode(node.getLeftChild()));
		}
		return node.getData();
	}

	@Override
	public T getMax() {
		if (root != null) {
			return (getMaxNode(root));
		} else {
			return null;
		}
	}

	@Override
	public T getMin() {
		if (root != null) {
			return (getMinNode(root));
		} else {
			return null;
		}
	}

	@Override
	public void insert(T data) {
		if (root == null) {
			root = new Node<T>(data);
		} else {
			insertNode(data, root);
		}
	}

	@Override
	public void delete(T data) {
		// TODO Auto-generated method stub
	}

	@Override
	public void traversal() {
		// TODO Auto-generated method stub
	}

}

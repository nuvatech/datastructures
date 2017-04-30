package com.datastruct.bst;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	public void insertNode(T newData, Node<T> node) {
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

	public T getMaxNode() {
		if (root != null) {
			return (getMax(root));
		} else {
			return null;
		}
	}

	public T getMinNode() {
		if (root != null) {
			return (getMin(root));
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

	@Override
	public T getMax(Node<T> node) {
		if (node.getRightChild() != null) {
			return (getMax(node.getRightChild()));
		}
		return node.getData();
	}

	@Override
	public T getMin(Node<T> node) {
		if (node.getLeftChild() != null) {
			return (getMin(node.getLeftChild()));
		}
		return node.getData();
	}
}

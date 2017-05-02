package com.datastruct.bst;

public interface Tree<T extends Comparable<T>> {

	public void insert(T data);

	public void delete(T data);

	public void traversal();

	public T getMax();

	public T getMin();

}

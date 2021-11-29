package com.dscfgos.algorithms.interfaces;

public interface Searchable {
	public abstract <T extends Comparable<T>> int find(T[] elements, T item);
}

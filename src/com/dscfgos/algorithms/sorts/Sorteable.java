package com.dscfgos.algorithms.sorts;

public interface Sorteable {
	public abstract <T extends Comparable<T>> T[] sort(T[] elements);
}

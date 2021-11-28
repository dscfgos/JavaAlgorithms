package com.dscfgos.algorithms.sorts.interfaces;

public interface Sorteable {
	public abstract <T extends Comparable<T>> T[] sort(T[] elements);
}

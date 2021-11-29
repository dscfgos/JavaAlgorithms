package com.dscfgos.algorithms.interfaces;

public interface Sorteable {
	public abstract <T extends Comparable<T>> T[] sort(T[] elements);
}

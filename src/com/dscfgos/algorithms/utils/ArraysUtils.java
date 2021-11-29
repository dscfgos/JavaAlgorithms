package com.dscfgos.algorithms.utils;

public class ArraysUtils {

	/**
	 * Prints all elements of array.
	 *
	 * @param items the array
	 */
	public static void printArray(Object items[]) {
		if (items != null && items.length > 0) {
			for (Object item : items) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
	}

	public static void printArray(String preffix, Object items[]) {
		if (items != null && items.length > 0) {
			System.out.print(preffix);
			for (Object item : items) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Return true if the first element is less than the second
	 */
	public static <T extends Comparable<T>> boolean lessThan(T obj1, T obj2) {
		return obj1.compareTo(obj2) < 0;
	}

	/**
	 * Return true if the first element is greater than the second
	 */
	public static <T extends Comparable<T>> boolean greaterThan(T obj1, T obj2) {
		return obj1.compareTo(obj2) > 0;
	}

	/**
	 * Return true if the first element is equal to the second
	 */
	public static <T extends Comparable<T>> boolean equalTo(T obj1, T obj2) {
		return obj1.compareTo(obj2) == 0;
	}

	/**
	 * Swap elements in the array
	 */
	public static <T> void swap(T[] items, int x, int y) {
		T temp = items[x];
		items[x] = items[y];
		items[y] = temp;
	}
}

package com.dscfgos.algorithms.sorts;

import com.dscfgos.algorithms.sorts.interfaces.Sorteable;
import com.dscfgos.algorithms.sorts.utils.ArraysUtils;

/**
 * Bubble Sort.
 * Compares two adjacent elements and swaps them until they are not in the
 * intended order.
 */
public class BubbleSort implements Sorteable {

	public static void main(String[] args) {
		Integer[] elements = new Integer[] { 5, 3, 2, 1, 4, 6, 7, 9, 8, 0 };

		Sorteable quickSort = new BubbleSort();
		quickSort.sort(elements);

		ArraysUtils.printArray("BubbleSort:", elements);
	}

	public <T extends Comparable<T>> T[] sort(T[] elements) {

		// Do sort if the array contains more than one element
		if (elements != null && elements.length > 1) {
			// Iterate from beginning to item before last.
			for (int i = 0; i < elements.length - 1; i++) {
				// Iterate over the remaining elements.
				for (int j = 0; j < elements.length - i - 1; j++) {
					if (ArraysUtils.greaterThan(elements[j], elements[j + 1])) {
						ArraysUtils.swap(elements, j, j + 1);
					}
				}
			}
		}

		return elements;
	}
}

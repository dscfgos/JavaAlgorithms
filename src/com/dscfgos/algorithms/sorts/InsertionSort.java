package com.dscfgos.algorithms.sorts;

import com.dscfgos.algorithms.interfaces.Sorteable;
import com.dscfgos.algorithms.utils.ArraysUtils;

/**
 * Insertion Sort.
 * Places an unsorted element at its suitable place in each iteration.
 */
public class InsertionSort implements Sorteable {

	public static void main(String[] args) {
		Integer[] elements = new Integer[] { 5, 3, 2, 1, 4, 6, 7, 9, 8, 0 };

		Sorteable quickSort = new InsertionSort();
		quickSort.sort(elements);

		ArraysUtils.printArray("InsertionSort:", elements);
	}

	public <T extends Comparable<T>> T[] sort(T[] elements) {

		// Do sort if the array contains more than one element
		if (elements != null && elements.length > 1) {
			// Iterate from second element to the end.
			for (int i = 1; i < elements.length; i++) {
				T insertItem = elements[i];
				int j = i - 1;

				while (j >= 0 && ArraysUtils.lessThan(insertItem, elements[j])) {
					elements[j + 1] = elements[j--];
				}

				elements[j + 1] = insertItem;
			}
		}

		return elements;
	}
}

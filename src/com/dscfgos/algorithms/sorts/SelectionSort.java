package com.dscfgos.algorithms.sorts;

import com.dscfgos.algorithms.interfaces.Sorteable;
import com.dscfgos.algorithms.utils.ArraysUtils;

/**
 * Selection Sort.
 * Search for the lowest element, then swap for the current element.
 */
public class SelectionSort implements Sorteable {

	public static void main(String[] args) {
		Integer[] elements = new Integer[] { 5, 3, 2, 1, 4, 6, 7, 9, 8, 0 };

		Sorteable quickSort = new SelectionSort();
		quickSort.sort(elements);

		ArraysUtils.printArray("SelectionSort", elements);
	}

	public <T extends Comparable<T>> T[] sort(T[] elements) {

		// Do sort if the array contains more than one element
		if (elements != null && elements.length > 1) {
			// Iterate from beginning to item before last.
			for (int i = 0; i < elements.length - 1; i++) {
				int minElementIndex = i;
				// Iterate over the remaining elements.
				for (int j = i + 1; j < elements.length; j++) {
					if (ArraysUtils.greaterThan(elements[i], elements[j])) {
						minElementIndex = j;
					}
				}

				// If there is an element less than the current one, swap them.
				if (minElementIndex != i) {
					ArraysUtils.swap(elements, minElementIndex, i);
				}
			}
		}

		return elements;
	}
}

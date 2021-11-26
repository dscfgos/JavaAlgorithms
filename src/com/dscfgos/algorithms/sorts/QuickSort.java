package com.dscfgos.algorithms.sorts;

import com.dscfgos.algorithms.sorts.utils.ArraysUtils;

public class QuickSort implements Sorteable {

	public static void main(String[] args) {
		Integer[] elements = new Integer[] { 5, 3, 2, 1, 4, 6, 7, 9, 8, 0 };

		QuickSort quickSort = new QuickSort();
		quickSort.sort(elements);

		ArraysUtils.printArray(elements);
	}

	public <T extends Comparable<T>> T[] sort(T[] elements) {
		return QuickSort.sort(elements, 0, elements.length - 1);
	}

	private static <T extends Comparable<T>> T[] sort(T[] elements, int low, int high) {

		// Do sort if the array contains more than one element
		if (elements != null && elements.length > 1 && low < high) {

			// Get the pivot element
			T pivot = getPivot(elements, low, high);

			// make leftPointer < pivot and rightPointer > pivot
			int leftPointer = low, rightPointer = high;
			while (leftPointer <= rightPointer) {
				// while value at left is less than pivot move left-pointer to right
				while (ArraysUtils.lessThan(elements[leftPointer], pivot)) {
					leftPointer++;
				}
				// while value at right is greater than pivot move right-pointer left
				while (ArraysUtils.greaterThan(elements[rightPointer], pivot)) {
					rightPointer--;
				}

				// Now compare values from both side of lists to see if they need swapping
				// After swapping move the iterator on both lists
				if (leftPointer <= rightPointer) {
					ArraysUtils.swap(elements, leftPointer, rightPointer);
					leftPointer++;
					rightPointer--;
				}
			}
			
			//Sort recursive the two sub arrays
			if (low < rightPointer) {
				sort(elements, low, rightPointer);
			}
			if (high > leftPointer) {
				sort(elements, leftPointer, high);
			}

		}

		return elements;
	}

	// Get the Pivot element from the middle of the list
	// Can implement this method to get first, last, random, midle pivot position
	private static <T> T getPivot(T[] elements, int low, int high) {
		int middle = low + (high - low) / 2;
		T pivot = elements[middle];
		return pivot;
	}
}

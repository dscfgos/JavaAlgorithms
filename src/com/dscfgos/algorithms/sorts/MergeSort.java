package com.dscfgos.algorithms.sorts;

import com.dscfgos.algorithms.sorts.interfaces.Sorteable;
import com.dscfgos.algorithms.sorts.utils.ArraysUtils;

public class MergeSort implements Sorteable {

	public static void main(String[] args) {
		Integer[] elements = new Integer[] { 5, 3, 2, 1, 4, 6, 7, 9, 8, 0 };

		Sorteable quickSort = new MergeSort();
		quickSort.sort(elements);

		ArraysUtils.printArray("MergeSort:", elements);
	}

	@SuppressWarnings("unchecked")
	public <T extends Comparable<T>> T[] sort(T[] elements) {

		// Do sort if the array contains more than one element
		if (elements != null && elements.length > 1) {

			int length = elements.length;
			// Get the mid element
			int mid = length / 2;

			// Temp two arrays
			T[] startArr = (T[]) new Comparable[mid];
			T[] endArr = (T[]) new Comparable[length - mid];

			// Fill Start and End arrays
			for (int i = 0; i < mid; i++) {
				startArr[i] = elements[i];
			}
			for (int i = mid; i < length; i++) {
				endArr[i - mid] = elements[i];
			}

			// Recursive call sort
			this.sort(startArr);
			this.sort(endArr);

			// Finally, merge the two arrays

			// Initial indexes of first and second subarrays
			int i = 0, j = 0;

			// Initial index of merged subarray array
			int k = 0;
			while (i < startArr.length && j < endArr.length) {
				if (ArraysUtils.lessThan(startArr[i], endArr[j])) {
					elements[k] = startArr[i++];
				} else {
					elements[k] = endArr[j++];
				}
				k++;
			}

			// Copy remaining elements of start array if any
			while (i < startArr.length) {
				elements[k++] = startArr[i++];
			}

			// Copy remaining elements of end array if any
			while (j < endArr.length) {
				elements[k++] = endArr[j++];
			}
		}

		return elements;
	}
}

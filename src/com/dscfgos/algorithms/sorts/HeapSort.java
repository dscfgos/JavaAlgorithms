package com.dscfgos.algorithms.sorts;

import com.dscfgos.algorithms.interfaces.Sorteable;
import com.dscfgos.algorithms.utils.ArraysUtils;

/**
 * Heap Sort.
 * Is a comparison-based sorting technique based on Binary Heap data
 * structure. It is similar to selection sort where we first find the minimum
 * element and place the minimum element at the beginning. We repeat the same
 * process for the remaining elements.
 */
public class HeapSort implements Sorteable {

	public static void main(String[] args) {
		Integer[] elements = new Integer[] { 5, 3, 2, 1, 4, 6, 7, 9, 8, 0 };

		Sorteable quickSort = new HeapSort();
		quickSort.sort(elements);

		ArraysUtils.printArray("HeapSort:", elements);
	}

	public <T extends Comparable<T>> T[] sort(T[] elements) {

		int length = elements.length;

		// Build heap (max heap)
		for (int i = length / 2 - 1; i >= 0; i--) {
			heapify(elements, length, i);
		}

		// Heap sort
		for (int i = length - 1; i >= 0; i--) {
			ArraysUtils.swap(elements, 0, i);

			// Heapify root element
			heapify(elements, i, 0);
		}

		return elements;
	}

	private <T extends Comparable<T>> T[] heapify(T[] elements, int n, int i) {
		// Find largest among root, left child and right child
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && ArraysUtils.greaterThan(elements[left], elements[largest])) {
			largest = left;
		}

		if (right < n && ArraysUtils.greaterThan(elements[right], elements[largest])) {
			largest = right;
		}

		// Swap and continue heapifying if root is not largest
		if (largest != i) {
			ArraysUtils.swap(elements, i, largest);

			heapify(elements, n, largest);
		}
		return elements;
	}
}

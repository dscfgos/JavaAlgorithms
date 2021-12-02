package com.dscfgos.algorithms.searches;

import com.dscfgos.algorithms.interfaces.Searchable;
import com.dscfgos.algorithms.utils.ArraysUtils;

/**
 * Binary Search.
 */
public class BinarySearch implements Searchable {

	public static void main(String[] args) {
		Integer[] elements = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] strElements = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };

		Searchable search = new BinarySearch();

		int position = search.find(elements, 7);
		int strPosition = search.find(strElements, "h");

		System.out.println("Integer Position: " + position);
		System.out.println("String Position: " + strPosition);
	}

	public <T extends Comparable<T>> int find(T[] elements, T item) {
		int result = -1;

		// Do find if the array is not empty
		if (elements != null && elements.length > 0) {
			result = this.find(elements, item, 0, elements.length - 1);
		}

		return result;
	}

	// Recursive Method
	public <T extends Comparable<T>> int find(T[] elements, T item, int lowIndex, int highIndex) {
		int result = -1;
		// Do find if the array is not empty
		if (elements != null && elements.length > 0) {
			if (highIndex >= lowIndex) {
				// Middle index
				int mid = lowIndex + (highIndex - lowIndex) / 2;

				if (ArraysUtils.equalTo(elements[mid], item)) {
					result = mid;
				} else if (ArraysUtils.greaterThan(elements[mid], item)) {
					result = find(elements, item, lowIndex, mid - 1);
				} else if (ArraysUtils.lessThan(elements[mid], item)) {
					result = find(elements, item, mid + 1, highIndex);
				}
			}
		}

		return result;
	}
}

package com.dscfgos.algorithms.searches;

import com.dscfgos.algorithms.interfaces.Searchable;
import com.dscfgos.algorithms.utils.ArraysUtils;

/**
 * Linear Search.
 * Is a sequential searching algorithm where we start from one end and check
 * every element of the list until the desired element is found.
 */
public class LinearSearch implements Searchable {

	public static void main(String[] args) {
		Integer[] elements = new Integer[] { 5, 3, 2, 1, 4, 6, 7, 9, 8, 0 };

		Searchable search = new LinearSearch();

		int position = search.find(elements, 7);

		System.out.println(position);
	}

	public <T extends Comparable<T>> int find(T[] elements, T item) {
		int result = -1;
		// Do find if the array is not empty
		if (elements != null && elements.length > 0) {
			for (int i = 0; i < elements.length; i++) {
				if (ArraysUtils.equalTo(elements[i], item)) {
					result = i;
					break;
				}
			}
		}

		return result;
	}
}

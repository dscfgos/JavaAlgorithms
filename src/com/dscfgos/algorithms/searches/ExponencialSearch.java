package com.dscfgos.algorithms.searches;

import com.dscfgos.algorithms.interfaces.Searchable;
import com.dscfgos.algorithms.utils.ArraysUtils;

/**
 * Binary Search.
 */
public class ExponencialSearch implements Searchable {

	public static void main(String[] args) {
		Integer[] elements = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] strElements = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };

		Searchable search = new ExponencialSearch();

		int position = search.find(elements, 7);
		int strPosition = search.find(strElements, "h");

		System.out.println("Integer Position: " + position);
		System.out.println("String Position: " + strPosition);
	}

	public <T extends Comparable<T>> int find(T[] elements, T item) {
		int result = -1;

		// Do find if the array is not empty
		if (elements != null && elements.length > 0) {
			if (ArraysUtils.equalTo(elements[0], item)) {
				result = 0;
			} else {
				// find the range for the binary search
				int i = 1;
				
				while (i < elements.length && ArraysUtils.lessEqual(elements[i], item)) {
					i = i * 2;
				}	

				result = (new BinarySearch()).find(elements, item, i/2, Math.min(i, elements.length));
			}
		}

		return result;
	}
}

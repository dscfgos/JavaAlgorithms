package com.dscfgos.algorithms.searches;

/**
 * Interpolation Search.
 */
public class InterpolationSearch {

	public static void main(String[] args) {
		int[] elements = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		InterpolationSearch search = new InterpolationSearch();

		int position = search.find(elements, 7);

		System.out.println("Position: " + position);
	}

	public int find(int[] elements, int item) {
		int result = -1;

		// Do find if the array is not empty
		if (elements != null && elements.length > 0) {
			int low = 0;
			int high = elements.length - 1;

			while (item >= elements[low] && item <= elements[high] && low <= high) {

				//Probe Formula
				int probe = low + (high - low) * (item - elements[low]) / (elements[high] - elements[low]);

				if (high == low) {
					if (elements[low] == item) {
						result = low;
					} else {
						result = -1;
					}
				}

				else if (elements[probe] == item) {
					result = probe;
				}

				if (elements[probe] < item) {
					low = probe + 1;
				} else {
					high = probe - 1;
				}
			}
		}

		return result;
	}
}

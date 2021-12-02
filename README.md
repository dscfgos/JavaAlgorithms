# Java Algorithms

Java basic algorithms implementations
# Content
## Sorting

[1. Quick Sort](#quick-sort)

[2. Selection Sort](#selection-sort)

[3. Merge Sort](#merge-sort)

[4. Bubble Sort](#bubble-sort)

[5. Insertion Sort](#insertion-sort)

## Seaching

[1. Linear Search](#linear-search)

[2. Binary Search](#binary-search)

[3. Binary Search](#interpolation-search)

[4. Exponencial Search](#exponencial-search)

### Sorting
#### Quick Sort

Quicksort is a sorting algorithm, which is leveraging the divide-and-conquer principle.
The input list is divided into two sub-lists by an element called pivot; one sub-list with elements less than the pivot and another one with elements greater than the pivot. This process repeats for each sub-list.

#### Selection Sort

The selection sort algorithm sorts an array by repeatedly finding the minimum element from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

#### Merge Sort

It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves

#### Bubble Sort

Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

#### Insertion Sort

Places an unsorted element at its suitable place in each iteration.
Insertion sort works similarly as we sort cards in our hand in a card game.
We assume that the first card is already sorted then, we select an unsorted card. If the unsorted card is greater than the card in hand, it is placed on the right otherwise, to the left. In the same way, other unsorted cards are taken and put in their right place.

### Searching

#### Linear Search

Linear search is a sequential searching algorithm where we start from one end and check every element of the list until the desired element is found.

#### Binary Search

Search a sorted array by repeatedly dividing the search interval in half. Begin with an interval covering the whole array. If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. Otherwise, narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.

#### Inerpolation Search

The Interpolation Search is an improvement over Binary Search for instances, where the values in a sorted array are uniformly distributed. Binary Search always goes to the middle element to check. On the other hand, interpolation search may go to different locations according to the value of the key being searched. For example, if the value of the key is closer to the last element, interpolation search is likely to start search toward the end side.

#### Exponencial Search

An exponential search is a combination of two methods:
-Find the range in which the element exists.
-Perform a binary search in that range.
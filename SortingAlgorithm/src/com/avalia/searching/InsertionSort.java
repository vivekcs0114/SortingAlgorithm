/*Insertion sort algorithm works the way we sort the playing card in our hands.
A sublist is maintained which is always sorted and we pick the element from unsorted sublist
and insert it into the sorted sublist at appropriate position */
package com.avalia.searching;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = { 7, 2, 4, 1, 5, 3 };
		int noOfEle = 6;
		int key, i, j;
		for (i = 1; i < noOfEle; i++) {
			key = array[i];
			j = i;
			while (j > 0 && array[j - 1] > key) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = key;
		}
		for (i = 0; i < noOfEle; i++)
			System.out.println(array[i]);
	}
}

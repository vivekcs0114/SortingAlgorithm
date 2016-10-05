/*Selection sort algorithm sorts an array by repeatedly finding the
minimum element from unsorted array and putting t at the beginning*/
package com.avalia.searching;

public class SelectionSort {
	public static void main(String[] args) {
		int[] array = { 10, 21, 8, 5, 33 };
		int noOfEle = 5;
		int i, j, iMin;
		for (i = 0; i < noOfEle; i++) {
			iMin = i;
			for (j = i + 1; j < noOfEle; j++) {

				if (array[iMin] > array[j]) {
					iMin = j;

				}
			}
			int temp = array[i];
			array[i] = array[iMin];
			array[iMin] = temp;
		}
		for (i = 0; i < noOfEle; i++)
			System.out.println(array[i]);
	}
}

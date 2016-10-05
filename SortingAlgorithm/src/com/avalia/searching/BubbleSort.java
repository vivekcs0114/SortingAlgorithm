/*Bubble sort algorithm is the simplest sorting algorithm that work by repeatedly swapping
the adjacent element if they are in wrong order.*/
package com.avalia.searching;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 2, 7, 4, 1, 5, 3 };
		int noOfEle = 6;
		int i, j;
		for (j = 1; j < noOfEle; j++) {
			int flage = 0;
			for (i = 0; i < noOfEle - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					flage = 1;
				}
			}
			if (flage == 0)
				break;
		}
		for (i = 0; i < noOfEle; i++)
			System.out.println(array[i]);

	}

}

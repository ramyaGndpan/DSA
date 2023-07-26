package com.sorting;

import java.util.Arrays;

public class BubbleSort {

	/**
	 * 
	 * bubbleSort - implements the bubble sort algorithm to sort the elements of an array in an ascending order
	 * 
	 * check for input array inputArr is not null 
	 * then get the size of the array => inputArr.length arrLength 
	 * Iterate the elements in the array
	 * for each iteration do the sub iteration from first element to the last unsorted element 
	 * for each sub iteration compare the current element with the next element and swap it if the current element is greater and set the swapflag to true 
	 * repeat the same process for rest of the sub iteration
	 * check for swap flag if false it means the elements are sorted hence break the loop and return the sorted order 
	 * else repeating the same process for rest of the elements in the main iteration 
	 * hence the greatest element will be moved to the last position and the next greater element in the rest of the array elements will be moved to (last-1)th position 
	 * in the next main iteration and so on..  
	 * finally return the sorted array
	 * 
	 * 
	 * @param inputArr
	 * @return int[] - sorted Array using bubble sort algorithm
	 */
	public int[] sort(int[] inputArr) {
		System.out.println("bubbleSort started:::::::");
		try {
			if (null != inputArr && inputArr.length > 0) {
				int inputArrSize = inputArr.length;
				System.out.println("Array elements before sorting::::" + Arrays.toString(inputArr));
				for (int i = 0; i < inputArrSize - 1; i++) {
					boolean swapFlag = false;
					for (int j = 0; j < ((inputArrSize - 1) - i); j++) {
						if (inputArr[j] > inputArr[j + 1]) {
							int tmp = inputArr[j];
							inputArr[j] = inputArr[j + 1];
							inputArr[j + 1] = tmp;
							swapFlag = true;
						}
					}
					if (!swapFlag) {
//						System.out.println("swapflag false:::::");
						break;
					}
				}
				System.out.println("Array elements after sorting::::" + Arrays.toString(inputArr));
			} else {
				System.out.println("Input is null.. Please enter the numbers to be sorted:::");
			}
		} catch (Exception ex) {
			System.out.println("Exception occured:::" + ex.getMessage());
		}
		System.out.println("bubbleSort ended:::::::");
		return inputArr;
	}

	/**
	 * printArr
	 * 
	 * @param inputArr
	 */

	public void displayArr(String strMessage, int[] inputArr) {
		System.out.println(strMessage + Arrays.toString(inputArr));
	}

	public static void main(String[] args) {
		BubbleSort objBubbleSort = new BubbleSort();
		int[] testInputArr = {9,2,8,1,6,4,3,2};
		//int[] testInputArr = { 1, 2, 3, 6, 5 };
		objBubbleSort.sort(testInputArr);
	}

}

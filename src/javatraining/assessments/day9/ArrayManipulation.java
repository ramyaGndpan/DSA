package javatraining.assessments.day9;

import java.util.Arrays;
import java.util.Collections;

/**
 * Array Manipulation Create an array of names. Sort the names in alphabetical
 * order and print the sorted list. Given an array of integers, write a program
 * to find the second-largest number. Write a program to reverse the elements of
 * an array. Implement a function to count the occurrences of a specific number
 * in an array.
 * 
 * @author ramya
 *
 */
public class ArrayManipulation {

	/**
	 * Create an array of names. Sort the names in alphabetical order and print the
	 * sorted list. sortNames
	 */
	public static void sortNames() {
		String[] arrNames = { "ram", "yash", "vas", "ashwa", "ivan", "mike" };
		System.out.println("unsorted array names::::" + Arrays.toString(arrNames));
		Arrays.sort(arrNames);
		System.out.println("sorted array names::::" + Arrays.toString(arrNames));
	}

	/**
	 * Given an array of integers, write a program to find the second-largest
	 * number. findSecondLargest
	 * 
	 * @return
	 */
	public static int findSecondLargest(int[] arrValues) {
		int result = ArrayBasics.findNumber("secondLarge", arrValues);
		return result;
	}

	/**
	 * Write a program to reverse the elements of an array. reverseArray
	 * reverseArraySimple
	 * reverse array elements using reverse comparator and Arrays util class
	 * @param arrValues
	 * @return
	 */
	public static Object[] reverseArraySimple(Object[] arrValues) {
		System.out.println("Input Array elements:::::::::::::::::::" + Arrays.toString(arrValues));
		Arrays.sort(arrValues, Collections.reverseOrder());
		System.out.println("reverse sorted Array elements:::::::::::::::::::" + Arrays.toString(arrValues));
		return arrValues;
	}

	/**
	 * reverseArray
	 * @param arrValues
	 * @return
	 */
	public static int[] reverseArray(int[] arrValues) {
		ArrayBasics.displayArrayElements(arrValues);
		Arrays.sort(arrValues);
		int reverseIndex = 0;
		int[] reverseArr = new int[arrValues.length];
		for (int arrIndex = (arrValues.length - 1); arrIndex >= 0; arrIndex--) {
			reverseArr[reverseIndex] = arrValues[arrIndex];
			reverseIndex++;
		}
		System.out.println("Reversed Array elements:::");
		ArrayBasics.displayArrayElements(reverseArr);
		return reverseArr;
	}

	/**
	 * Implement a function to count the occurrences of a specific number in an
	 * array. getOccurence
	 * 
	 * @param number
	 * @return
	 */
	public static int getOccurence(int inputNumber, int[] arrValues) {
		System.out.println("Input Array elements:::::::::::::::::::");
		ArrayBasics.displayArrayElements(arrValues);
		int count = 0;
		for (int num : arrValues) {
			if (num == inputNumber)
				++count;
		}
		System.out.println("occurence of " + inputNumber + ":::" + count);
		return count;
	}

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n SORTING ELEMENTS::::");
		ArrayManipulation.sortNames();
		System.out.println("\n SECOND LARGEST NUMBER IN THE ARRAY::::");
		ArrayManipulation.findSecondLargest(new int[] { 30, 20, 50, 10, 60 });
		System.out.println("\n REVERSED ARRAY using comparator::::");
		ArrayManipulation.reverseArraySimple(new Integer[] { 30, 20, 50, 10, 60 });
		System.out.println("\n REVERSED ARRAY without using comparator::::");
		ArrayManipulation.reverseArray(new int[] { 60, 30, 80, 20, 60 });
		System.out.println("\n OCCURENCE OF ARRAY ELEMENT::::");
		ArrayManipulation.getOccurence(20, new int[] { 20, 30, 80, 20, 60 });
	}

}

/**
 * Output:
 * 

 SORTING ELEMENTS::::
unsorted array names::::[ram, yash, vas, ashwa, ivan, mike]
sorted array names::::[ashwa, ivan, mike, ram, vas, yash]

 SECOND LARGEST NUMBER IN THE ARRAY::::
Array elements...[30, 20, 50, 10, 60]
second largest number..50

 REVERSED ARRAY using comparator::::
Input Array elements:::::::::::::::::::[30, 20, 50, 10, 60]
reverse sorted Array elements:::::::::::::::::::[60, 50, 30, 20, 10]

 REVERSED ARRAY without using comparator::::
Array elements...[60, 30, 80, 20, 60]
Reversed Array elements:::
Array elements...[80, 60, 60, 30, 20]

 OCCURENCE OF ARRAY ELEMENT::::
Input Array elements:::::::::::::::::::
Array elements...[20, 30, 80, 20, 60]
occurence of 20:::2

 * 
 * 
 **/

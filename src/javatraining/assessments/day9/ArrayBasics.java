package javatraining.assessments.day9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
Array Basics
Write a program that initializes an array with your favorite foods and prints them out.
Create an array of integers. Calculate and print the sum of all the elements.
Write a program to find the largest and smallest numbers in an array of integers.
Implement a function that takes an array of numbers as input and returns the average.
 
 * @author ramya
 *
 */
public class ArrayBasics {

	/**
	 * Write a program that initializes an array with your favorite foods and prints them out.
	 * printFavFoods
	 */
	public static void printFavFoods() {
		String[] arrFoods = {"pasta","noodles","sandwiches","pizza","donut"};
		System.out.println("printFavFoods::..."+Arrays.toString(arrFoods));
	}
	
	/**
	 * Create an array of integers. Calculate and print the sum of all the elements.
	 * sum
	 */
	public static int sum(int[] arrValues) {
		int sum = 0;
		displayArrayElements(arrValues);
		for(int value: arrValues) {
			sum = sum + value; 
		}
		System.out.println("sum of elements in array..."+sum);
		return sum;
	}
	
	/**
	 * displayArrayElements
	 * @param arrValues
	 */
	public static void displayArrayElements(int[] arrValues) {
		System.out.println("Array elements..."+Arrays.toString(arrValues));
	}
	
	/**
	 *Write a program to find the largest and smallest numbers in an array of integers.
	 * findNumber
	 * @param largeOrSmall
	 */
	public static int findNumber(String largeOrSmall,int[] arrValues) {
		displayArrayElements(arrValues);
		Arrays.sort(arrValues);
		if("small".equalsIgnoreCase(largeOrSmall)) {
		System.out.println("smallest number.."+arrValues[0]);
		return arrValues[0];
		}
		else if("large".equalsIgnoreCase(largeOrSmall)) {
			System.out.println("largest number.."+arrValues[arrValues.length-1]);
			return arrValues[arrValues.length-1];
		}
		else if("secondLarge".equalsIgnoreCase(largeOrSmall)) {
			System.out.println("second largest number.."+arrValues[arrValues.length-2]);
			return arrValues[arrValues.length-2];
		} else {
			System.out.println("please choose option to peform opn on array elements...");
			return 0;
		}
	}
	
	/**
	 * Implement a function that takes an array of numbers as input and returns the average.
	 * getAverage
	 */
	public static double getAverage() {
		double sum=0,average=0;
		int count = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the size of the array..");
		int size = in.nextInt();
		int[] arrInt = new int[size];
		System.out.println("size of the array.."+arrInt.length);
		do {
			System.out.println(count+"::Please enter the array elements..");
			arrInt[count] = in.nextInt();
			sum = sum + arrInt[count];
			count++;
		}while(count!=size);
		average = (sum/size);
		System.out.println("average::::"+average);
		in.close();
		return average;
	}
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrValues = {40,10,60,30,50};
		ArrayBasics.printFavFoods();
		System.out.println("\n SUM OF ARRAY ELEMENTS::::");
		ArrayBasics.sum(arrValues);
		System.out.println("\n SMALLEST NUMBER IN THE ARRAY::::");
		ArrayBasics.findNumber("small",arrValues);
		System.out.println("\n LARGEST NUMBER IN THE ARRAY::::");
		ArrayBasics.findNumber("large",arrValues);
		System.out.println("\n AVERAGE OF ARRAY ELEMENTS::::");
		ArrayBasics.getAverage();
	}

}

/**
 * Output:
printFavFoods::...[pasta, noodles, sandwiches, pizza, donut]

 SUM OF ARRAY ELEMENTS::::
Array elements...[40, 10, 60, 30, 50]
sum of elements in array...190

 SMALLEST NUMBER IN THE ARRAY::::
Array elements...[40, 10, 60, 30, 50]
smallest number..10

 LARGEST NUMBER IN THE ARRAY::::
Array elements...[10, 30, 40, 50, 60]
largest number..60

 AVERAGE OF ARRAY ELEMENTS::::
Please enter the size of the array..
3
size of the array..3
0::Please enter the array elements..
2
1::Please enter the array elements..
4
2::Please enter the array elements..
6
average::::4.0


**/


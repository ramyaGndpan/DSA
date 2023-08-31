package javatraining.assessments.day9;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 * Multidimensional Arrays
Write code to initialize a 2D array and print its elements row by row.
Write a program to find the sum of the diagonal elements in a square 2D array.
Write a function to find the maximum element in a 2D array.
 * @author ramya
 *
 */

public class MultidimensionalArrays {

	/**
	 * Write code to initialize a 2D array and print its elements row by row.
	 * get2DArray
	 */
	public static void get2DArray(int[][] dimArray) {
		System.out.println("\n2D Array elements.."+Arrays.deepToString(dimArray));
		for(int[] dimArrayRows: dimArray) {
			System.out.println("\n"+Arrays.toString(dimArrayRows));
		}
	}
	
	/**
	 * sumDiagonal
	 * Write a program to find the sum of the diagonal elements in a square 2D array.
	 * @param dimArray
	 * @return
	 */
	public static int sumDiagonal(int[][] dimArray) {
		int sum=0,sumPrimary=0, sumSecondary = 0;
		get2DArray(dimArray);
		//System.out.println("\n2D Array elements.."+Arrays.deepToString(dimArray));
		for(int i=0;i<dimArray.length;i++) {
			sumPrimary += dimArray[i][i];
		}
		for(int j=0;j<dimArray.length;j++) {
			sumSecondary += dimArray[j][dimArray.length-j-1];
		}
		System.out.println("\nsum of primary diagonal:::"+sumPrimary);
		System.out.println("sum of secondary diagonal:::"+sumSecondary);
		sum = sumPrimary + sumSecondary;
		System.out.println("sum of diagonal elements::::::"+sum);
		return sum;
	}
	
	/**
	 * Write a function to find the maximum element in a 2D array.
	 * getMaximum2DArray
	 * @return
	 */
	public static int getMaximum2DArrayElement(int[][] dimArray) {
		//Arrays.sort(dimArray);
		get2DArray(dimArray);
		int max = dimArray[0][0];
		for(int[] dimArrayRows: dimArray) {
			Arrays.sort(dimArrayRows);
			//System.out.println("rows:::"+Arrays.toString(dimArrayRows)+"row max.."+dimArrayRows[dimArrayRows.length-1]);
			if(max<dimArrayRows[dimArrayRows.length-1]) {
			max = dimArrayRows[dimArrayRows.length-1];}
		}
		System.out.println("\n getMaximum2DArrayElement:::maximum::"+max);
		return max;
	}
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] dimArray = {{1,2,3},{4,5,6},{7,8,9}};
		MultidimensionalArrays.get2DArray(dimArray);
		int[][] dimArray1 = {{1,2,3,4},{4,5,6,4},{7,8,9,4},{3,4,5,6}};
		MultidimensionalArrays.sumDiagonal(dimArray1);
		MultidimensionalArrays.getMaximum2DArrayElement(dimArray1);
	}

}

/**
Output:


2D Array elements..[[1, 2, 3], [4, 5, 6], [7, 8, 9]]

[1, 2, 3]

[4, 5, 6]

[7, 8, 9]

2D Array elements..[[1, 2, 3, 4], [4, 5, 6, 4], [7, 8, 9, 4], [3, 4, 5, 6]]

[1, 2, 3, 4]

[4, 5, 6, 4]

[7, 8, 9, 4]

[3, 4, 5, 6]

sum of primary diagonal:::21
sum of secondary diagonal:::21
sum of diagonal elements::::::42

2D Array elements..[[1, 2, 3, 4], [4, 5, 6, 4], [7, 8, 9, 4], [3, 4, 5, 6]]

[1, 2, 3, 4]

[4, 5, 6, 4]

[7, 8, 9, 4]

[3, 4, 5, 6]

 getMaximum2DArrayElement:::maximum::9

 getMaximum2DArrayElementFunctional::::maximum::9


**/

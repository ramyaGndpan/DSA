package javatraining.assessments.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * Assignment 1: Grocery List Create a simple grocery list program using an
 * ArrayList. Allow users to add items to the list and display the final list of
 * items. Assignment 2: Number Sorter Write a program that takes a list of
 * numbers as input and uses an ArrayList to sort and display them in ascending
 * order. Assignment 3: String Reversal Develop a program that takes a string
 * input and uses an ArrayList to reverse and display the characters of the
 * string. Assignment 4: Even-Odd Separator Create a program that takes a list
 * of numbers as input and uses an ArrayList to separate even and odd numbers
 * into two separate lists. Assignment 5: Vowel Counter Write a program that
 * takes a string as input and uses an ArrayList to count and display the number
 * of occurrences of each vowel (a, e, i, o, u).
 * 
 * @author ramya
 *
 */
public class ArrayListBasics {

	private static Scanner in = new Scanner(System.in);

	/**
	 * Grocery List Create a simple grocery list program using an ArrayList. Allow
	 * users to add items to the list and display the final list of items.
	 * createGroceryList
	 * 
	 * @return
	 */
	public static List<String> createGroceryList() {
		System.out.println("\ncreateGroceryList::");
		String strInput = "";
		List<String> list = new ArrayList<String>();
		System.out.println("Grocery list Items:::::");
		while (!"exit".equalsIgnoreCase(strInput)) {
			System.out.println("please add items:::::");
			strInput = in.nextLine();
			if (!"exit".equalsIgnoreCase(strInput))
				list.add(strInput);
		}
		System.out.println("ITEMS IN GROCERY LIST:::::::" + list.toString());
		displayList(list);
		return list;
	}

	/**
	 * displayList
	 * 
	 * @param <T>
	 * @param arrList
	 */
	public static <T> void displayList(List<T> list) {
		for (T element : list) {
			System.out.println(element);
		}
	}

	/**
	 * Number Sorter Write a program that takes a list of numbers as input and uses
	 * an ArrayList to sort and display them in ascending order. sortNumbers
	 * 
	 * @return
	 */
	public static List<Integer> sortNumbers(List<Integer> list) {
		System.out.println("\nsortNumbers::");
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.addAll(list);
		System.out.println("\nElements in the input list::::" + list.toString());
		Collections.sort(arrList);
		System.out.println("sorted elements using arraylist::::::" + arrList.toString());
		// displayList(arrList);
		return null;
	}

	/**
	 * String Reversal Develop a program that takes a string input and uses an
	 * ArrayList to reverse and display the characters of the string. reverseString
	 * 
	 * @param strInput
	 * @return
	 */
	public static String reverseString(String strInput) {
		System.out.println("\nreverseString::");
		ArrayList<Character> arrList = new ArrayList<Character>();
		char[] chArr = strInput.toCharArray();
		for (char ch : chArr) {
			arrList.add(ch);
		}
		Collections.reverse(arrList);
		System.out.println("\nreversed characters of the input string:::\"" + strInput + "\":::::" + arrList.toString());
		// displayList(arrList);
		return strInput;
	}

	/**
	 * Even-Odd Separator Create a program that takes a list of numbers as input and
	 * uses an ArrayList to separate even and odd numbers into two separate lists.
	 * seperateEvenOddNumbers
	 * 
	 * @return
	 */
	public static void seperateEvenOddNumbers(List<Integer> numberList) {
		System.out.println("\nseperateEvenOddNumbers::Input list::::" + numberList.toString());
		ArrayList<Integer> arrListOdd = new ArrayList<Integer>();
		ArrayList<Integer> arrListEven = new ArrayList<Integer>();
		for (Integer element : numberList) {
			if (element % 2 == 0)
				arrListEven.add(element);
			else
				arrListOdd.add(element);
		}
		System.out.println("Even List:::" + arrListEven.toString());
		System.out.println("Odd List:::" + arrListOdd.toString());
	}

	/**
	 * Vowel Counter Write a program that takes a string as input and uses an
	 * ArrayList to count and display the number of occurrences of each vowel (a, e,
	 * i, o, u) getVowelsCount
	 * 
	 * @return
	 */
	public static void getVowelsCount(String strInput) {
		System.out.println("\ngetVowelsCount:::INPUT STRING:::"+strInput);
		int count = 0;
		boolean flagVowel = false;
		char[] chVowels = { 'a', 'e', 'i', 'o', 'u' };
		char[] chArr = strInput.toCharArray();

		ArrayList<Character> vowelsList = new ArrayList<Character>();
		ArrayList<Integer> vowelsCountList = new ArrayList<Integer>();

		for (char chVowel : chVowels) {
			for (char chInput : chArr) {
				if (chVowel == chInput) {
					flagVowel = true;
					++count;
				}
			}
			if (flagVowel) {
				vowelsList.add(chVowel);
				vowelsCountList.add(count);
			}
			count = 0;
			flagVowel = false;
		}
		System.out.println("vowelsList::"+vowelsList.toString());
		System.out.println("vowelsCountList::"+vowelsCountList.toString());
	}

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> listInput = Arrays.asList(new Integer[] { 4, 6, 2, 3, 8, 5 });
		ArrayListBasics.createGroceryList();
		ArrayListBasics.sortNumbers(listInput);
		ArrayListBasics.reverseString("welcome");
		ArrayListBasics.reverseString("hello123..");
		ArrayListBasics.seperateEvenOddNumbers(listInput);
		ArrayListBasics.getVowelsCount("welcome");
		ArrayListBasics.getVowelsCount("hi how are you");
	}

}

/**
 * 
OUTPUT:

createGroceryList::
Grocery list Items:::::
please add items:::::
egg
please add items:::::
milk
please add items:::::
chocolate
please add items:::::
exit
ITEMS IN GROCERY LIST:::::::[egg, milk, chocolate]
egg
milk
chocolate

sortNumbers::

Elements in the input list::::[4, 6, 2, 3, 8, 5]
sorted elements using arraylist::::::[2, 3, 4, 5, 6, 8]

reverseString::

reversed characters of the input string:::"welcome":::::[e, m, o, c, l, e, w]

reverseString::

reversed characters of the input string:::"hello123..":::::[., ., 3, 2, 1, o, l, l, e, h]

seperateEvenOddNumbers::Input list::::[4, 6, 2, 3, 8, 5]
Even List:::[4, 6, 2, 8]
Odd List:::[3, 5]

getVowelsCount:::INPUT STRING:::welcome
vowelsList::[e, o]
vowelsCountList::[2, 1]

getVowelsCount:::INPUT STRING:::hi how are you
vowelsList::[a, e, i, o, u]
vowelsCountList::[1, 1, 1, 2, 1]


**/
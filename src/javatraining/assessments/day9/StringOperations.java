package javatraining.assessments.day9;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Find First Non-Repeated Character: Write a function to find the first
 * non-repeated character in a string. Palindrome Check : Write a function to
 * check if a string is a palindrome while ignoring spaces and non-alphanumeric
 * characters. String Rotation: Write a function to determine if one string is a
 * rotation of another string. Reverse Words in a String: Write a function to
 * reverse the order of words in a given string. Count Words: Write a function
 * to count the number of words in a sentence. Remove Duplicates: Write a
 * function to remove duplicate characters from a string. Check Permutation:
 * Write a function to check if one string is a permutation of another string.
 * String Truncation: Write a function to truncate a string to a specified
 * length. Replace Spaces: Write a function to replace spaces in a string with a
 * specified character.
 * 
 * @author ramya
 *
 */
public class StringOperations {

	/**
	 * Find First Non-Repeated Character: Write a function to find the first
	 * non-repeated character in a string. findFirstNonRepeated
	 * 
	 * @return
	 */
	public static char findFirstNonRepeated(String strInput) {

		return 'c';
	}

	/**
	 * Palindrome Check : Write a function to check if a string is a palindrome
	 * while ignoring spaces and non-alphanumeric characters.
	 * findPalindromeIgnoringAlphaNumeric
	 * 
	 * @return
	 */
	public static boolean findPalindromeIgnoringAlphaNumeric(String strInput) {

		return false;
	}

	/**
	 * String Rotation: Write a function to determine if one string is a rotation of
	 * another string. isStringRotation
	 * 
	 * @param strInput1
	 * @param strInput2
	 * @return
	 */
	public static boolean isStringRotation(String strInput1, String strInput2) {

		return false;
	}

	/**
	 * Reverse Words in a String: Write a function to reverse the order of words in
	 * a given string. 
	 * reverseWords
	 * @param strInput
	 * @return
	 */
	public static String reverseWords(String strInput) {
		System.out.println("\nINPUT STRING:::"+strInput);
		String[] strWords = strInput.split("\\s");
		int count = strWords.length-1;
		StringBuilder sb = new StringBuilder(); 
		for(int index=count; index>=0; index--) {
			sb.append(strWords[index]);
			if(index!=0) sb.append(" ");
		}
		System.out.println("\nREVERSED STRING:::"+sb.toString());
		return sb.toString();
	}

	/**
	 * Count Words: Write a function to count the number of words in a sentence.
	 * countWordsInASentence
	 * 
	 * @param strSentence
	 * @return
	 */
	public static int countWordsInASentence(String strSentence) {
		String[] strWords = strSentence.split("\\s");
		System.out.println("countWordsInASentence:: NUMBER OF WORDS::::"+strWords.length);
		return strWords.length;
	}

	/**
	 * Remove Duplicates: Write a function to remove duplicate characters from a
	 * string. removeDuplicateChars
	 * 
	 * @param strInput
	 * @return
	 */
	public static String removeDuplicateChars(String strInput) {
		System.out.println("\nINPUT STRING:::"+strInput);
		HashSet<Character> charSet = new LinkedHashSet<Character>();
		StringBuilder sb = new StringBuilder();
		char[] chArr = strInput.toCharArray();
		for(char ch: chArr ) {
			if(charSet.add(ch))
				sb.append(ch);
		}
		System.out.println("REMOVED DUPLICATE CHARS:::"+sb.toString());
		return sb.toString();
	}

	/**
	 * Check Permutation: Write a function to check if one string is a permutation
	 * of another string. checkPermutation
	 * 
	 * @param strInput1
	 * @param strInput2
	 * @return
	 */
	public static boolean checkPermutation(String strInput1, String strInput2) {
		if (StringBasics.checkForAnagram(strInput1, strInput2)) {
			System.out.println("\n\"" + strInput1 + "\" and \"" + strInput2 + "\" are PERMUTATION of each other..");
			return true;
		} else {
			System.out.println("\n\"" + strInput1 + "\" and \"" + strInput2 + "\" are NOT PERMUTATION of each other..");
			return false;
		}
	}

	/**
	 * String Truncation: Write a function to truncate a string to a specified
	 * length. truncateString
	 * 
	 * @param strInput
	 * @return
	 */
	public static String truncateString(String strInput, int len) {
		System.out.println("\nInput String::" + strInput);
		strInput = strInput.substring(0, len);
		System.out.println("\t TRUNCATED STRING:::" + strInput);
		return strInput;
	}

	/**
	 * Replace Spaces: Write a function to replace spaces in a string with a
	 * specified character. replaceSpaces
	 * 
	 * @param strInput
	 * @param ch
	 * @return
	 */
	public static String replaceSpaces(String strInput, char ch) {
		System.out.println("\nInput String::" + strInput);
		strInput = strInput.replaceAll("\\s+", ch + "");
		System.out.println("\t REPLACED STRING:::" + strInput);
		return strInput;
	}

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//StringOperations.findFirstNonRepeated("");
		//StringOperations.findPalindromeIgnoringAlphaNumeric("");
		//StringOperations.isStringRotation("", ""); 
		StringOperations.reverseWords("hello hi how are you..");
		StringOperations.countWordsInASentence("hello hi how are you..");
		StringOperations.removeDuplicateChars("welcomehowareyou");
		StringOperations.checkPermutation("hi are you there", "you are there hi");
		StringOperations.checkPermutation("hi are you there", "you are there");
		StringOperations.truncateString("WELCOME", 5);
		StringOperations.replaceSpaces("wel come ", '*');
	}

}

/**
Output:

INPUT STRING:::hello hi how are you..

REVERSED STRING:::you.. are how hi hello
countWordsInASentence:: NUMBER OF WORDS::::5

INPUT STRING:::welcomehowareyou
REMOVED DUPLICATE CHARS:::welcomharyu

hi are you there and you are there hi are ANAGRAMS of each other..

"hi are you there" and "you are there hi" are PERMUTATION of each other..

"hi are you there" and "you are there" are NOT PERMUTATION of each other..

Input String::WELCOME
	 TRUNCATED STRING:::WELCO

Input String::wel come 
	 REPLACED STRING:::wel*come*

**/
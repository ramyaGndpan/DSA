package javatraining.assessments.day9;

import java.util.Arrays;

/**
 * Reverse a String: Write a function to reverse a given string.
Check Palindrome: Write a function to check if a given string is a palindrome.
Anagram Check: Write a function to determine if two strings are anagrams of each other.
String Length: Write a function to find the length of a given string.
Concatenate Strings: Write a function to concatenate two strings.
String to Integer Conversion: Write a function to convert a string containing a number to an integer.
Count Vowels: Write a function to count the number of vowels in a string.
Count Substrings: Write a function to count occurrences of a specific substring in a given string.
Uppercase to Lowercase: Write a function to convert uppercase characters in a string to lowercase.
Remove Spaces: Write a function to remove all spaces from a given string.
 * @author ramya
 *
 */
public class StringBasics {

	/**
	 * reverseString
	 * @param strInput
	 * @return
	 */
	public static String reverseString(String strInput) {
		System.out.println("\nINPUT STRING:::"+strInput);
		char[] chArr = strInput.toCharArray();
		char[] chRev = new char[chArr.length];
		int count = chArr.length-1;
		for(char ch: chArr) {
			chRev[count]=ch;count--;
		}
		System.out.println("REVERSED string using charArray::"+new String(chRev));
		
		StringBuilder sb = new StringBuilder(strInput);
		sb.reverse();
		System.out.println("REVERSED string using string builder:::"+sb.toString());
		return sb.toString();
	}
	
	/**
	 * checkForPalindrome
	 * @param strInput
	 * @return
	 */
	public static boolean checkForPalindrome(String strInput) {
		if(strInput.equals(reverseString(strInput))) {
			System.out.println(strInput+" is a PALINDROME.......");
			return true;
		} else {
		System.out.println(strInput+" is not a PALINDROME.......");
		return false;}
	}
	
	/**
	 * checkForAnagram
	 * Write a function to determine if two strings are anagrams of each other.
	 * @param strInput1
	 * @param strInput2
	 * @return
	 */
	public static boolean checkForAnagram(String strInput1,String strInput2) {
		boolean flagAnagram = false;
		if(strInput1.length()!=strInput2.length()) return flagAnagram;
		char[] chInput1 = strInput1.toCharArray();
		char[] chInput2 = strInput2.toCharArray();
		Arrays.sort(chInput1);
		Arrays.sort(chInput2);
		if(Arrays.equals(chInput1, chInput2)) flagAnagram = true;
		if(flagAnagram)
			System.out.println("\n"+strInput1+" and "+strInput2+" are ANAGRAMS of each other..");
		else
			System.out.println("\n"+strInput1+" and "+strInput2+" are not ANAGRAMS of each other..");			
		return flagAnagram;
	}
	
	/**
	 * findLength
	 * @param strInput
	 * @return
	 */
	public static int findLength(String strInput) {
		System.out.println("\nLENGTH of String \""+strInput+"\" ::"+strInput.length());
		return strInput.length();
	}
	
	/**
	 * concatenateStrings
	 * @param strInput1
	 * @param strInput2
	 * @return
	 */
	public static String concatenateStrings(String strInput1, String strInput2) {
		System.out.println("\nCONCATENATED STRINGS:: \""+strInput1+" and "+strInput2+"\" :"+strInput1.concat(strInput2)); 
		return strInput1.concat(strInput2);
	}
	
	/**
	 * convertStringToInt
	 * @param strInput
	 * @return
	 * @throws NumberFormatException
	 */
	public static int convertStringToInt(String strInput) throws NumberFormatException {
		int input = Integer.parseInt(strInput);
		System.out.println("\nconvertStringToInt::INPUT STRING..\""+strInput+"\" converted to INT:::"+input);
		return input;
	}
	
	/**
	 * countVowels
	 * @param strInput
	 * @return
	 */
	public static int countVowels(String strInput) {
		char[] chVowels = {'a','e','i','o','u'};
		int count = 0;
		for(char ch: chVowels) {
			count += getOccurence(ch, strInput);
		}
		System.out.println("\nINPUT::\""+strInput+"\" VOWELS COUNT::"+count);
		return count;
	}
	
	/**
	 * countSubString
	 * @param strInput
	 * @return
	 */
	public static int countSubString(String strInput, String substrInput) {
		String replacedStr = strInput.replaceAll("("+substrInput+")+", "&");
		//System.out.println("replaced str::"+replacedStr);
		int count = getOccurence('&', replacedStr);
		System.out.println("\nThe SUBSTRING...\""+substrInput+"\" occurs::"+count+" times in the STRING::\""+strInput+"\"");
		return count;
	}
	
	public static int getOccurence(char chInput, String strInput) {
		int count = 0;
		char[] chArr = strInput.toCharArray();
		for (char ch : chArr) {
			if (ch == chInput)
				++count;
		}
		//System.out.println("occurence of " + chInput + ":::" + count);
		return count;
	}	
	/**
	 * convertUpperToLowerCase
	 * @param strInput
	 * @return
	 */
	public static String convertUpperToLowerCase(String strInput) {
		String strResult = strInput.toLowerCase();
		System.out.println("\nINPUT::"+strInput+" LOWERCASE..::"+strResult);
		return strResult;
	}
	
	/**
	 * removeSpaces
	 * @param strInput
	 * @return
	 */
	public static String removeSpaces(String strInput) {
		String strResult = strInput.replaceAll("\\s+", "");
		System.out.println("INPUT::"+strInput+" AFTER SPACES REMOVED::"+strResult);
		return strResult;
	}
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		StringBasics.reverseString("hi welcome");
		StringBasics.checkForPalindrome("madam");
		StringBasics.checkForPalindrome("welcome");
		StringBasics.checkForAnagram("care", "race");
		StringBasics.checkForAnagram("care", "ride");
		StringBasics.findLength("welcome");
		StringBasics.concatenateStrings("hello ", "welcome..");
		StringBasics.convertStringToInt("123");
		StringBasics.removeSpaces("we lco me ");
		StringBasics.convertUpperToLowerCase("weLCOME");
		StringBasics.countSubString("assdfdasfdas","as");
		StringBasics.countSubString("assdfdfassdf","assd");
		StringBasics.countVowels("hi welcome");
	}

}

/**
Output:


INPUT STRING:::hi welcome
REVERSED string using charArray::emoclew ih
REVERSED string using string builder:::emoclew ih

INPUT STRING:::madam
REVERSED string using charArray::madam
REVERSED string using string builder:::madam
madam is a PALINDROME.......

INPUT STRING:::welcome
REVERSED string using charArray::emoclew
REVERSED string using string builder:::emoclew
welcome is not a PALINDROME.......

care and race are ANAGRAMS of each other..

care and ride are not ANAGRAMS of each other..

LENGTH of String "welcome" ::7

CONCATENATED STRINGS:: "hello  and welcome.." :hello welcome..

convertStringToInt::INPUT STRING.."123" converted to INT:::123
INPUT::we lco me  AFTER SPACES REMOVED::welcome

INPUT::weLCOME LOWERCASE..::welcome

The SUBSTRING..."as" occurs::3 times in the STRING::"assdfdasfdas"

The SUBSTRING..."assd" occurs::2 times in the STRING::"assdfdfassdf"

INPUT::"hi welcome" VOWELS COUNT::4


**/

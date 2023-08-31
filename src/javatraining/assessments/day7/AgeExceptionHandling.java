package javatraining.assessments.day7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
Write a program that takes the age of a person as input and throws this exception if the age is less than 0 or greater than 120. 
Handle the custom exception using a try-catch block. 
 * @author ramya
 *
 */
public class AgeExceptionHandling {

	/**
	 * getAge()
	 */
	public static void getAge() {
		try(Scanner in = new Scanner(System.in);) // try with resources 
		{
		System.out.println("Please enter your age..");
		int age = in.nextInt();
		if(age<0 || age>120) {
			throw new InvalidAgeException("Invalid age.. Please enter the valid age number..");
		}
		}
		catch(InvalidAgeException invalidAgeEx) {
			invalidAgeEx.printStackTrace();
		}
		catch(InputMismatchException iex) {
			System.out.println("Please provide the valid number input for age....");
			iex.printStackTrace();
		}
		catch(Exception ex) {
			System.out.println("Exception occured.........");
		}
	} 
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		AgeExceptionHandling.getAge();
	}
}

/**
Output:
Please enter your age..
234
javatraining.assessments.day7.InvalidAgeException: Invalid age.. Please enter the valid age number..
	at javatraining.assessments.day7.AgeExceptionHandling.getAge(AgeExceptionHandling.java:23)
	at javatraining.assessments.day7.AgeExceptionHandling.main(AgeExceptionHandling.java:43)

-----
Please enter your age..
sdf
Please provide the valid number input for age....
java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at javatraining.assessments.day7.AgeExceptionHandling.getAge(AgeExceptionHandling.java:21)
	at javatraining.assessments.day7.AgeExceptionHandling.main(AgeExceptionHandling.java:43)
-------	
	
**/	

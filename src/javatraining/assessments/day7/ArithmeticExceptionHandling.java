package javatraining.assessments.day7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Simple Exception Handling
Write a Java program that prompts the user to input two numbers. 
Perform division on these numbers and handle potential exceptions such as division by zero and invalid input (non-numeric input). 
Implement appropriate exception handling and provide error messages for each type of exception.
 * @author ramya
 *
 */
public class ArithmeticExceptionHandling {
	/**
	 * getInputs()
	 */
	public static void getInputs() {
		try(Scanner in = new Scanner(System.in);) {
		System.out.println("Enter number1:");
		int num1 = in.nextInt();
		System.out.println("Enter number2:");
		int num2 = in.nextInt();
		int result = num1/num2;
		System.out.println("Result:::"+result);
		}
		catch(InputMismatchException iex) {
			System.out.println("Provide the valid number inputs...");
			iex.printStackTrace();
		}
		catch(ArithmeticException aex) {
			System.out.println("denominator should not be 0.. please enter the valid input for num2.....Exception::"+aex.getMessage());
			aex.printStackTrace();
		}
		catch(Exception ex) {
			System.out.println("Exception occured......."+ex.getMessage());
			ex.printStackTrace();
		}
	}
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		ArithmeticExceptionHandling.getInputs();
	}
}

/**
Output:
Enter number1:
sdf
Provide the valid number inputs...
java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at javatraining.assessments.day7.ArithmeticExceptionHandling.getInputs(ArithmeticExceptionHandling.java:21)
	at javatraining.assessments.day7.ArithmeticExceptionHandling.main(ArithmeticExceptionHandling.java:45)

---

Enter number1:
23
Enter number2:
0
denominator should not be 0.. please enter the valid input for num2.....Exception::/ by zero
java.lang.ArithmeticException: / by zero
	at javatraining.assessments.day7.ArithmeticExceptionHandling.getInputs(ArithmeticExceptionHandling.java:24)
	at javatraining.assessments.day7.ArithmeticExceptionHandling.main(ArithmeticExceptionHandling.java:45)

**/

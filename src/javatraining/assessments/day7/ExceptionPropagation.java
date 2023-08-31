package javatraining.assessments.day7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
Exception Propagation and Multi-Layered Exception Handling
Create a multi-layered program with multiple methods. One method should read an integer from the user. 
Another method should divide two numbers provided by the user and return the result. Implement exception handling in each method. 
If an exception occurs in any method, it should be propagated up the call stack and handled at the appropriate level. 
 * @author ramya
 *
 */
public class ExceptionPropagation {
	
	private Scanner in = new Scanner(System.in);
	/**
	 * getAge
	 * @throws InputMismatchException
	 * @throws Exception
	 */
	public int getInput() throws InputMismatchException {
		int num = in.nextInt();
		System.out.println("num::"+num);
		return num;
	}
	
	/**
	 * getInputsForArithmeticOpn
	 * @throws ArithmeticException
	 * @throws InputMismatchException
	 * @throws Exception
	 */
	public void getInputsForArithmeticOpn() throws ArithmeticException, InputMismatchException{
		System.out.println("Enter number1:");
		int num1 = getInput();
		System.out.println("Enter number2:");
		int num2 = getInput();
		int result = num1/num2;
		System.out.println("Result:::"+result);
	}
	
	
	/**
	 * main
	 * @param args
	 */
	
	public static void main(String[] args) {
		try {
			ExceptionPropagation exp = new ExceptionPropagation();
			exp.getInputsForArithmeticOpn();
		}
		catch(InputMismatchException iex) {
			System.out.println("Please provide the valid number input....");
			iex.printStackTrace();
		}
		catch(ArithmeticException aex) {
			System.out.println("denominator should not be 0.. please enter the valid input for num2.....Exception::"+aex.getMessage());
			aex.printStackTrace();
		}
		catch(Exception ex) {
			System.out.println("Exception occured.....");
			ex.printStackTrace();
		}
	}

}

/**
Output:
Enter number1:
23
num::23
Enter number2:
3
num::3
Result:::7
------
Enter number1:
23
num::23
Enter number2:
0
num::0
java.lang.ArithmeticException: / by zero
denominator should not be 0.. please enter the valid input for num2.....Exception::/ by zero
	at javatraining.assessments.day7.ExceptionPropagation.getInputsForArithmeticOpn(ExceptionPropagation.java:40)
	at javatraining.assessments.day7.ExceptionPropagation.main(ExceptionPropagation.java:53)
---

Enter number1:
Exception occured.....
java.lang.NullPointerException: Cannot invoke "java.util.Scanner.nextInt()" because "this.in" is null
	at javatraining.assessments.day7.ExceptionPropagation.getInput(ExceptionPropagation.java:24)
	at javatraining.assessments.day7.ExceptionPropagation.getInputsForArithmeticOpn(ExceptionPropagation.java:37)
	at javatraining.assessments.day7.ExceptionPropagation.main(ExceptionPropagation.java:53)

	
---

Enter number1:
sedrf
Please provide the valid number input....
java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at javatraining.assessments.day7.ExceptionPropagation.getInput(ExceptionPropagation.java:24)
	at javatraining.assessments.day7.ExceptionPropagation.getInputsForArithmeticOpn(ExceptionPropagation.java:37)
	at javatraining.assessments.day7.ExceptionPropagation.main(ExceptionPropagation.java:53)
----------
 
 * 
 */

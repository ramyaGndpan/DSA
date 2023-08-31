package javatraining.workArea;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
Exception Propagation and Multi-Layered Exception Handling
Create a multi-layered program with multiple methods. One method should read an integer from the user. 
Another method should divide two numbers provided by the user and return the result. Implement exception handling in each method. 
If an exception occurs in any method, it should be propagated up the call stack and handled at the appropriate level. 

Chained Exception helps to identify a situation in which one exception causes another Exception in an application.

 * @author ramya
 *
 */
public class ExceptionPropagationWithChaining {
	
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
	 * @throws Throwable 
	 * @throws Exception
	 */
	public void getInputsForArithmeticOpn() throws IOException{
		System.out.println("Enter number1:");
		int num1 = getInput();
		System.out.println("Enter number2:");
		int num2 = getInput();
		if(num2==0) {
			//throw new ArithmeticException().initCause(new IOException("Input should not be 0 for the denominator.. Enter the input number>0"));
			throw new IOException("Input should not be 0 for the denominator.. Enter input>0");
		}
		int result = num1/num2;
		System.out.println("Result:::"+result);
		
	}
	
	
	/**
	 * main
	 * @param args
	 * @throws Throwable 
	 */
	
	public static void main(String[] args) throws Throwable {
		try {
			ExceptionPropagationWithChaining exp = new ExceptionPropagationWithChaining();
			exp.getInputsForArithmeticOpn();
		}
		catch(InputMismatchException iex) {
			System.out.println("Please provide the valid number input....");
			iex.printStackTrace();
		}
		catch(IOException ioex) {
			throw new ArithmeticException("\\ by zero error..").initCause(ioex);
			//System.out.println("denominator should not be 0.. please enter the valid input for num2.....");
			//aex.printStackTrace();
		}
		catch(Exception ex) {
			System.out.println("Exception occured.....");
			ex.printStackTrace();
		}
		catch(Throwable th) {
			System.out.println("throwable message......."+th.getMessage());
		}
	}

}

/**
Output:
Enter number1:
23
num::23
Enter number2:
2
num::2
Result:::11
------
Enter number1:
23
num::23
Enter number2:
0
num::0
Exception in thread "main" java.lang.ArithmeticException: \ by zero error..
	at javatraining.day1.ExceptionPropagationWithChaining.main(ExceptionPropagationWithChaining.java:68)
Caused by: java.io.IOException: Input should not be 0 for the denominator.. Enter input>0
	at javatraining.day1.ExceptionPropagationWithChaining.getInputsForArithmeticOpn(ExceptionPropagationWithChaining.java:44)
	at javatraining.day1.ExceptionPropagationWithChaining.main(ExceptionPropagationWithChaining.java:61)

---

Enter number1:
Exception occured.....
java.lang.NullPointerException: Cannot invoke "java.util.Scanner.nextInt()" because "this.in" is null
	at javatraining.assessments.day7.ExceptionPropagation.getInput(ExceptionPropagation.java:24)
	at javatraining.assessments.day7.ExceptionPropagation.getInputsForArithmeticOpn(ExceptionPropagation.java:37)
	at javatraining.assessments.day7.ExceptionPropagation.main(ExceptionPropagation.java:53)

	
---

Enter number1:
sef
Please provide the valid number input....
java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at javatraining.day1.ExceptionPropagationWithChaining.getInput(ExceptionPropagationWithChaining.java:27)
	at javatraining.day1.ExceptionPropagationWithChaining.getInputsForArithmeticOpn(ExceptionPropagationWithChaining.java:39)
	at javatraining.day1.ExceptionPropagationWithChaining.main(ExceptionPropagationWithChaining.java:61)
----------
 
 * 
 */

package javatraining.assessments.day6;

/**
 * Utility Class with Static Methods
Create a utility class named MathUtil that contains static methods for performing basic mathematical operations: addition, subtraction, multiplication, and division. 
Utilize the class to perform calculations without creating instances. Provide an example of how to use these static methods.
 * @author ramya
 *
 */
public class MathUtil {

	/**
	 * additin of 2 numbers
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static double add(double num1, double num2) {
		return num1+num2;
	}
	
	/**
	 * difference of 2 numbers
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static double diff(double num1, double num2) {
		return num1-num2;
	}
	
	/**
	 * multiply 2 numbers
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static double mul(double num1, double num2) {
		return num1*num2;
	}
	
	/**
	 * division of 2 numbers
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static double div(double num1, double num2) {
		return num1/num2;
	}
	
	/**
	 * display the result of operation
	 * @param opn
	 * @param result
	 */
	public static void displayResult(String opn, double result) {
		System.out.println("operation::"+opn+"::result:::"+result);
	}
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		MathUtil.displayResult("add",MathUtil.add(250, 30));
		MathUtil.displayResult("diff",MathUtil.diff(250, 30));
		MathUtil.displayResult("mul",MathUtil.mul(250, 30));
		MathUtil.displayResult("div",MathUtil.div(250, 30));
	}

}

/**
 * Output:
operation::add::result:::280.0
operation::diff::result:::220.0
operation::mul::result:::7500.0
operation::div::result:::8.333333333333334
**/ 

package javatraining.assessments.day6;

/**
 * static Calculator
Create a Calculator class with a static method called add that takes two integers as parameters and returns their sum. Demonstrate its usage in the main method.
 * @author ramya
 *
 */
final class Calculator {
	/**
	 * add
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int add(int num1, int num2) {
		int result = num1+num2;
		System.out.println("sum:::"+result);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static calculator
		Calculator.add(10, 20); 
		Calculator.add(-20, -40); 
		Calculator.add(-20, 40);
	}
}
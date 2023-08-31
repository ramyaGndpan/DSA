package javatraining.assessments.day6;

/**
 * static Math Library
Implement a MathLibrary class with various static methods such as factorial, squareRoot, and power. 
Use this class to calculate and print factorial, square root, and power values in the main method.
 * @author ramya
 *
 */
final class MathLibrary {

	public static int findFactorial(int num) {
		int fact = 1;
		if(num>0) {
		fact = num * findFactorial(num-1);}
		return fact;
	}
	
	public static double findSquareRoot(double num) {
		return Math.sqrt(num);
	}
	
	public static double findPower(double base, double exponent) {
		return Math.pow(base,exponent);
	}

	public static void main(String[] args) {
		//static Math library
		System.out.println("factorial:::"+MathLibrary.findFactorial(5));
		System.out.println("sqroot:::"+MathLibrary.findSquareRoot(25));
		System.out.println("power:::"+MathLibrary.findPower(2, 5));
	}


	
}


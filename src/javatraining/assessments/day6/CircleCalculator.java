package javatraining.assessments.day6;


/**
 * Using final Constants
Create a class CircleCalculator that calculates the area and circumference of a circle. 
Use a final variable for the value of PI. 
Implement methods for the calculations and demonstrate their use

 * @author ramya
 *
 */
public class CircleCalculator {

	private static final double PI = 3.14;
	
	public static double area(double radius) {
		return PI * radius * radius;
	}

	public static double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public static void main(String[] args) {
		System.out.println("area::"+CircleCalculator.area(5));
		System.out.println("circumference:::"+CircleCalculator.circumference(5));
	}
}

/**
output:
area::78.5
circumference:::31.400000000000002

**/

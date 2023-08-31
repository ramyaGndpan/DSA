package javatraining.assessments.day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {

	/* length of the rectangle */
	public static double length;
	
	/* width of the rectangle */
	public static double width;
	
	/**
	 * findArea
	 * to find the area of the rectangle
	 * @return
	 */
	public static double findArea() {
		double area = length * width;
		return area;
	}
	
	/**
	 * findPerimeter
	 * to find the perimeter of the rectangle
	 * @return
	 */
	public static double findPerimeter() {
		double perimeter = 2*(length + width);
		return perimeter;
	}
	
	/**
	 * display - displays the message 
	 * @param message
	 */
	public static void display(String message) {
		System.out.println(message);
	}
	
	/**
	 * getInputs 
	 * get the user inputs for length and breadth 
	 */
	public static void getInputs() {
		Scanner in = null;
		try {
			in = new Scanner(System.in);
			display("Please enter the length:::");
			length = in.nextDouble();
			display("Please enter the width:::");
			width = in.nextDouble();
		}
		catch(InputMismatchException inputMismatchEx) {
			inputMismatchEx.printStackTrace();
		}
		finally {
			in.close();
		}
		
	}
	
	/**
	 * checkNumber 
	 * to check if the arguments passed for the parameter is a positive or negative number or zero
	 * @param number
	 */
	public static void checkNumber(int number) {
		if(number==0) {
			display("input is zero..");
		}else if(number>0){
			display("input is a positive number..");
		} else {
			display("input is a negative number..");
		}
	}
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		getInputs();
		display("Area of the rectangle:::"+Rectangle.findArea());
		display("Perimeter of the rectangle:::"+Rectangle.findPerimeter());
		
		//to check if the arguments passed for the parameter is a positive or negative number or zero
		checkNumber(1);
		checkNumber(-1);
		checkNumber(0);
	}

}

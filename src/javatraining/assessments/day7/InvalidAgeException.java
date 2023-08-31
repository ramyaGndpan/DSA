package javatraining.assessments.day7;


/**
 * Custom Exception
Create a custom exception class named InvalidAgeException. 
Write a program that takes the age of a person as input and throws this exception if the age is less than 0 or greater than 120. 
Handle the custom exception using a try-catch block.
 * @author ramya
 *
 */
public class InvalidAgeException extends Exception{
	
	public InvalidAgeException() {
		super();
	}
	public InvalidAgeException(String message) {
		super(message);
	}
	public InvalidAgeException(String message,Throwable cause) {
		super(message,cause);
	}
}

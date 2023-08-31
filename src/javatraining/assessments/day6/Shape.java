package javatraining.assessments.day6;

final class Shape {
	
	public double calculateArea() {
		return 0;
	}
	
}

// resulted in compilation error - since final class cannot be sub classed or inherited.. 
// here Shape is the final class and when the class Triangle tried to inherit it shows the compilation error 
/*
 * class Triangle extends Shape {
 * 
 * }
 */
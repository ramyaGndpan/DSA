package javatraining.assessments.day6;

import javatraining.assessments.day3.Circle;
import javatraining.assessments.day3.Rectangle;
import javatraining.assessments.day3.Triangle;

/**
 * Static Factory Methods
Design a static factory class named ShapeFactory that provides static methods to create instances of different geometric shapes: Circle, Rectangle, and Triangle. 
Each method should accept necessary parameters to create the shape. Demonstrate the usage of these factory methods.
 * @author ramya
 *
 */
public class ShapeFactory {

	private final static ShapeFactory objShapeFactory = new ShapeFactory();
	private ShapeFactory() {
	}
	
	public static ShapeFactory getInstance() {
		return objShapeFactory;
	}
	
	private static Circle getCircle(double radius) {
		return new Circle(radius);
	}
	
	private static Rectangle getRectangle(double length, double width) {
		return new Rectangle(length, width);
	}
	
	private static Triangle getTriangle(double base, double height) {
		return new Triangle(base,height);
	}
	

	public static void main(String[] args) {
		ShapeFactory.getInstance().getCircle(5).calculateArea();
		ShapeFactory.getInstance().getRectangle(10, 20).calculateArea();
		ShapeFactory.getInstance().getTriangle(5, 4).calculateArea();
	}

}

/**
Output:
Area of circle::78.53981633974483
Area of Rectangle::200.0
Area of Triangle::10.0


**/

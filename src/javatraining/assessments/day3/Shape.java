package javatraining.assessments.day3;

/**
 * Assignment: Class and object concepts
 * @author ramya
 *
 */
public class Shape {
	private String fieldColor;
	protected double area;
	protected double calculateArea() {
		return 0.0;
	}
	
	public static void main(String[] args) {
		Shape[] arrShape =  new Shape[] {new Circle(5),new Rectangle(2,4),new Triangle(3,5)};
		for(Shape objShape: arrShape) {
			objShape.calculateArea();
		}
	}

	/**
	 * @return the fieldColor
	 */
	public String getFieldColor() {
		return fieldColor;
	}

	/**
	 * @param fieldColor the fieldColor to set
	 */
	public void setFieldColor(String fieldColor) {
		this.fieldColor = fieldColor;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}
	
	/*
	 * Output: 
	 * Area of circle::78.53981633974483 
	 * Area of Rectangle::8.0 
	 * Area of Triangle::7.5
	 */	
}



package javatraining.assessments.day3;

public class Rectangle extends Shape{
	private double length;
	private double width;
	public Rectangle(double aLength, double aWidth) {
		this.length = aLength;
		this.width = aWidth;
	}
	
	@Override
	public double calculateArea() {
		area = length * width;
		System.out.println("Area of Rectangle::"+area);
		return area;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}	
}
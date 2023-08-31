package javatraining.assessments.day3;

public class Triangle extends Shape{
	private double base;
	private double height;
	public Triangle(double aBase, double aHeight) {
		this.base = aBase;
		this.height = aHeight;
	}
	
	@Override
	public double calculateArea() {
		area = (base * height)/2;
		System.out.println("Area of Triangle::"+area);
		return area;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}	
}

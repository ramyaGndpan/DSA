package javatraining.assessments.day3;

public class Circle extends Shape{
	private double radius;
	public Circle(double pRadius) {
		this.radius = pRadius;
	}
	
	@Override
	public double calculateArea() {
		area = Math.PI * (Math.pow(radius, 2)); 
		System.out.println("Area of circle::"+area);
		return area;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}	
}

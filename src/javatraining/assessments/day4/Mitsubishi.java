package javatraining.assessments.day4;

public class Mitsubishi extends Car {

	/**
	 * Mitsubishi
	 * @param cylinders
	 * @param name
	 */
	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
		// TODO Auto-generated constructor stub
	}

	
	public String startEngine() {
		return "Mitsubishi => startEngine::::";
	}
	
	public String accelerate() {
		return "Mitsubishi => accelerate::::";
	}
	
	public String brake() {
		return "Mitsubishi => brake::::";
	}
}

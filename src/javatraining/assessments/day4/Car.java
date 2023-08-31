package javatraining.assessments.day4;

public class Car {

	boolean engine;
	int cylinders;
	String name;
	int wheels;
	
	/**
	 * @param cylinders
	 * @param name
	 */
	public Car(int cylinders, String name) {
		super();
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
		this.engine = true;
	}

	/**
	 * @return the cylinders
	 */
	public int getCylinders() {
		return cylinders;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	
	public String startEngine() {
		return "Car => startEngine::::";
	}
	
	public String accelerate() {
		return "Car => accelerate::::";
	}
	
	public String brake() {
		return "Car => brake::::";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(8, "Base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		 
		Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());
		 
		Ford ford = new Ford(6, "Ford Falcon");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
		 
		Holden holden = new Holden(6, "Holden Commodore");
		System.out.println(holden.startEngine());
		System.out.println(holden.accelerate());
		System.out.println(holden.brake());

	}
	
/**
OUTPUT:::::::
Car => startEngine::::
Car => accelerate::::
Car => brake::::
Mitsubishi => startEngine::::
Mitsubishi => accelerate::::
Mitsubishi => brake::::
Ford => startEngine::::
Ford => accelerate::::
Ford => brake::::
Holden => startEngine::::
Holden => accelerate::::
Holden => brake::::
 */
}


package javatraining.assessments.day3;

public class VehicleManager {
	public static void main(String[] args) {
		Vehicle[] arrVehicle = new Vehicle[] {new Car(), new MotorCycle(), new Truck()};
		for(Vehicle objVehicle: arrVehicle) {
			objVehicle.start();
			objVehicle.stop();
		}
	}
}

/*
 * Output: 
 * car started.... 
 * car stopped.... 
 * motorcycle started.... 
 * motorcycle stopped.... 
 * truck started.... 
 * truck stopped....
 * 
 */

interface Vehicle{
	//by default methods are public and abstract -  so no need to specify "abstract" keyword in method definition.. however in class we should specify public during implementing the same method
	// since in class methods are not public by default.. hence void start() in interface however in the class implementing interface=> public void start() => need to specify public in class
	void start();
	void stop();
}

class Car implements Vehicle{
	@Override
	public void start() {
		System.out.println("car started....");
	}
	@Override
	public void stop() {
		System.out.println("car stopped....");
	}
}

class MotorCycle implements Vehicle{
	@Override
	public void start() {
		System.out.println("motorcycle started....");
	}
	@Override
	public void stop() {
		System.out.println("motorcycle stopped....");
	}
}

class Truck implements Vehicle{
	@Override
	public void start() {
		System.out.println("truck started....");
	}
	@Override
	public void stop() {
		System.out.println("truck stopped....");
	}
}

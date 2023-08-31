package javatraining.assessments.day6;

/**
 * Inheritance and Static Methods
Create a superclass named Vehicle with a static method showInfo() that prints "This is a vehicle." 
Create a subclass Car that extends Vehicle and overrides the showInfo() method to print "This is a car." 
Demonstrate how the behavior of static methods changes when accessed through the subclass.
 * @author ramya
 *
 */
public class Vehicle {
	
	public static String strInfo = "vehicle";
	public static void showInfo() {
		System.out.println("This is a vehicle...");
	}
	
	public final void startEngine() {
		System.out.println("vehicle started.....");
	}
	
	
	public static void main(String[] args) {
		Vehicle.showInfo();
		System.out.println("strInfo::"+Vehicle.strInfo);
		Car.showInfo();
		System.out.println("strInfo::"+Car.strInfo); //  static variable - updation occurs in the same copy of strInfo from super class
		showInfo();//any call to that static method will go to static method declared in that class itself
		System.out.println("strInfo::"+strInfo);
		
		/**
		 * Method hiding:
		 * If a subclass defines a static method with the same signature as a static method in the superclass, then the method in the subclass hides the one in the superclass. 
		 * This mechanism happens because the static method is resolved at the compile time. 
		 * Static method bind during the compile time using the type of reference not a type of object.	
		 */		
		Vehicle veh = new Vehicle();
		Vehicle vehCar = new Car(); //not based on the objects created (Car object) however based on the type of reference (Vehicle ref: hence static method of vehicle called)
		Car car1 = new Car(); 
		veh.showInfo();
		vehCar.showInfo();
		car1.showInfo();
	}

}

/**
 * Class: Car
 * @author ramya
 *
 */
class Car extends Vehicle{
	public Car() {
		super();
	}

//	@Override --  the method showInfo of type Car must override or implement a super type method -- suggesting to remove the override annotation - means static methods cannot be overridden
//  In short, a static method can be overloaded, but can not be overridden in Java. 
//	If we declare, another static method with same signature in derived class then the static method of superclass will be hidden (method hiding), 
//	and any call to that static method in subclass will go to static method declared in that class itself.	

	public static void showInfo() {
		strInfo = "Car";
		System.out.println("This is a car...");
	}
	
	// compilation error - cannot override the final method from Vehicle class
	// reason: sub/inherited class cannot override the final methods in the parent class and startEngine() is the final method in parent class Vehicle hence it cannot be overidden..
	
	/*
	 * public final void startEngine() { System.out.println("vehicle started.....");
	 * }
	 */
	
	
}

/**
Output:
This is a vehicle...
strInfo::vehicle
This is a car...
strInfo::Car
This is a vehicle...
strInfo::Car

**/
/**
Method Hiding :
If a subclass defines a static method with the same signature as a static method in the superclass, then the method in the subclass hides the one in the superclass. This mechanism happens because the static method is resolved at the compile time. Static method bind during the compile time using the type of reference not a type of object.

Note: 
=> method hiding=> method binding happened at compile time for the static methods based on the type of reference => hence method resolved at compile time itself 
=> method overriding=> method binding happened based on the type of objects created (dynamic binding) for the non static methods => hence method resolved at run time 

Difference Between Method Overriding and Method Hiding in Java
    In method overriding both the method parent class and child class are non-static.
    In method Hiding both the method parent class and child class are static.
    In method Overriding method resolution is done on the basis of the Object type.
    In method Hiding method resolution is done on the basis of reference type.
    The version of the overridden instance method that gets invoked is the one in the subclass.
    The version of the hidden static method that gets invoked depends on whether it is invoked from the superclass or the subclass.
https://www.geeksforgeeks.org/method-hiding-in-java/#
   
Important Points about method overriding and static methods

The following are some important points for method overriding and static methods in Java. 

For class (or static) methods, the method according to the type of reference is called, not according to the object being referred, which means method call is decided at compile time.
For instance (or non-static) methods, the method is called according to the type of object being referred, not according to the type of reference, which means method calls is decided at run time.
An instance method cannot override a static method, and a static method cannot hide an instance method. For example, the following program has two compiler errors. 
In a subclass (or Derived Class), we can overload the methods inherited from the superclass. Such overloaded methods neither hide nor override the superclass methods — they are new methods, unique to the subclass.

https://www.geeksforgeeks.org/can-we-overload-or-override-static-methods-in-java/?ref=ml_lbp                   
REfer this link for details..    
    
**/    
package javatraining.assessments.day3;

/**
 * Abstraction and Interfaces
 * @author ramya
 *
 */

public class AnimalController{
	public static void main(String[] args) {
		Animal[] arrAnimal = new Animal[] {new Dog(), new Cat(), new Bird()};
		for(Animal objAnimal: arrAnimal) {
			objAnimal.sound();
			objAnimal.move();
		}
	}
}

/*
 * Output: 
 * dog sounds..... 
 * dog moves..... 
 * cat sounds..... 
 * cat moves..... 
 * bird sounds..... 
 * bird moves.....
 */
	
abstract class Animal {
	//by default interface methods are public and abstract, however for abstract class we need to mention it as abstract method.. since it contains both concrete and abstract(only defn no impln) methods.. 
	//when implementing interfaces.. all abstract methods will turn to public methods and not abstract anymore since it contains implementation..
abstract void sound();
abstract void move();
//Animal(){} - we can create constructors for the abstract classes for initialization - however not
}

class Dog extends Animal{
	// if you remove public here it wont show error since it will be treated as new method of dog and not the inherited method of animal however in interface if you remove public 
	// it will show error since the class which implements the interface can provide the implementation for all the methods in interface for sure
	@Override
	public void sound() { 
		System.out.println("dog sounds.....");
	}
	@Override
	public void move() {
		System.out.println("dog moves.....");
	}
}

class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("cat sounds.....");
	}
	@Override
	public void move() {
		System.out.println("cat moves.....");
	}
}

class Bird extends Animal{
	@Override
	public void sound() {
		System.out.println("bird sounds.....");
	}
	@Override
	public void move() {
		System.out.println("bird moves.....");
	}
}



package javatraining.assessments.day6;

/**
 * Non-Overridable Methods
Create a base class Animal with a final method makeSound() that prints "Animal makes a sound." 
Design a subclass Dog that attempts to override the makeSound() method. Explain why this override is not allowed.
 * @author ramya
 *
 */
public class Animal {

	public final void makeSound() {
		System.out.println("Animal makes sound.....");
	}
}

// compilation error : cannot ovveride the final method makeSound()
// since final methods cannot be overridden by the sub class when inherited and makeSound() is a final method which resulted in compilation error
class Dog extends Animal {
	/*
	 * public final void makeSound() { System.out.println("Dog makes sound....."); }
	 */
}
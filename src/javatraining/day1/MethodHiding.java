package javatraining.day1;

/*
 * public class MethodHiding { public static void main(String[] args) {
 * MethodHiding obj = new MethodHiding(); Animal animal = obj.new Animal();
 * Animal cat = obj.new Cat();
 * 
 * animal.printType(); // Output: Generic animal cat.printType(); // Output:
 * Generic animal (method hiding, not overriding) }
 * 
 * private class Animal { public void printType() {
 * System.out.println("Generic animal"); } }
 * 
 * private class Cat extends Animal { public void printType() {
 * System.out.println("Cat"); } } }
 */

// main class can be public, abstract and final
// we can have inner classes as private, static
public class MethodHiding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();

        animal.printType(); // Output: Generic animal
        cat.printType();    // Output: Generic animal (method hiding, not overriding)
        System.out.println("temp animal:"+animal.temp+" cat temp::"+cat.temp);
    }

    static class Animal {
    	public static int temp = 0;
        public void printType() {
            System.out.println("Generic animal");
        }
    }

    static class Cat extends Animal {
    	//super.temp = 1;
    	public Cat() {
    		super();
    	}
        public void printType() {
        	super.temp = 1;
            System.out.println("Cat"+super.temp);
        }
    }
}
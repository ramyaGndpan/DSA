package javatraining.assessments.day6;

/**
 * static Counter
Design a Counter class with a static variable count that keeps track of the number of instances created. Implement a constructor that increments this count. 
Write a main program to create multiple instances of the Counter class and display the total count.
 * @author ramya
 *
 */
final class Counter {
	public static int count;
	
	public Counter() {
		++count;
		System.out.println("counter object created>>>>>>>"+count);
	}
	
	/**
	 * getCountOfInstances
	 * @return
	 */
	public static int getCountOfInstances() {
		return count;
	}
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		//static counter
		Counter objCounter1 = new Counter();
		Counter objCounter2 = new Counter();
		System.out.println("total number of counter objects::"+Counter.getCountOfInstances());
		Counter objCounter3 = new Counter();
		System.out.println("total number of counter objects::"+Counter.getCountOfInstances());
	}
	
}
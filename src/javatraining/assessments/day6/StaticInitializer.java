package javatraining.assessments.day6;

/**
 * Using Static Initialization Blocks
Design a class named StaticInitializer with a static variable count and a static initialization block that increments count by 
1. Create multiple instances of the class and observe the value of count for each instance.
 * @author ramya
 *
 */
public class StaticInitializer {

	private static int count=0;
	
	// it loads only once during the class loading and this will not get executed when instances created
	static {
		System.out.println("static block started:::");
		++count;
	}
	
	public static void main(String[] args) {
		StaticInitializer obj1 = new StaticInitializer();
		System.out.println("count::"+StaticInitializer.count);
		StaticInitializer obj2 = new StaticInitializer();
		System.out.println("count::"+StaticInitializer.count);
		StaticInitializer obj3 = new StaticInitializer();
		System.out.println("count::"+StaticInitializer.count);
	}
	

}

/**
Ouput:
static block started:::
count::1
count::1
count::1
 */
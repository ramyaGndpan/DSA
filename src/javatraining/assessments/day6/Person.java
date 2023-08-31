package javatraining.assessments.day6;

/**
 * Immutable Person
Create an immutable class Person with final fields for name and age. Provide a constructor for initialization and ensure that no public methods allow modification of these fields.
 * @author ramya
 *
 */
final class Person {
	private final String name;
	private final int age;
	
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}



	public static void main(String[] args) {
		
		Person objPerson = new Person("sdf",21);
		//objPerson.age = 23; // error: final field age cannot be assigned
		System.out.println("name::"+objPerson.getName()+" age::"+objPerson.getAge()); //no public setter methods to modify the name and age value
	}

	/*
	 * error: cannot subclass the final class Person
	 * class Personsub1 extends Person{
	 * 
	 * }
	 */

}

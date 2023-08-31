package javatraining.assessments.day6;

final class Contact {

	private final String name;
	private final String phoneNumber;
	/**
	 * @param name
	 * @param phoneNumber
	 */
	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	public static void main(String[] args) {
		Contact contact1 = new Contact("ram", "23424234");
		System.out.println(contact1.toString());
		System.out.println("name::"+contact1.getName()+" phoneNo::"+contact1.getPhoneNumber());
		Contact contact2 = new Contact("vas", "3424234234");
		System.out.println(contact2.toString());
		System.out.println("name::"+contact2.getName()+" phoneNo::"+contact2.getPhoneNumber());
	}
	 
	
}

/**
Output:
Contact [name=ram, phoneNumber=23424234]
name::ram phoneNo::23424234
Contact [name=vas, phoneNumber=3424234234]
name::vas phoneNo::3424234234

**/

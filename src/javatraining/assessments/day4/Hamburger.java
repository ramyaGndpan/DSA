package javatraining.assessments.day4;

public class Hamburger {

	private String name;
	private String meat;
	private double price;
	private String breadRollType;
	
	private String addition1Name;
	private double addition1Price;
	private String addition2Name;
	private double addition2Price;
	private String addition3Name;
	private double addition3Price;
	private String addition4Name;
	private double addition4Price;
	
	/**
	 * @param name
	 * @param meat
	 * @param price
	 * @param breadRollType
	 */
	public Hamburger(String name, String meat, double price, String breadRollType) {
		super();
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRollType = breadRollType;
		System.out.println(name+" Hamburger on a "+breadRollType+" roll with "+meat+", price is "+price);
	}


	public void addHamburgerAddition1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
		this.price += addition1Price;
		displayAddition(name,price);
	}
	
	public void addHamburgerAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
		this.price += addition2Price;
		displayAddition(name,price);
	}

	public void addHamburgerAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
		this.price += addition3Price;
		displayAddition(name,price);
	}

	public void addHamburgerAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
		this.price += addition4Price;
		displayAddition(name,price);
		
	}
	
	public void displayAddition(String name, double price) {
		System.out.println("Added "+name+" for an extra "+price);
	}
	
	
	public double itemizeHamburger() {
		return this.price;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
		hamburger.addHamburgerAddition1("Tomato", 0.27);
		hamburger.addHamburgerAddition2("Lettuce", 0.75);
		hamburger.addHamburgerAddition3("Cheese", 1.13);
		System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
		
		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
		healthyBurger.addHamburgerAddition1("Egg", 5.43);
		healthyBurger.addHealthyAddition1("Lentils", 3.41);
		System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

		DeluxeBurger db = new DeluxeBurger();
		db.addHamburgerAddition3("Should not do this", 50.53);
		System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());		
	}
	
	
/**
OUTPUT:

Basic Hamburger on a White roll with Sausage, price is 3.56
Added Tomato for an extra 0.27
Added Lettuce for an extra 0.75
Added Cheese for an extra 1.13
Total Burger price is 5.71
Healthy Hamburger on a Brown rye roll with Bacon, price is 5.67
Added Egg for an extra 5.43
Added Lentils for an extra 3.41
Total Healthy Burger price is  14.51
Deluxe Hamburger on a White roll with Sausage & Bacon, price is 14.54
Added Chips for an extra 2.75
Added Drink for an extra 1.81
Cannot add additional items to a deluxe burger:::
Total Deluxe Burger price is 19.099999999999998


 */
}

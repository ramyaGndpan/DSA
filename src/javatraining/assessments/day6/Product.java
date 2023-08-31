package javatraining.assessments.day6;

/**
 * Object Instance Counter
Design a class named Product that represents products in an inventory. 
Implement a static variable to keep track of the number of Product instances created. 
Include a constructor to initialize product details and demonstrate how the instance counter changes with each object creation.
 * @author ramya
 *
 */
public class Product {

	private static int instanceCtr;
	private String productName;
	private int productId;
	private double productPrice;
	/**
	 * @param productName
	 * @param productId
	 * @param productPrice
	 */
	public Product(String productName, int productId, double productPrice) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.productPrice = productPrice;
		++instanceCtr;
	}
	
	public static int getNoOfInstances() {
		return instanceCtr;
	}
	
	/**
	 * @return the instanceCtr
	 */
	public static int getInstanceCtr() {
		return instanceCtr;
	}

	/**
	 * @param instanceCtr the instanceCtr to set
	 */
	public static void setInstanceCtr(int instanceCtr) {
		Product.instanceCtr = instanceCtr;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the productPrice
	 */
	public double getProductPrice() {
		return productPrice;
	}

	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public static void main(String[] args) {
		Product prod1 = new Product("prod1", 123, 25.23);
		System.out.println("no.. of instances created:::"+Product.getNoOfInstances());
		Product prod2 = new Product("prod2", 124, 20.23);
		System.out.println("no.. of instances created:::"+Product.getNoOfInstances());
		Product prod3 = new Product("prod3", 124, 20.23);
		System.out.println("no.. of instances created:::"+Product.getNoOfInstances());
	}
	
}
/**
Output:
no.. of instances created:::1
no.. of instances created:::2
no.. of instances created:::3
**/

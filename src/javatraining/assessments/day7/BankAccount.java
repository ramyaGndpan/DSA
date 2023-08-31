package javatraining.assessments.day7;

import java.io.IOException;

/**
 * 
 * @author ramya
 *
 */
public class BankAccount {

	private final int accountNumber;
	private String accountName;
	private String contactNumber;
	private double balance;
	/**
	 * @param accountNumber
	 * @param accountName
	 * @param contactNumber
	 * @param balance
	 * @throws IOException 
	 */
	public BankAccount(int accountNumber, String accountName, String contactNumber, double balance) throws IOException {
		super();
		this.accountNumber = accountNumber;
		if((String.valueOf(accountNumber)).length()!=9) {
			throw new IOException("Account number should have 9 digits..Invalid account Number.."+accountNumber);
		}
		this.accountName = accountName;
		this.contactNumber = contactNumber;
		this.balance = balance;
	}
	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}
	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}
	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	
	
}

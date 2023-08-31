package javatraining.assessments.day3;

/**
 * Assignment: Encapsulation and Access Modifiers
 * @author ramya
 *
 */
public class BankAccount {

	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public void deposit() {
		
	}
	
	public void withdraw() {
		
	}
	
	public void checkBalance() {
		
	}

	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the accountHolder
	 */
	public String getAccountHolder() {
		return accountHolder;
	}

	/**
	 * @param accountHolder the accountHolder to set
	 */
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	/**
	 * @return the accountBalance
	 */
	public double getAccountBalance() {
		return accountBalance;
	}

	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}

class SavingsAccount extends BankAccount{
	private double interestRate;
	@Override
	public void withdraw() {
		
	}
	/**
	 * @return the interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}
	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}

class CheckingAccount extends BankAccount{
	private double minimumBalance;
	@Override
	public void checkBalance() {
		
	}
	/**
	 * @return the minimumBalance
	 */
	public double getMinimumBalance() {
		return minimumBalance;
	}
	/**
	 * @param minimumBalance the minimumBalance to set
	 */
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
}
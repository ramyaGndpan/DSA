package javatraining.assessments.day7;

import java.io.IOException;

/**
 * Nested Exception Handling
Create a program that simulates a simple banking system. 
Implement classes for BankAccount and Transaction. 
Write a method that transfers funds between two bank accounts, handling exceptions such as insufficient funds, invalid account numbers, etc. 
Implement nested exception handling to provide detailed error messages.

 * @author ramya
 *
 */
public class Transaction {

	public static void transferFunds(BankAccount currAccount, BankAccount payeeAccount, double amount) throws IOException {
		System.out.println("before transaction:::currentAcc balance::"+currAccount.getBalance()+" payeeAccount balance:::"+payeeAccount.getBalance());
		if(amount>currAccount.getBalance()) {
			throw new IOException("Transaction Amount::"+amount+" ::Insufficient funds.. unable to process fund transfer..");
		}else {
			payeeAccount.setBalance(payeeAccount.getBalance()+amount);
			currAccount.setBalance(currAccount.getBalance()-amount);
		}
		System.out.println("after transaction:::currentAcc::"+currAccount.getBalance()+" payeeAccount:::"+payeeAccount.getBalance());
		
	}
	
	public static void main(String[] args) {
		try {
		BankAccount currAccount = new BankAccount(12313424, "ram", "123134", 30000);
		BankAccount payeeAccount = new BankAccount(234223232, "vas", "345354", 40000);
		Transaction.transferFunds(currAccount,payeeAccount,5000);
		}
		catch(IOException ioex) {
			ioex.printStackTrace();
		}
		catch(Exception ex) {
			System.out.println("Exception occured....");
			ex.printStackTrace();
		}
	}
}


/**
Output:

before transaction:::currentAcc balance::30000.0 payeeAccount balance:::40000.0
after transaction:::currentAcc::25000.0 payeeAccount:::45000.0
-----------
java.io.IOException: Account number should have 9 digits..Invalid account Number..12313424
	at javatraining.assessments.day7.BankAccount.<init>(BankAccount.java:27)
	at javatraining.assessments.day7.Transaction.main(Transaction.java:35)
--------
before transaction:::currentAcc balance::30000.0 payeeAccount balance:::40000.0
java.io.IOException: Transaction Amount::35000.0 ::Insufficient funds.. unable to process fund transfer..
	at javatraining.assessments.day7.Transaction.transferFunds(Transaction.java:20)
	at javatraining.assessments.day7.Transaction.main(Transaction.java:37)
	

**/

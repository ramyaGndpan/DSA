package javatraining.assessments.day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountServiceManager implements AccountService {

	private static Scanner in = BankAccountSystem.in;
	public void createAccount() {
		AccountDetails accountDetailsBean = new AccountDetails();
		try {
			System.out.println("Thanks for creating account in our bank.." + "\n Please enter your full Name:");
			String strAccountName = in.next();

			accountDetailsBean.setAccountName(strAccountName);
			System.out.println("\n Please choose the account Type: 1. Checking Account 2. Savings Account");
			int choice = in.nextInt();
			String strAccountType = (choice == 1 ? "Checking" : "Savings");
			accountDetailsBean.setAccountType(strAccountType);

			System.out.println("\n Please enter your age:");
			int age = in.nextInt();
			accountDetailsBean.setAge(age);

			System.out.println("\n Please enter your address:");
			String strAddress = in.next();
			accountDetailsBean.setAddress(strAddress);

			System.out.println("\n Please deposit your amount:");
			double depositedAmount = in.nextDouble();
			accountDetailsBean.setAccountBalance(depositedAmount);
		} catch (InputMismatchException iex) {
			iex.printStackTrace();
		}

		int accountNumber = (int) (Math.random() * 100000);
		accountDetailsBean.setAccountId(accountNumber);
		System.out.println("\n Congratulations.. Account successfully created...");
		BankAccountSystem.accountDetailsBean = accountDetailsBean;
	}

	public void depositAmount() {
		AccountDetails accountDetailsBean = BankAccountSystem.accountDetailsBean;
		if (null != accountDetailsBean) {
			System.out.println("\n Please deposit your amount to deposit:");
			double depositedAmount = in.nextDouble();
			accountDetailsBean.setAccountBalance(accountDetailsBean.getAccountBalance() + depositedAmount);
			System.out.println("\n Amount successfully deposited..");
		} else {
			System.out.println("\n Account doesnt exist.. Please create an account:");
		}
	}

	public void withdrawAmount() {
		AccountDetails accountDetailsBean = BankAccountSystem.accountDetailsBean;
		if (null != accountDetailsBean) {
			System.out.println("\n Please deposit your amount to withdraw:");
			double withdrawalAmount = in.nextDouble();
			if (withdrawalAmount > accountDetailsBean.getAccountBalance()) {
				System.out.println("\n Sorry.. Insufficient funds in your account..");
			} else {
				accountDetailsBean.setAccountBalance(accountDetailsBean.getAccountBalance() - withdrawalAmount);
				System.out.println("\n Amount successfully withdrawn...");
			}
		} else {
			System.out.println("\n Account doesnt exist.. Please create an account:");
		}
	}

	public void checkBalance() {
		AccountDetails accountDetailsBean = BankAccountSystem.accountDetailsBean;
		if (null != accountDetailsBean) {
			System.out.println("\n Account Details:" + "\n Account Number:" + accountDetailsBean.getAccountId()
					+ "\n Account Name:" + accountDetailsBean.getAccountName() + "\n Account Type:"
					+ accountDetailsBean.getAccountType() + "\n Account Balance:"
					+ accountDetailsBean.getAccountBalance());
		} else {
			System.out.println("\n Account doesnt exist.. Please create an account:");
		}
	}

}

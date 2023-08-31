package javatraining.assessments.day2;

import java.util.Scanner;

public class BankAccountSystem {

	public static AccountDetails accountDetailsBean;
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		AccountService accountService = new AccountServiceManager();
		int service;
		do {
			System.out.println("Please select the service.." + "\n 1.Create an Account" + "\n 2.Deposit Amount"
					+ "\n 3.Withdraw Amount" + "\n 4.Check Account Balance" + "\n 5.Exit");
			service = in.nextInt();
			switch (service) {
			case 1:
				accountService.createAccount();
				break;
			case 2:
				accountService.depositAmount();
				break;
			case 3:
				accountService.withdrawAmount();
				break;
			case 4:
				accountService.checkBalance();
				break;
			case 5:
				System.out.println("exiting.. thanks for using our service...");
				System.exit(0);
			default:
				System.out.println("Please select the correct option..");
				break;
			}

		} while (service != 5);
	}

}

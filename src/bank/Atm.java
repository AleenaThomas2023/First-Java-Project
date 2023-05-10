package bank;

import java.util.Scanner;

public class Atm extends BankOperations {
	public boolean validatePin(PersonAccount account, int enteredPin) {

		return account.getPin() == enteredPin ;

	}

	@Override
	public void withdrawMoney(PersonAccount account, double moneyToBeWithdrawn) {

		if (moneyToBeWithdrawn < account.getBalance()) {
			System.out.println("Please collect your money : " + moneyToBeWithdrawn);

			account.setBalance(account.getBalance() - moneyToBeWithdrawn);

		} else {
			System.out.println("Sorry! insufficient balane");
		}

	}

	@Override
	public void depositMoney(PersonAccount account, double moneytoBeDeposit) {
		double deposit = moneytoBeDeposit + account.getBalance();
		System.out.println("money has deposited " + moneytoBeDeposit);
		account.setBalance(account.getBalance() + moneytoBeDeposit);
	}

	@Override
	public void viewBalance(PersonAccount account) {
		System.out.println("The balance of the account : " + account.getBalance());
	}

	Scanner sc = new Scanner(System.in);

	@Override
	public void changePinPassword(PersonAccount account) {
		System.out.println("Enter new ATM pin number");
		int newPin = sc.nextInt();

		while (newPin == account.getPin() || (String.valueOf(newPin).length() < 4)) {

			if (newPin == account.getPin()) {
				System.out.println("Entered pin is same as old pin. Please use different pin");
			}
			if (String.valueOf(newPin).length() < 4) {
				System.out.println("Entered pin should have atleast 4 characters. Please try again!");
			}
			System.out.println("Enter new ATM pin number");
			newPin = sc.nextInt();

		}
		System.out.println("Updated pin is : " + newPin);

	}
}
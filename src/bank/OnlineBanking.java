package bank;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {

	public boolean validatepassword(PersonAccount account, String enteredPassword) {

		return account.getPassword().equals(enteredPassword);

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
		System.out.print("Enter new password: ");

		String newPassword = sc.next();

		if (newPassword.equals(account.getPassword())) {
			System.out.println("New password cannot be the same as the old password.");
			return;
		}

		if (newPassword.length() < 8) {
			System.out.println("Password must be at least 8 characters long.");
			return;
		}

		if (!newPassword.contains("&") && !newPassword.contains("$") && !newPassword.contains("@")) {
			System.out.println("Password must contain at least one of the following special characters: &, $, @.");
			return;
		} // logical operator not

		{
		System.out.println("updated password is:" +newPassword);
		}
	}

}

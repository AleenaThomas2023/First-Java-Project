package bank;

import java.util.Scanner;

public class MainBank {

	public static void main(String[] args) {
		double balance = 5000;
		int pin = 1234;
		String password = "Canada2023";
		Person thomasAccount = new Person("John Thomas", "1234567890", pin, password, balance);

		Scanner SC = new Scanner(System.in);

		System.out.println("Enter 1 for ATM, 2 for Online Banking: ");
		int choice = SC.nextInt();

		boolean validated = false;

		if (choice == 1) {
			System.out.print("Enter PIN: ");
			int enteredPin = SC.nextInt();
			validated = thomasAccount.validatePin(enteredPin);
		} else if (choice == 2) {
			System.out.print("Enter password: ");
			String enteredPassword = SC.next();
			validated = thomasAccount.validatePassword(enteredPassword);
		} else {
			System.out.println("Invalid choice!");
			SC.close();
			return;
		}
		if (!validated) {
			System.out.println("Invalid credentials!");
			SC.close();
			return;
		}

		BankOperations bank = null;

		if (choice == 1) {
			bank = new Atm(balance, pin);
		} else {
			bank = new OnlineBanking(balance, password);
		}

		System.out.println("Enter 1 for deposit, 2 for withdraw, 3 to change PIN/Password: ");
		choice = SC.nextInt();

		switch (choice) {
		case 1:
			System.out.print("Enter amount to deposit: ");
			double depositAmount = SC.nextDouble();
			bank.deposit(depositAmount);
			System.out.println("Deposit successful. New balance: " + bank.getBalance());
			break;

		case 2:
			System.out.print("Enter amount to withdraw: ");
			double withdrawAmount = SC.nextDouble();
			if (withdrawAmount > bank.getBalance()) {
				System.out.println("Insufficient balance!");
				break;
			}
			bank.withdraw(withdrawAmount);
			System.out.println("Withdrawal successful. New balance: " + bank.getBalance());
			break;
		case 3:
			bank.changePinPassword(SC);
			break;
		default:
			System.out.println("Invalid choice!");
			break;
		}

		SC.close();
	}
}

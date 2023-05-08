package bank;

import java.util.Scanner;

public class Atm extends BankOperations {
	private int pin;

	public Atm(double balance, int pin) {
		super(balance); // constructor
		this.pin = pin;
	}

	public boolean validatePin(int Pin) {

		return this.pin == Pin;

	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public void changePinPassword(Scanner sc) {
		System.out.print("Enter new PIN: ");
		int newPin = sc.nextInt();
		if (newPin == pin) {
			System.out.println("New PIN cannot be the same as the old PIN.");
			return;
		}

		if (newPin < 1000) {
			System.out.println("PIN must be at least 4 digits long.");
			return;
		}

		pin = newPin;
		System.out.println("PIN updated successfully.");
	}
}
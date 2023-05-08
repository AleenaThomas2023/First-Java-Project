package bank;

import java.util.Scanner;

public abstract class BankOperations {

	protected double balance; // current balance of the bank

	public BankOperations(double balance) {        //constructor
		this.balance = balance;

	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public abstract void changePinPassword(Scanner sc);
}

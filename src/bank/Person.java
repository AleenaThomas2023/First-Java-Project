package bank;

public class Person {

	private String nameOfAccountHolder;

	private int accountnumber;

	private int pin;

	private String password;

	private Double balance;
	BankOperations bank;

	public Person(String nameOfAccountHolder, int accountnumber, int pin, String password, double balance) {

		this.nameOfAccountHolder = nameOfAccountHolder;
		this.accountnumber = accountnumber;
		this.pin = pin;
		this.password = password;
		this.balance = balance;
		this.bank = new BankOperations(balance);
	}

	public String getNameOfAccountHolder() {
		return nameOfAccountHolder;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public int getPin() {
		return pin;
	}

	public String getPassword() {
		return password;
	}

	public boolean validatePin(int pin) {
		return this.pin == pin;

	}

	public boolean validatePassword(String Password) {

		return this.password.equals(Password);
	}

	public Double getBalance() {
		return bank.getBalance();
	}

	public void deposit(double amount) {
		bank.deposit(amount);
	}

	public void withdraw(double amount) {

		bank.withdraw(amount);
	}

}

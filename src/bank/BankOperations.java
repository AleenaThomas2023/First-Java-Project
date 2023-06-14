package bank;



public abstract class BankOperations {

	public void withdrawMoney(PersonAccount account, double moneyToBeWithdrawn) {

		if (moneyToBeWithdrawn < account.getBalance()) {
			System.out.println("Please collect your money : " + moneyToBeWithdrawn);

			account.setBalance(account.getBalance() - moneyToBeWithdrawn);

		} else {
			System.out.println("Sorry! insufficient balane");
		}

	}

	public void depositMoney(PersonAccount account, double moneytoBeDeposit) {
		double deposit = moneytoBeDeposit + account.getBalance();
		System.out.println("money has deposited: " + moneytoBeDeposit);
		account.setBalance(account.getBalance() + moneytoBeDeposit);
	}

	public void viewBalance(PersonAccount account) {
		System.out.println("The balance of the account : " + account.getBalance());
	}

	public abstract void changePinPassword(PersonAccount account);
}
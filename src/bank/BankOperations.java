package bank;

public class BankOperations {
	
private double balance;

public BankOperations(double balance) {
	
	this.balance = balance;
}

public double getBalance() {
	return balance;
}

public void deposit  (double amount)  {
	
	balance+=amount;
	}

public void withdraw(double amount)  { 
	
	
	balance-=amount;
}	
	
	

}

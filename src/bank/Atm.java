package bank;

public class Atm extends BankOperations {

	
	private int pin;

	public Atm(double balance, int pin) {
		super(balance);
		this.pin = pin;
	}
	
	public boolean validatePin(int pin)  {
	
		return this.pin==pin;
		
	}
	
	
	
	
	
	
}

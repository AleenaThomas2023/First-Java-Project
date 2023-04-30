package bank;

public class OnlineBanking extends BankOperations {
	
	private String password;

	public OnlineBanking(double balance, String password) {
		super(balance);
		this.password = password;
	}
	
	public boolean validatepassword(String password)  {
		
		return this.password.equals(password);
		
		
		}
	
	
	
	
	

}

package password;
import java.util.Scanner;
public class PASSWORDMATCH {
	
	String username="pivotAdmin";
	String password="Admin123";
	int counter;
	
	void findpasswordmatch()  {
		Scanner SC =new Scanner(System.in);	
	for (counter=1;
			counter<=3;
			counter++)	{
		
		System.out.println("please enter your username and password");
		
		username=SC.nextLine();
		password=SC.nextLine();
		
		if (username == password) {
			System.out.println("You are logged in to the application");
		
			break;
		}
	
		else {
		
		System.out.println("Incorrect User id or password.Try again");
		
		}
		while (counter > 3) {
			
		System.out.println("Account locked");	
		}
	}
}
	}
package forloopexample;

import java.util.Scanner;

public class ForLoop {
	
	// PIN should be locked if entered incorrectly 3 times

		int actualPIN = 1234;
		int enteredPIN;
		int withdrawAmount;
		int actualamount = 2000;
        
		
		
      Scanner sc = new Scanner(System.in);
    		  
			

		void checkPinIsCorrect() {
			for (
					int counter = 1; 
					counter <= 3; 
					counter++) 
			{
				System.out.println("Enter the PIN");
				enteredPIN = sc.nextInt();
				System.out.println("Enter the amount to be withdrawn:");
				withdrawAmount = sc.nextInt();
				
				if (actualPIN == enteredPIN &&
						actualamount > withdrawAmount) {
					System.out.println("Entered PIN is correct");
					System.out.println("Enter the amount to be withdrawn:");
					withdrawAmount = sc.nextInt();
					
					System.out.println("Cash withdrawn in amount of: "+withdrawAmount);
					break;
				} else {
					System.out.println("enterd PIN is incorrect");
				}
			}
		}

	}
	



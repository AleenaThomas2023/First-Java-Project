package bank;

import java.util.Scanner;

public class MainBank {
	public static void main(String[] args) {

		

		PersonAccount JohnAccount= new PersonAccount("John Thomas", "1234567890", 1234, "Canada2023", 5000);
		PersonAccount LovelyAccount= new PersonAccount("Lovely Thomas", "0987654321", 4321, "USA2023", 6000);
		PersonAccount JonasAccount= new PersonAccount("Jonas Baby", "1112223333", 5678, "Korea2023", 7000);
		PersonAccount EmilyAccount= new PersonAccount("EmilY Emily", "4445556666", 8765, "Japan2023", 8000);
		PersonAccount ThomasAccount= new PersonAccount("Thomas Thomas", "7778889999", 9876, "China2023", 9000);

		Scanner SC = new Scanner(System.in);

		System.out.println("Enter 1 for ATM, 2 for Online Banking: ");
		int choice = SC.nextInt();

		

		
	
		boolean validated = false;

		if (choice == 1) {
			System.out.print("Enter PIN: ");
			int enteredPin = SC.nextInt();
			validated =ThomasAccount.validatePin(ThomasAccount, enteredPin);
		} else if (choice == 2) {
			System.out.print("Enter password: ");
			String enteredPassword = SC.next();
			validated = ThomasAccount.validatepassword(ThomasAccount, enteredPassword);
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
			bank = new Atm();
		} else {
			bank = new OnlineBanking();
		}

		System.out.println("Enter 1 for deposit, 2 for withdraw, 3 to change PIN/Password: ");
		choice = SC.nextInt();

		switch (choice) {
		case 1:
			System.out.print("Enter amount to deposit: ");
			double depositAmount = SC.nextDouble();
			bank.depositMoney(ThomasAccount, 500);
			break;

		case 2:
			System.out.print("Enter amount to withdraw: ");
			double withdrawAmount = SC.nextDouble();
			bank.withdrawMoney(ThomasAccount, withdrawAmount);
				break;
			
			
		case 3:
			bank.changePinPassword(ThomasAccount);
			break;
		default:
			System.out.println("Invalid choice!");
			break;
		}

		SC.close();
	}
}
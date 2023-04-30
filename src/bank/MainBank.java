package bank;

import java.util.Scanner;

public class MainBank {

	public static void main(String[] args) {
		
		
		        Person Thomas = new Person("John Thomas", 1234567890,1234,"Canada2023",5000);

		        Scanner SC = new Scanner(System.in);

		        System.out.println("Enter 1 for ATM, 2 for Online Banking: ");
		        int choice = SC.nextInt();

		        boolean validated = false;

		        if (choice == 1) {
		            System.out.print("Enter PIN: ");
		            int pin = SC.nextInt();
		            validated = Thomas.validatePin(pin);
		        } else if (choice == 2) {
		            System.out.print("Enter password: ");
		            String password = SC.next();
		            validated = Thomas.validatePassword(password);
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

		        System.out.println("Enter 1 for deposit, 2 for withdraw: ");
		        choice = SC.nextInt();

		        switch (choice) {
		            case 1:
		                System.out.print("Enter amount to deposit: ");
		                double depositAmount = SC.nextDouble();
		                Thomas.deposit(depositAmount);
		                System.out.println("Deposit successful. New balance: " + Thomas.getBalance());
		                break;

		            case 2:
		                System.out.print("Enter amount to withdraw: ");
		                double withdrawAmount = SC.nextDouble();
		                Thomas.withdraw(withdrawAmount);
		                System.out.println("Withdrawal successful. New balance: " + Thomas.getBalance());
		                break;

		            default:
		                System.out.println("Invalid choice!");
		                break;
		        }

		        SC.close();
		    }
		}

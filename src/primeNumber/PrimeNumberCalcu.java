package primeNumber;
import java.util.Scanner;

public class PrimeNumberCalcu {

	int counter;
	
	Scanner SC = new Scanner(System.in);
	
	void findprimenumber()  {
		
	System.out.println("please enter a positive integer");
	
	int number=SC.nextInt();
	if (number > 0)  {
	for (counter =2;
		counter<= number-1;
		counter++)  {
		
if (number % counter==0)	
	
	break;

	}
	if (counter==number) {
		
	System.out.println("This is a prime number");
	}
	else {
		System.out.println("This is not a prime number");
		}
}
	}
}
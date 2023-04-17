package pizzaReturnmethod;

import java.util.Scanner;

public class MainPizzaReturnMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter the size of the pizza: S/M/L");
		String size = SC.nextLine();
		
		System.out.println("Do you want pepperoni? Y/N");
		String toppings = SC.nextLine();
		
		System.out.println("Do you want extra cheese? Y/N");
		String cheese = SC.nextLine();
		
		PizzashopReturnMethod PIZZA = new PizzashopReturnMethod();
		
		double total=PIZZA.calculatebill(size, toppings, cheese);{
			 
			 System.out.println("your bill is $ "+total);
			 
		 }
		
		
		
		
		
		
		
	}

}

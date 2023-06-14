package pizzaReturnmethod;

public class PizzashopReturnMethod {

	double price;
	

	
	double calculatebill (String size, String toppings, String cheese)  {
		
		
		
	if (size.equalsIgnoreCase("S"))	{
		
		price+=15;
	}
	if (size.equalsIgnoreCase("M")) {
		
		price+=20;
	}
	else {
		
		price+=25;
		
	}
		
	if (toppings.equalsIgnoreCase("Y")) {
		
		if (size.equalsIgnoreCase("S")) {
			
		price+=2;	
}   
	
else { 
	
	price+=3;
	
}
	
	}
	
	if (cheese.equalsIgnoreCase("Y")) {
		
		price+=1;
	}
	
	return price;
	
	
	
	}
	
	
	
	
	
}

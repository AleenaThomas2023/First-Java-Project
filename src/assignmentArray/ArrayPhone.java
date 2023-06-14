package assignmentArray;

import java.util.Scanner;

public class ArrayPhone {
	
	String [] Samsungphones= {"S20","S21","Flip3","Fold3"};
	
	String [] Googlephones= {"Google Pixel 6","Google Pixel 6 Pro","Google Pixel Pro","Google  Pixel 5"};
	
	String[] Applephones= {"Iphone12","Iphone 12 mini","Iphone 11","Iphone 13"};
	
	 Scanner SC = new Scanner(System.in);
	
	void findphonename()  {
		
		
		
		
		System.out.println("Enter phone brandname from the list above: " );
	    String	brandname = SC.nextLine();
	    System.out.println("The available for products for "+brandname+ " :");
	    if (brandname.equalsIgnoreCase("Samsung")){
	    for (String phones:Samsungphones) {
	    	
	    	System.out.println(phones);
	   }
	    		
	    } 
	    
	    else if  		
	    		
	     (brandname.equalsIgnoreCase("Google")){
		    for (String phones:Googlephones) {
		    	
		    	System.out.println(phones);
		   }
		    		
		    } 		
			
	    else if  		
		
	     (brandname.equalsIgnoreCase("Apple")){
		    for (String phones:Applephones) {
		    	
		    	System.out.println(phones);
		   }
		    		
		    } 			
	    else {
	    	
	    	System.out.println("Please select a phone from the list");
	    }	
		
	}
	
	
	
	
	
	
	

}

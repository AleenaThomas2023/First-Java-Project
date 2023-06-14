package cellPhone;

import java.util.Scanner;

public class CellPhoneSelection {
Scanner SC= new Scanner(System.in);
	
String selectModel (String brand)   {	

String model= " ";

if (brand.equalsIgnoreCase("Samsung")) {
    System.out.println("S22,S22+,S22 Ultra,S22FE");
    System.out.print("Select your model: ");
    model = SC.nextLine();
}else if (brand.equalsIgnoreCase("Apple")) {
	
	System.out.println("IPhone14,IPhone14 pro,IPhone14 pro max,IPhone14 mini");

   System.out.println("Select your model: ");
  
   model = SC.nextLine();
}
return model;
}		  
	
String selectPlan()  {
	System.out.println("Rogers,Bell,Telus");
	
	System.out.println("Select your plan: ");
		
	return SC.nextLine();	
	}	  
double findtabprice(String model)  {
	
double tabprice	= 0.0;
if(model.equalsIgnoreCase("S22")) {
	
	tabprice=25;
}else if (model.equalsIgnoreCase("S22+")) {
	tabprice=35;
}else if (model.equalsIgnoreCase("S22 Ultra")) {
	tabprice=55;
}else if (model.equalsIgnoreCase("S22FE")) {
	tabprice=20;
}else if (model.equalsIgnoreCase("IPhone14")) {
	tabprice=30;
	
}else if (model.equalsIgnoreCase("IPhone14 pro")) {
	tabprice=40;
}else if (model.equalsIgnoreCase("IPhone14 max")) {
	tabprice=65;
}else if (model.equalsIgnoreCase("IPhone14 mini")) {
	tabprice=25;
	
}
return tabprice;
}		  
double getmonthlyplanprice(String plan)  {
double monthlyplanprice=0.0;
if (plan.equalsIgnoreCase("Rogers")) {
	monthlyplanprice=70;
}else if (plan.equalsIgnoreCase("Bell")) {
	monthlyplanprice=80;
}else if (plan.equalsIgnoreCase("Telus")) {
	monthlyplanprice=75;
}
return 	monthlyplanprice;
}		  
	  

}

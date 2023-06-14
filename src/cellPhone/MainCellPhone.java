package cellPhone;

import java.util.Scanner;

public class MainCellPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	CellPhoneSelection cellphone = new CellPhoneSelection ();
	Scanner SC = new Scanner(System.in)	;
	System.out.println("please enter the brand name: Samsung /Apple");
	
	String brand = SC.nextLine();
	System.out.println("please enter the model from below; ");
	
	String model = cellphone.selectModel(brand);
	System.out.println("Please select the plan from below");
	String plan = cellphone.selectPlan();
	double tabprice = cellphone.findtabprice(model);
	double monthlyplanprice = cellphone.getmonthlyplanprice(plan);
	double totalmonthlyprice =  tabprice+monthlyplanprice;
	
	System.out.println("You have selected " + model + " with " + plan + " Plan.");
	System.out.println("Your phone tab will be : $" +tabprice);
	System.out.println("Your monthly plan will be : $" +monthlyplanprice );
	System.out.println("Total monthly amount : $" +totalmonthlyprice );
	}

	

}

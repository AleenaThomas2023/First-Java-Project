package calculator;

public class CALCULATOR {

	
	int num1;
	int num2;
	int function;
	
	
	void functionsofcalculator()  {

		
	if (function == '^' ) {
		
int cube=num1*num2;

System.out.println("square is" + cube);
	}

	else if (function == '+') {
int sum =num1+num2;
System.out.println("sum is"+sum);		
}
	else if ( function == '-')  {
	int difference= num1-num2;
	
	System.out.println("difference is "+difference);	
	}
	else if (function == '*')  {
		
		int multiply= num1*num2;
		System.out.println("multiply is" + multiply);	
		
	
	}

	else {
		System.out.println("invalid operation");	
		
		
}
	}


}



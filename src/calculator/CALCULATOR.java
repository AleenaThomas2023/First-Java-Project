package calculator;

public class CALCULATOR {

	
	int num1;
	int num2;
	void sumOfNumbers() {
		int sum = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
	}

	void differenceOfNumbers() {
		int difference = num1 - num2;
		System.out.println("Difference of " + num1 + " and " + num2 + " is " + difference);
	}

	void productOFNumbers() {
		int product = num1 * num2;
		System.out.println("Product of " + num1 + " and " + num2 + " is " + product);
	}

	void divisionOfNumbers() {
		int quotient = num1 / num2;
		System.out.println("Quotient of " + num1 + " and " + num2 + " is " + quotient);
		int remainder = num1 % num2;
		System.out.println("Remainder of the division operation of " + num1 + " and " + num2 + " is " + remainder);
	}

 void squareofnumber()  {
	 double square = num1*num1;
	 
	 System.out.println("value is:" +square );
	 }
	 
	 void cubeofnumber()  {
	double cube = num1*num1*num1;
	
	System.out.println("value is:"+cube);
	}
	


	 
 }

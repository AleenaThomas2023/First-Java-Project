package learnoperators;

public class Arithmeticoperators {

	int num1;
	int num2;
	
	void divisionofnumber()  {
		int quotient = num1 / num2;
		System.out.println("Quotient of " + num1 + " and " + num2 + " is " + quotient);
	}
	void remainderofnumber()  {
	int remainder = num1 % num2;
	System.out.println("Remainder of the division operation of " + num1 + " and " + num2 + " is " + remainder);
	}
	
	int a = 2 - - 7;
	void differenceofnumber()  {
		
		//a = 2--7
				
				
	System.out.println(a);
	
	}
	
	double A  = 25.64;
	int B = 25;
	
void percentageofnumber()  {
	A = A % 10;
	B = B % 10;
System.out.println(A + " " + B);

	}

int  r = 5, b = 10, c = 15 ,d = 50;
void eqaltonumber()  {
	
r -= 3;
b *= 2;
c /= 5;
d %=3;

System.out.println(r +" " + b + " " + c);
}

int number= 5;

void squreofnumber()  {
	
	//number=5*5
	System.out.println(number*number);
}


}



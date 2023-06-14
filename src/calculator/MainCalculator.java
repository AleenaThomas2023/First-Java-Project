package calculator;

public class MainCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	CALCULATOR function = new CALCULATOR();
	
	function.num1=5;
	function.num2=2;
	switch ("cube") {
	case "add":
	
	function.sumOfNumbers();
		break;
	case "subtract":
		function.differenceOfNumbers();
		break;
	case "multiply":
		function.productOFNumbers();
		break;
	case "divide":
		function.divisionOfNumbers();
		break;
	case "square":
	
	function.squareofnumber();
		
	break;
	case "cube":
	
	function.cubeofnumber();
	
	break;
	default:
		System.out.println("invalid operation");
		
		break;
	}

}
	}

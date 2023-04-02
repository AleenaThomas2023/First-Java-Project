package waterTank;

public class WaterTankCapacity {

	int bucketcapacity =10;
	int maximumcapacity;
	int counter;

	
	
	void findwatercapacity()  {
		
		for (counter=1;
			
			counter<=10;
			
			counter++) {
			
			System.out.println("Enter capacity" );
	
		if (maximumcapacity<100) {
			System.out.println("fill more water");
		}
			
		else if (maximumcapacity==100)   {
			System.out.println("maximum capacity of a tank reached ");
			
		break;	
			 }
		
	else 
		System.out.println("tank is overflow");	
	}
	


	}
	
	
}
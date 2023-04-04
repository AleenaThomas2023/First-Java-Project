package waterTank;

public class WaterTankCapacity {

	int bucketcapacity =10;
	int maximumcapacity=100;
	int currentlevel=5;
	void watertanklevel()  {
	
	while (currentlevel <= 90)  {
		
System.out.println("water level is:"+currentlevel);
	}
	
	
	
	if (currentlevel > 90 && currentlevel < 100) {
		
		int maxlevel  =(maximumcapacity-currentlevel )+currentlevel;
	System.out.println("water level is rached max"+maxlevel);
		
	}
	currentlevel+=10;
	if (currentlevel>100) {
	
		System.out.println("tank will overflow");	
	}
	
	
}
	
}
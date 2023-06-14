package FirstPackage;

public class refrigerator {
	
String brandname;
int dimension;
String doortype;
String color;
String installationtype;
boolean isSmartFeatureAvailable;
boolean isIceMakerAvailable;

void keepfoodcold ()  {
	System.out.println ("keep food cold from"+ brandname + "refrigerator");
}

void keepfoodstayfresh ()  {
	 System.out.println ("keep food stay fresh  from"+ brandname + "refrigerator");
	}
void keepfoodlongtime ()  {
	 System.out.println ("keep food long time from"+ brandname + "refrigerator");
	}


void makingice ()  {
	 System.out.println ("ice can be make if IceMaker is available. Icemaker is avilable:"+ isIceMakerAvailable);
	}

void workswithAlexa ()  {
	 System.out.println ("Alexa can be works if smart feature is available. smart feature is avilable:"+ isSmartFeatureAvailable);
}
}




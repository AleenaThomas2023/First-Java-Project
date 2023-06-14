package stringArrayAssignment;

import java.util.Arrays;

public class StringArray {

	String [] cityArray = {"Toronto","Ottawa","Brampton","Hamilton","London","Mississauga","Burlington","Kingston","Kitchener"};
	
	
	boolean searchcityname(String cityName)  {
			
	for(String city:cityArray){
	if (city.equalsIgnoreCase(cityName))	{
		return true;
	}	
	}return false;
	}
	
void findnameendswithton()  {
		
		for (String city:cityArray) {
		if (city.toLowerCase().endsWith("ton"))	{
			
		System.out.println(city);	
		}
	}
		
	}
void replacetonwithfun()  {
	for(int i = 0; i < cityArray.length; i++)  {
		if (cityArray[i].toLowerCase().endsWith("ton")) {
			
			cityArray[i] = cityArray[i].replace("ton", "fun");	
		}
		
	}
	System.out.println(Arrays.toString(cityArray));
}

void extractstreetaddress()  {
	String fulladdress = "100 queen street,Toronto,M5V 3E3";
	String[] parts = fulladdress.split(",");

	String streetAddress = parts[0];
	String city = parts[1];
	String zip = parts[2];

	System.out.println("Street Address: " + streetAddress);
	System.out.println("City: " + city);
	System.out.println("Zip: " + zip);
}


}


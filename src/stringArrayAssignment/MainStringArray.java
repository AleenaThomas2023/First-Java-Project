package stringArrayAssignment;

import java.util.Arrays;

public class MainStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 StringArray differentcities =  new StringArray();
		boolean iscitynamefound= differentcities.searchcityname("Brampton");
		System.out.println(iscitynamefound);
		 differentcities.findnameendswithton();
		 differentcities.replacetonwithfun();
		differentcities.extractstreetaddress();
		
	}

}

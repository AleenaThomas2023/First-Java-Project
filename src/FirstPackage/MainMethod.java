package FirstPackage;

public class MainMethod {

	public static void main(String[] args) {
	refrigerator LG= new refrigerator();
	LG.brandname = "LG";
	LG.dimension = 32;
	LG.doortype = "french door";
	LG.color ="Stainlesssteel";
	LG.installationtype ="free standing";
	LG.isSmartFeatureAvailable =true;
	LG.isIceMakerAvailable =true;
	LG.keepfoodcold();
	LG.keepfoodlongtime();
	LG.keepfoodstayfresh();
	LG.makingice();
	LG.workswithAlexa();
			
	

	}
 
}

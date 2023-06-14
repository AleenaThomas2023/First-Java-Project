package crsScore;

import java.util.Scanner;

public class MainCrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc= new Scanner(System.in);
		CRSCalculation CRS = new CRSCalculation();
		int educationscore = CRS.geteducationscore();
		int experiencescore= CRS.getExperienceScore();
		int agescore=CRS.getAgeScore();
		System.out.println("Enter your IELTS Score for Listening:");
        double listeningScore = Sc.nextDouble();
        System.out.println("Enter your IELTS Score for Speaking:");
        double speakingScore = Sc.nextDouble();
        System.out.println("Enter your IELTS Score for Reading:");
        double readingScore = Sc.nextDouble();
        System.out.println("Enter your IELTS Score for Writing:");
        double writingScore = Sc.nextDouble();
		int ieltsscore=CRS.getIELTSScore(listeningScore, speakingScore, readingScore, writingScore);
		System.out.println("If you have a relative  in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian Citizen or PR holder (Y/N)");
		boolean hasRelativeInCanada=Sc.nextBoolean();
		System.out.println("Have you studied in Canada for atleast 2 years (Y/N)");
		boolean hasStudiedInCanada=Sc.nextBoolean();
		System.out.println("Have you worked in Canada for atleast 2 years at NOC 0, A, B (Y/N)");
		boolean hasWorkedInCanada=Sc.nextBoolean();
		int adaptabilityscore=CRS.getAdaptabilityPoints(hasRelativeInCanada, hasStudiedInCanada, hasWorkedInCanada);
	
	int totalscore = (educationscore+experiencescore+agescore+ieltsscore+adaptabilityscore);
	
	System.out.println("Total Points you have scored: " + totalscore + " Points");
    if (totalscore >= 67) {
        System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada");
    } else {
        System.out.println("You do not qualify to submit an Expression of Interest (EOI) to Immigration Canada");
    }
	}

}

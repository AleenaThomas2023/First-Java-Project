package crsScore;

import java.util.Scanner;

public class CRSCalculation {

Scanner SC = new Scanner(System.in)	;
	int geteducationscore()  {
	System.out.println("Enter your educationlevel: ");	
	String educationlevel=SC.nextLine();
	
	int score;
	
	switch (educationlevel.toLowerCase()){
	case "phd":
	  score =25;
	  break;
	case "master's":
       score = 23;
       break;
	case "two or more university degrees/diplomas at the bachelor’s level one of which is a three year or longer duration":
        score = 22;
        break;
    case "12th+ three years or longer degree /diploma":
        score = 21;
        break;
    default:
        score = 0;
        break;
	}
		System.out.println("score for education: " + score);
		
		return score;
	}
	int getExperienceScore()  {
	System.out.println("Enter your Experience in years: ");	
	int experience=SC.nextInt();
	int score;
	if (experience>=6) {
		
		score=15;
	}else if (experience >= 4) {
		
		score = 13;
	}else {
		score = 0;	
	}
	System.out.println("Score for Experience: " + score);
	return score;
		
	}
int getAgeScore()  {
System.out.println("Enter your age in years: ");
int age=SC.nextInt();
int score;
if (age >= 18 && age <= 35) {
    score = 12;
    
} else if (age == 36) {
    
	score = 11;
    
} else if (age == 37) {
    score = 10;
    
} else if (age == 38) {
    
	score = 9;
    
} else if (age == 39) {
    
	score = 8;
    
} else if (age == 40) {
    
	score = 7;
    
} else if (age == 41) {
    score = 6;
    
} else if (age == 42) {
    
	score = 5;
} else if (age == 43) {
   
	score = 4;
    
} else if (age == 44) {
    
	score = 3;
    
} else if (age == 45) {
    score = 2;
    
} else if (age == 46) {
    
	score = 1;
    
} else {
    
	score = 0;
}
System.out.println("Score for Age: " + score);
return score;

}
int getIELTSScore(double listeningScore, double speakingScore, double readingScore, double writingScore) {

int ieltsPoints = 0;
    if (listeningScore >= 8) {
        ieltsPoints += 6;
        
    } else if (listeningScore >= 7.5) {
        ieltsPoints += 5;
        
    }
    if (speakingScore >= 8) {
        ieltsPoints += 6;
        
    } else if (speakingScore >= 7) {
        ieltsPoints += 5;
        
    }
    if (readingScore >= 8) {
        ieltsPoints += 6;
        
    } else if (readingScore >= 7.5) {
        ieltsPoints += 5;
    }
    if (writingScore >= 8) {
        ieltsPoints += 6;
        
    } else if (writingScore >= 7.5) {
        ieltsPoints += 5;
    }
    return ieltsPoints;
}


 int getAdaptabilityPoints(boolean hasRelativeInCanada, boolean hasStudiedInCanada, boolean hasWorkedInCanada) {
    int adaptabilityPoints = 0;
    if (hasRelativeInCanada) {
        adaptabilityPoints += 5;
    }
    if (hasStudiedInCanada) {
        adaptabilityPoints += 5;
    }
    if (hasWorkedInCanada) {
        adaptabilityPoints += 10;

}


return adaptabilityPoints;


}









































}

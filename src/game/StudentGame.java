package game;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class StudentGame {

String [] studentsArray= {"Aleena","Angel", "Asha", "Clemin", "Gopesh", "Hamneet", "Jimna", "Jobin", "Jude", "Kamaldeep", "Manpreet K", "Manpreets", "Mariya", "Namitha", "Neelam", "Nisha", "Parminder", "Rajat", "Rojy", "Sojan",
                          "Suchitra", "Vinduja"};
	
private static final int Maxwrongcases = 5;
private String chosenStudent;
private Set<Character> correctGusses;
private Set<Character> wrongGusses;

public void play() {

// Choose a random student name

	Random random = new Random();

	chosenStudent = studentsArray[random.nextInt(studentsArray.length)];

//Initialize the sets for correct and wrong guesses

	correctGusses = new HashSet<>();
	wrongGusses = new HashSet<>();

//Play the game

	Scanner sc = new Scanner(System.in);

	while (true) {
// print current status

		System.out.println("You are guessing:");
		printStudentName();
		System.out.println("You have guessed(" + wrongGusses.size() + ") wrong letters: " + wrongGusses);

		System.out.println("Guess a letter: ");

//Get user input
		char guess = sc.nextLine().charAt(0);

//check if the guess is correct
		if (chosenStudent.indexOf(guess) != -1) {
			correctGusses.add(guess);
			System.out.println("Good guess");

			if (checkWin()) {
				System.out.println("You Win!");

				System.out.println("You have guessed" + chosenStudent + "correctly");

				return;
			}
		} else {

			wrongGusses.add(guess);
			System.out.println("sorry, wrong guess!");
			if (wrongGusses.size() >= Maxwrongcases) {
				System.out.println("Game over!");
				System.out.println("The student was   "+ chosenStudent + ".");
				return;
			}
		}
	}

}

private void printStudentName() {
	
	for(char name:chosenStudent.toCharArray())	{
		if (correctGusses.contains(name)) {
			System.out.println(name);
			
		}else {
			System.out.println("-");
		}
}

System.out.println();
}
private boolean checkWin() {
	for(char name:chosenStudent.toCharArray()) {
		if (!correctGusses.contains(name))	{
			return false;	
		}
	}

return true;
	
	
}




	
	











}

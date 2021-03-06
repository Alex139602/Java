package ex1;

public class Quiz {
	
	static boolean working = true;
	static boolean running = true;
	
	
	public static void main(String[] args){
		
		switchReturnQuiz();
		
	} // end of main
	
	public static int citiesQuiz() {
		int score = 0;
		
		String[] countries = new String[]{"France?","England?", "Holland?", "Germany?", "Sweden?" };
		String[] cities = new String[]{"Paris", "London", "Amsterdam", "Berlin", "Stockholm" };
		String[] question = new String[countries.length];
		
		for (int i = 0; i < question.length; i++) {
			question[i] = "What is the capital of " + countries[i];
		}
		String userInput;
		for (int i = 0; i < question.length; i++) {
			userInput = Utilities.getInput(question[i]);
			if (userInput.equalsIgnoreCase(cities[i])) {
				score++;
			}
		}
		
		Utilities.showMsg("Your score is: \n" + score + " out of " + 5);
		
		return score;
	}
	
	public static int mathQuiz() {
		int score = 0;
		String[] mathsQuestions = new String[]{"what is 9 x 4 ?","what is 12 x 3 ?", "what is 16 + 62 - 42 ?", "what is 180 / 5 ?", "what is the cube root of 35937 ?" };
		String[] mathsAnswers = new String[]{"36", "36", "36", "36", "33" };
		String userInput;
		for (int i = 0; i < mathsQuestions.length; i++) {
			userInput = Utilities.getInput(mathsQuestions[i]);
			if (userInput.equalsIgnoreCase(mathsAnswers[i])) {
				score++;
			}
		}
		Utilities.showMsg("Your score is: \n" + score + " out of " + 5);
		return score;
	}
	
	public static int generalQuiz() {
		String[] questions = new String[]{"Which Greek god is the equivalent of the roman god Jupiter?", 
											"Which country produces the most coffee per year?", "What age did michael jackson die at (as a number)?",
											"How many holes are there in a ten pin bowling ball (as a number)?", "All polar bears are left handed. True or False" };
		String[] answers = new String[]{"Zeus", "Brazil", "50", "3", "true"};
		int score = 0;
		
		String userInput;
		for (int i = 0; i < answers.length; i++) {
			userInput = Utilities.getInput(questions[i]);
			if (userInput.equalsIgnoreCase(answers[i])) {
				score++;
			}
		}
		Utilities.showMsg("Your score is: \n" + score + " out of " + 5);
		return score;
	}
	
	public static int languageQuiz() {
		String[] capital = new String[]{"France?","England?", "Holland?", "Japan?", "Morocco?" };
		String[] cities = new String[]{"French", "English", "Dutch", "Japanese", "Arabic" };
		String[] question = new String[cities.length];
		int score = 0;
		for (int i = 0; i < question.length; i++) {
			question[i] = "What is the most spoken language in " + capital[i];
		}
		String userInput;
		for (int i = 0; i < capital.length; i++) {
			userInput = Utilities.getInput(question[i]);
			if (userInput.equalsIgnoreCase(cities[i])) {
				score++;
			}
		}
		Utilities.showMsg("Your score is: \n" + score + " out of " + 5);
		return score;
	}
	
	
	
	public static void switchReturnQuiz(){
		int val = Utilities.showOption("Please Choose a Quiz", "", "Capital Cities Quiz", "Maths Quiz", "General Knowledge Quiz", "Spoken Languages Quiz", "I dont want any of these");
		switch(val) {
			case 0:
				citiesQuiz(); chooseExitApp();
				break;
			case 1:
				mathQuiz(); chooseExitApp();
				break;
			case 2:
				generalQuiz(); chooseExitApp();
				break;
			case 3:
				languageQuiz(); chooseExitApp();
				break;
			case 4:	
				exitApp();
				break;
			default:
				exitApp();
				break;
			
		}
			
	}


	public static void chooseExitApp() {
		int choice = Utilities.showOption("Continue?", "Do you want to try another quiz?", "YES", "NO");
		if ( choice == 1 ) {
			working = false;
			exitApp();
		} else {
			switchReturnQuiz();
		}
	}
	
	private static void exitApp() {
		working = false;
		System.exit(0);
	}
	
} // end of class

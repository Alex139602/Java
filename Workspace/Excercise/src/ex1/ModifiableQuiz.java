package ex1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ModifiableQuiz {

	static String filepath1 = "C:/Games/CapitalQuestions.txt";
	static String filepath2 = "C:/Games/CapitalAnswers.txt";
	
	public static void main(String... args) throws IOException{
		String[] sA = Utilities.readLinesFromFilesAsArray(filepath1, Utilities.getLineCount(filepath1));
		String[] sB = Utilities.readLinesFromFilesAsArray(filepath2, Utilities.getLineCount(filepath2));
		
		System.out.println(Arrays.toString(sA));
		
		genericQuizBuilder(sA, Utilities.getLineCount(filepath1), sB , Utilities.getLineCount(filepath2));
	 }
	
	public static void genericQuizBuilder(String[] fileQuestions, int numLinesQuestions, String[] fileAnswers, int numLinesAnswrs) throws FileNotFoundException, IOException{
		int score = 0;
		String userInput;
		
		for (int i = 0; i < fileQuestions.length; i++) {
			userInput = Utilities.getInput(fileQuestions[i]);
			if (userInput.equalsIgnoreCase(fileAnswers[i])) {
				score++;
			}
		}
		
		Utilities.showMsg("Your score is: \n" + score + " out of " + fileAnswers.length);
		rerunQuiz();
	}
	
	private static void rerunQuiz() throws FileNotFoundException, IOException{
		int choice = Utilities.showOption("Continue?", "Do you want to try this quiz again?", "YES", "NO");
		if ( choice == 1 ) {
			System.exit(0);
		} else {

			String[] sA = Utilities.readLinesFromFilesAsArray(filepath1, Utilities.getLineCount(filepath1));
			String[] sB = Utilities.readLinesFromFilesAsArray(filepath2, Utilities.getLineCount(filepath2));
			
			genericQuizBuilder(sA, Utilities.getLineCount(filepath1), sB , Utilities.getLineCount(filepath2));
		}
	}

	
}

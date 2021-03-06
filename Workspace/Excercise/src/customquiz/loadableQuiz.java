package customquiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import javax.rmi.CORBA.Util;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import ex1.Utilities;

public class loadableQuiz {
	
	public static final String questionDir = "C:/Users/Alexander/Dropbox/other/Code Snippets/Java Work/Misc files/qs.txt";
	public static final String answerFile = "C:/Users/Alexander/Dropbox/other/Code Snippets/Java Work/Misc files/ans.txt";
	
	public static void main(String[] args) throws IOException {
		
		//System.out.println(Files.isWritable(FileSystems.getDefault().getPath(getFileDirectory(), "ans.txt")));
		int nq = getNumberOfQuestions();
		writeArrayToFile(returnArrayOfQuestions(nq), "test");
		
		
		returnArrayOfAnswers(nq);
		//writeArrayToFile(returnArrayOfQuestions());
		//writeArrayToFile(returnArrayOfAnswers());
		
	}

	public static void runLoadableQuiz() {
		int val = Utilities.showOption("Please Choose a Quiz", "", "Exit Programme", "Capitals Quiz" );
		switch(val) {
			case 0:
				chooseExitApp();
				break;
			case 1:
				runLoadableQuiz(); chooseExitApp();
				break;
			default:
				chooseExitApp();
				break;
		}
		
	}

	private static String getListOfQuizzes() {
		String listOfQuizzes = "";
		
		//TODO: get list of quizzes from the correct dir
		
		return listOfQuizzes ;
	}

	public static void chooseExitApp() {
		int choice = Utilities.showOption("Continue?", "Do you want to start again?", "YES", "NO");
		if ( choice == 1) {
			System.exit(0);
		} else {
			runLoadableQuiz();
		}
	}	

	public static void buildCustomQuiz(String fileQstns, String fileAnswers) throws IOException {
		
		
	}
	
	private static void writeToFile(String filePath, String inputText) throws IOException {
		try {
			String data = inputText;
			File file = new File(filePath);
			
			if (!file.exists()){
				file.createNewFile();
			} else {
				System.out.println("file already exitsts");
			}
			String path = file.getAbsolutePath();
			System.out.println(path);
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(data);
			bufferedWriter.close();
			System.out.println("done");
			
		} catch ( IOException e ) {
			e.printStackTrace();
		}
		
	}
	

	public static String[] readLinesFromFilesAsArray(String filePath, int numOfLines ) throws IOException{
		 String[] Array = new String[numOfLines];
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		String text = "";
		try {
			String line = br.readLine();
			for (int i = 0; i < numOfLines; i++) {
				text = text + line + "\n";
				Array[i] = line;
				line = br.readLine();
			}
				
		} catch(IOException e){
				e.printStackTrace();
		} finally {
				br.close();
		}
		System.out.println(text);
		return Array;
	}
	
	public static int getLineCount(String filePath) throws FileNotFoundException, IOException {
		int lineCount = 0;
		FileReader fr = new FileReader(filePath);
		LineNumberReader lnr = new LineNumberReader(fr);
		try {
			lnr.skip(Long.MAX_VALUE);
			lineCount += lnr.getLineNumber() + 1;
		} catch( IOException ex ) {
			ex.printStackTrace();
		} finally {
			lnr.close();
		}
		return lineCount;
	}
	
	public static Integer getNumberOfQuestions() throws NumberFormatException {
		String rtrn = Utilities.getInput("How many questions/answers does your quiz have? (as a number, not words)");
		try{
			return Integer.parseInt(rtrn);
		} catch( NumberFormatException ne){
			ne.printStackTrace();
			return -1;
		}
		
	}
	
	public static String getFilePath() {
		String filePath = "";
		JFileChooser fileDialog = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
		fileDialog.setFileFilter(filter);
		int returnVal = fileDialog.showOpenDialog(fileDialog);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			filePath = fileDialog.getSelectedFile().getAbsolutePath().replace("\\", "/");
		}
		return filePath;		
	}
	
	public static File getFile() {
		File filePath = null;
		JFileChooser fileDialog = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
		fileDialog.setFileFilter(filter);
		int returnVal = fileDialog.showOpenDialog(fileDialog);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			filePath = fileDialog.getSelectedFile();
		}
		return filePath;		
	}
	
	public static String getFileDirectory() {
		String fileDir = null;
		JFileChooser fileDialog = new JFileChooser();
		fileDialog.setDialogTitle("Please choose a file directory");
		fileDialog.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		fileDialog.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
		int choice = fileDialog.showOpenDialog(fileDialog);
		if (choice == JFileChooser.APPROVE_OPTION) {
			fileDir = fileDialog.getCurrentDirectory().getAbsolutePath().replace("\\", "/");
		} else { System.exit(0); } 
		System.out.println(fileDir);
		return fileDir;		
	}
	public static String[] returnArrayOfQuestions(int numQs) {
		String[] Array = new String[numQs];
		for (int i = 0; i < Array.length; i++) {
			Array[i] = Utilities.getInput("Please input question " + (i+1)).toString();
		}
		return Array;
	}
	
	public static String[] returnArrayOfAnswers(int numQs) {
		String[] Array = new String[numQs];
		for (int i = 0; i < Array.length; i++) {
			Array[i] = Utilities.getInput("Please input answer " + (i+1)).toString();
		}
		return Array;
	}
	
	private static void writeLinesToFile(String filePath, String inputText) throws IOException {
		try {
			String data = inputText;
			File file = new File(filePath);
			
			if (!file.exists()){
				file.createNewFile();
			} else {
				System.out.println("file already exists, none created");
			}
			
			String path = file.getAbsolutePath();
			System.out.println(path);
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(data);
			bufferedWriter.close();
			System.out.println("done");
			
		} catch ( IOException e ) {
			e.printStackTrace();
		}
		
	}
	
	public static void writeArrayToFile(String[] Arr, String fileName) throws IOException {
		try {
			File file = new File(getFileDirectory() + "/" + fileName  + ".txt");
			System.out.println(file.canWrite());
			if (file.isDirectory() || !file.exists()){
				file.createNewFile();
			} else {
				System.out.println("file already exists, none created");
			}

			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			for (int i = 0; i < Arr.length; i++) {
				bufferedWriter.write(Arr[i] + "\r\n");
			}
			bufferedWriter.close();
		} catch ( IOException e ) {
			e.printStackTrace();
		} 
		
	}
		 
	

} // end of class

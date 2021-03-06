

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NewLogFile {
	
	public static final String sourceFileLocation = "/Users/administrator/Dropbox/other/Code Snippets/Java Work/Java_OO/createaccounts.txt";
	public static final String targetFileLocation = "/Users/administrator/Dropbox/other/Code Snippets/Java Work/Java_OO/outputWarnings.txt";

	public static void main(String[] args) {
		
	} // end of main

	public static boolean copy(String sourceFile, String destinationFile) {

		BufferedReader bufferedReader = null;
			
		
		try {
			bufferedReader = new BufferedReader(new FileReader(sourceFile));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		

		BufferedWriter bufferedWriter;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(destinationFile));
			String line = "";
			try {
				while ((line = bufferedReader.readLine()) != null) {
					bufferedWriter.write(line + "\n");
				}
				// SQL code
			} catch (IOException e) {
				e.printStackTrace();
			}
			bufferedReader.close();
			bufferedWriter.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	} 
	
	
	
	public static boolean writeToLogFile(String msg, String destinationFile) { // appends msg to file specified
		FileWriter fileWriter;
		BufferedWriter bufferedWriter;
		try {
			fileWriter = new FileWriter(destinationFile, true); // the boolean here allows appending to a file instead of overwriting
			bufferedWriter = new BufferedWriter( fileWriter );
			try {
				bufferedWriter.write( msg + System.getProperty("line.separator") );
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				bufferedWriter.close();
				fileWriter.close();
			}
			
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	} 
	
	
	
	
	
	
} // end of class

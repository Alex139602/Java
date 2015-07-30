package money;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	
	public static final String sourceFileLocation = "/Users/administrator/Dropbox/other/Code Snippets/Java Work/Java_OO/createaccounts.txt";
	public static final String targetFileLocation = "/Users/administrator/Dropbox/other/Code Snippets/Java Work/Java_OO/outputWarnings.txt";

	public static void main(String[] args) {
		
		copy(sourceFileLocation, targetFileLocation);
	} // end of main

	public static boolean copy(String sourceFile, String destinationFile) {

		BufferedReader bufferedReader = null;
			
		
		try {
			bufferedReader = new BufferedReader(new FileReader(sourceFile));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
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
				// TODO Auto-generated catch block
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
	public static boolean writeMessageToFile(String msg, String destinationFile) {

		BufferedWriter bufferedWriter;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(destinationFile));
			try {
				bufferedWriter.write(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
			bufferedWriter.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	} 
	
	
	public static Account[] calculateAccountDetails(String sourceFile, String destinationFile) {
		Account[] accountArray = null;
		BufferedReader bufferedReader = null;
		int numLines = 0;
		try {
			bufferedReader = new BufferedReader(new FileReader(sourceFile));
			try {
				String line = "";
				while ((line = bufferedReader.readLine()) != null) {
					System.out.println(line);
					//String accName = getTextLeft(line, ',');
					//double accBalance = getTextRight(line, ',');
					numLines++;
					System.out.println(line.indexOf(','));
					
				}
				/*
				accountArray = new Account[numLines];
				for (int i = 0; i < accountArray.length; i++) {
					// TODO
				}*/
				System.out.println(numLines);
				
				
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			
		}
		
		return accountArray;
		
	}
	
	
	
	@SuppressWarnings("unused")
	private static double getTextRight(String line, char c) {
		double accBalance =  0.0;
		
		
		
		return accBalance;
	}


	@SuppressWarnings("unused")
	public static String getTextLeft(String line, char c){
		
		
		
		
		
		
		
		
		
		return line;
	}
} // end of class
package money;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		String sourceFileLocation = "C:\\TestFiles\\sourceFile.txt";
		String targetFileLocation = "C:\\TestFiles\\targetFile.txt";
		copy(sourceFileLocation, targetFileLocation);
	}

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
}

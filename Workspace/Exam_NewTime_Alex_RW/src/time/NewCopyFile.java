package time;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class NewCopyFile {
	
	public static String macSourceFileLocationExample = "/Users/administrator/Dropbox/other/Code Snippets/Java Work/Java_OO/createaccounts.txt"; // this is one path on my pc.
	public static String macLogFileLocationExample = "/Users/administrator/Dropbox/other/Code Snippets/Java Work/Java_OO/outputWarnings.txt";
	public static String windowsSourceFileExample = "C:\\Users\\Administrator\\Desktop\\test.txt";
	public static String windowsLogFileExample = "C:\\Users\\Administrator\\Desktop\\log_" + new Date().getTime() + ".txt"; // formats the date in the file name
	public static String macSource1 = "/Users/administrator/Desktop/test.txt";
	public static String macLog1 = "/Users/administrator/Desktop/" + new Date() +  "_log.txt"; 
	
	
	public static boolean copyFile(String sourceFile, String destinationFile) { // will create the file if it does not exist

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
	
	
	
	
	
	
	
	
	
} // end of class

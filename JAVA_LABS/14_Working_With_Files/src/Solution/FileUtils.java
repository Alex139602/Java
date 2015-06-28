package Solution;

import java.io.*;

public class FileUtils {
	
	public static String lastLineInFile(String inputFile) 
          throws IOException {

		BufferedReader bfr = new BufferedReader(
				 new FileReader(inputFile));

		String lastLine = null;
		String data;
		while ((data = bfr.readLine()) != null) {
			lastLine = data;
		}
		bfr.close();
		return lastLine;
	}

	// This method should create a new file (outputFile) and copy the
	// input file (inputFile) to this new file, but convert the
	// content of the file to lower case.
	// If the original file exists it should be overwritten.
	public static void convertFileToLowerCase(String inputFile,
			String outputFile) throws IOException {

//		BufferedReader bfr = new BufferedReader(new InputStreamReader(
//				new FileInputStream(inputFile)));
//		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(
//				new FileOutputStream(outputFile)));
		BufferedReader bfr = new BufferedReader(
				new FileReader(inputFile));
		BufferedWriter bfw = new BufferedWriter(
				new FileWriter(outputFile));
		String inData;

		while ((inData = bfr.readLine()) != null) {
			bfw.write(inData.toLowerCase() + "\n");
		}
		bfr.close();
		bfw.close();

	}

	// This method should create a new file (outputFile) and copy the
	// input file (inputFile) to this new file,
	// but convert the content to upper case.
	
	public static void convertFileToUpperCase(String inputFile,
			String outputFile) throws IOException {

		BufferedReader bfr = new BufferedReader(
				new FileReader(inputFile));
		BufferedWriter bfw = new BufferedWriter(
				new FileWriter(outputFile));
		String inData;

		while ((inData = bfr.readLine()) != null) {
			bfw.write(inData.toUpperCase() + "\n");
		}

		bfr.close();
		bfw.close();
	}

	// This method should return an integer representing the number
	// of lines that start with the specified String (in the parameter match).
	// The file to be searched is the input file.
	// The search should be case sensitive.
	public static int linesThatStartWith(String inputFile, String match)
			throws IOException {

		BufferedReader bfr = new BufferedReader(
				new FileReader(inputFile));
		int lines = 0;
		String data;
		while ((data = bfr.readLine()) != null) {
			if (data.startsWith(match)) {
				lines++;
			}
		}
		bfr.close();
		return lines;
	}

	// This method should return an integer representing the number
	// of lines that start with the specified String (in the parameter match).
	// The file to be searched is the input file.
	// The search should ignore case.
	public static int linesThatStartWithCaseInsensitive(String inputFile,
			String match) throws IOException {

		BufferedReader bfr = new BufferedReader(
				new FileReader(inputFile));
		int lines = 0;
		String data;
		while ((data = bfr.readLine()) != null) {
			if (data.toLowerCase().startsWith(match.toLowerCase())) {
				lines++;
			}
		}
		bfr.close();
		return lines;
	}

	// This method should return an integer representing the number of lines
	// that contain the specified String (in the parameter match).
	// The file to be searched is the input file. 
	// The search should ignore case.
	public static int linesThatContainCaseInsensitive(String inputFile,
			String match) throws IOException {

		BufferedReader bfr = new BufferedReader(
				new FileReader(inputFile));
		int lines = 0;
		String data;
		while ((data = bfr.readLine()) != null) {
			if (data.toLowerCase().contains(match.toLowerCase())) {
				lines++;
			}
		}
		bfr.close();
		return lines;
	}
}

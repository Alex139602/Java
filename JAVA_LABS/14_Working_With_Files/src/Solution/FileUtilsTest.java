package Solution;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.Test;

public class FileUtilsTest {
	
	

	@Test
	public void testLastLineInFile() throws IOException {
		// Arrange
		String inputFile = "C:\\Documents and Settings\\spotter\\Desktop\\Spring14Java\\JAVA_LABS\\14_Working_With_Files\\src\\Solution\\FileWithLinesIn.txt";
		String expected = "This is the last";

		// Act
		String actual = FileUtils.lastLineInFile(inputFile);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertFileToLowerCase() 
			throws IOException
	{
		// Arrange
		  String inputFile = "C:\\Documents and Settings\\spotter\\Desktop\\Spring14Java\\JAVA_LABS\\14_Working_With_Files\\src\\Solution\\FileWhoseCaseIsToBeConverted.txt";
	      String outputFile = "C:\\Documents and Settings\\spotter\\Desktop\\Spring14Java\\JAVA_LABS\\14_Working_With_Files\\src\\Solution\\FileConvertedToLowerCase.txt";


	      // Act
	      FileUtils.convertFileToLowerCase(inputFile, outputFile);
	      
	      
	      StringBuilder sbIn = new StringBuilder();
	      StringBuilder sbOut = new StringBuilder();
	      
	      BufferedReader bfrIn = new BufferedReader(
	    		                  new FileReader(inputFile));
	      
	      BufferedReader bfrOut = new BufferedReader(
	                               new FileReader(outputFile));
	      
	      String data;
	      while ((data = bfrIn.readLine())!= null) {
	    	 sbIn.append(data.toLowerCase());
	    	 sbOut.append(bfrOut.readLine());
		  }
	      
	      
	      assertEquals(sbIn.toString(), sbOut.toString());
	      
	      bfrIn.close();
	      bfrOut.close();
	      
	      
	}

	@Test
	public void testConvertFileToUpperCase() 
			throws IOException
	{
		// Arrange
		  String inputFile = "C:\\Documents and Settings\\spotter\\Desktop\\Spring14Java\\JAVA_LABS\\14_Working_With_Files\\src\\Solution\\FileWhoseCaseIsToBeConverted.txt";
	      String outputFile = "C:\\Documents and Settings\\spotter\\Desktop\\Spring14Java\\JAVA_LABS\\14_Working_With_Files\\src\\Solution\\FileConvertedToLowerCase.txt";


	      // Act
	      FileUtils.convertFileToUpperCase(inputFile, outputFile);
	      
	      // Assert
	      StringBuilder sbIn = new StringBuilder();
	      StringBuilder sbOut = new StringBuilder();
	      
	      BufferedReader bfrIn = new BufferedReader(
	    		                  new FileReader(inputFile));
	      
	      BufferedReader bfrOut = new BufferedReader(
	                               new FileReader(outputFile));
	      
	      String data;
	      while ((data = bfrIn.readLine())!= null) {
	    	 sbIn.append(data.toUpperCase());
	    	 sbOut.append(bfrOut.readLine());
		  }    
	      assertEquals(sbIn.toString(), sbOut.toString());
	      
	      bfrIn.close();
	      bfrOut.close();
	}

	@Test
	public void testLinesThatStartWith() throws IOException {
		String inputFile = "C:\\Documents and Settings\\spotter\\Desktop\\Spring14Java\\JAVA_LABS\\14_Working_With_Files\\src\\Solution\\FileForLinesStartWithTest.txt";
		String match = "Hello";
		int expected = 2;
		int actual = FileUtils.linesThatStartWith(inputFile, match);
		assertEquals(expected, actual);
	}

	@Test
	public void testLinesThatStartWithCaseInsensitive() throws IOException {
		String inputFile = "C:\\Documents and Settings\\spotter\\Desktop\\Spring14Java\\JAVA_LABS\\14_Working_With_Files\\src\\Solution\\FileForLinesStartWithTest.txt";
		String match = "Hello";
		int expected = 3;
		int actual = FileUtils.linesThatStartWithCaseInsensitive(inputFile,
				match);
		assertEquals(expected, actual);
	}

	@Test
	public void testLinesThatContainCaseInsensitive() throws IOException {
		String inputFile = "C:\\Documents and Settings\\spotter\\Desktop\\Spring14Java\\JAVA_LABS\\14_Working_With_Files\\src\\Solution\\FileForLinesStartWithTest.txt";
		String match = "Hello";
		int expected = 4;
		int actual = FileUtils
				.linesThatContainCaseInsensitive(inputFile, match);
		assertEquals(expected, actual);
	}

}

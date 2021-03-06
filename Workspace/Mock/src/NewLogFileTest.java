import static org.junit.Assert.*;

import java.io.File;

import javax.swing.JFileChooser;

import org.junit.Test;

import java.util.Date;

public class NewLogFileTest {
	
	@Test public void testAppendMessageToFile() {
		
		assertTrue( NewLogFile.writeToLogFile("hi alex", NewLogFile.targetFileLocation ) );
		
	}
	
	@Test public void testUserInputAppendMessageToFile(){
		Date now =  new Date();
		String getTheseFiles = null;
		JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int returnVal = fc.showDialog(fc, "Choose File or Directory");
		if(returnVal == 0){
			System.out.println(returnVal);
			File file = fc.getSelectedFile();
			if (file.isDirectory()) {
				getTheseFiles = file.getPath() + "/log_" + now.toString() + ".txt";
				System.out.println(getTheseFiles);
			} else {
				getTheseFiles = file.getPath() + "+log_" + now.toString() + ".txt";
				System.out.println(getTheseFiles);
			}
		}
		
		
		
		assertTrue( NewLogFile.writeToLogFile("this was a chosen file", getTheseFiles));
		
	}


}

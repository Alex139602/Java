package time;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewCopyFileTest {

	@Test public void testCopyFile() {
		assertTrue(NewCopyFile.copyFile(NewCopyFile.macSourceFileLocationExample, NewCopyFile.macLogFileLocationExample));
		assertTrue(NewCopyFile.copyFile(NewCopyFile.macSource1, NewCopyFile.macLog1));
		// note: this will assert correctly on mac, but wont on a pc due to the differing file structures
		//the windowsSourceFileLocation and windowsLogFileExample
		// are examples of wherer you could copy from on pc
	}

}

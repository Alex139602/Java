package money;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.JUnitCore;

public class AccountTest {
	
	Account alex = new Account("Alex", 1000 );
	Account testAccount = new Account("testSmallerConstructor");

	@Test public void testAccountStringNoConstructor() {
		assertTrue(testAccount.getBalance() == 0.0);
	}

	@Test public void testGetAccountDetails(){
		alex.withdraw(500);
		assertTrue( alex.getBalance() == 500 );
	}
	
	@Test public void testGetAccountNumber(){
		String accNumbr = alex.getAccountNumber();
		System.out.println(accNumbr);
		assertTrue(accNumbr.equalsIgnoreCase("sa-0007"));
	}
	
	@Test public void testSendErrorToFile(){
		FileCopy.writeMessageToFile("msg", FileCopy.targetFileLocation);
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(FileCopy.targetFileLocation));
			try {
				String line ="";
				while ((line = bufferedReader.readLine()) != null) {
					System.out.println(line);
					if( line.contains("msg") ){
						assertTrue(true);
					} else {
						assertTrue(false);
					}
				}
			} catch(IOException e){
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		assertTrue(true);
	}
}

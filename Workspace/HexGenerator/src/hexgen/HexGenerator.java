package hexgen;

import java.util.Arrays;

import javax.swing.*;


public class HexGenerator {
	
	public static final String newline = "\n";
	
	public static final String[] INT_ARRAY = new String[]{ "1", "2", "3", "4", "5", "6", "8", "9" };
	
	public static final String[] HEX_ARRAY_LOWER = new String[]{ "1", "2", "3", "4", "5", "6", "8", "9", "a", "b", "c", "d", "e", "f" };
	
	public static final String[] HEX_ARRAY_CAPS = new String[]{ "1", "2", "3", "4", "5", "6", "8", "9", "A", "B", "C", "D", "E", "F" };
	
	public static final String[] HEX_ARRAY_CAPS_AND_LOWER = new String[]{ "1", "2", "3", "4", "5", "6", "8", "9", "a", "b", "c", "d", "e", "f", "A", "B", "C", "D", "E", "F" };
	
	public static void main(String[] args) {
		
		String[] hx = generateHexCode(HEX_ARRAY_CAPS_AND_LOWER, 8, 20);
	
		/*
		String str = Arrays.toString(hx);
		
		System.out.println(str);
		*/
		
		
	} // end of main
	
	public static String[] generateHexCode(String[] strArray, int hexCodeLength, int numberOfHexCodes) {
		String[] hexString = new String[numberOfHexCodes];
		
		int arrLength = strArray.length;
		
		for (int i = 0 ; i < numberOfHexCodes ; i++ ) {
			
			for (int j = 0 ; j < hexCodeLength ; j++ ) {
				int valToGet = (int) (Math.random()*arrLength);
				if (hexString[i] == null) {
					hexString[i] = strArray[valToGet];
				} else {
					hexString[i] += strArray[valToGet];
				}
			}
			
			System.out.println(hexString[i]);
			
		}
		
		return hexString;
		
	}
	
	public static void showInterface(){
			JOptionPane.showMessageDialog(null, "show message");
			
			//TOOD: User interface
	}	
	
} // end of class
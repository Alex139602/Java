package hexgen;

import javax.swing.*;


public class HexGenerator {
	
	public static final String newline = "\n";
	
	public static final String[] INT_ARRAY = new String[]{ "1", "2", "3", "4", "5", "6", "8", "9" };
	
	public static final String[] HEX_ARRAY_LOWER = new String[]{ "1", "2", "3", "4", "5", "6", "8", "9", "a", "b", "c", "d", "e", "f" };
	
	public static final String[] HEX_ARRAY_CAPS = new String[]{ "1", "2", "3", "4", "5", "6", "8", "9", "A", "B", "C", "D", "E", "F" };
	
	public static final String[] HEX_ARRAY_CAPS_AND_LOWER = new String[]{ "1", "2", "3", "4", "5", "6", "8", "9", "a", "b", "c", "d", "e", "f", "A", "B", "C", "D", "E", "F" };
	
	public static void main(String[] args) {
		
		try{
			String[] hx = generateHexCodes(HEX_ARRAY_CAPS_AND_LOWER, Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		} catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
		/*
		String str = Arrays.toString(hx);
		
		System.out.println(str);
		*/
		
		
	} // end of main
	
	public static String[] generateHexCodes(String[] strArray, int hexCodeLength, int numberOfHexCodes) {
		String[] hexString = new String[numberOfHexCodes];
		System.out.println(newline);
		for (int i = 0 ; i < numberOfHexCodes ; i++ ) {
			
			for (int j = 0 ; j < hexCodeLength ; j++ ) {
				int valToGet = (int) Math.floor(Math.random()*strArray.length);
					if (hexString[i] == null) {
						hexString[i] = strArray[valToGet];
					} else {
						hexString[i] += strArray[valToGet];
					}
			}
			
			System.out.println(hexString[i].toLowerCase());
			
		}
		System.out.println(newline);
		return hexString;
		
	}
	
	public static void showInterface(){
			JOptionPane.showMessageDialog(null, "show message");
			
			//TOOD: User interface
	}	
	
} // end of class

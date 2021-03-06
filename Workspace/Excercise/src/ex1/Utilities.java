package ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Utilities {
	

	public static double circleArea(double radius){ return Math.PI*radius*radius; }

	public static double circleCircumference(double radius){ return 2*Math.PI*radius; }
	
	public static double triangleArea(double base, double height){ return 0.5*base*height;}
	
	public static double trianglePerimeter(double side1, double side2, double side3){ return (side1 + side2 + side3); }
	
	public static double squareArea(double squareSide){ return squareSide*squareSide; }
	
	public static double squarePerimeter(double squareSide){ return 4*squareSide; }
	
	public static double strToDbl(String str){ return Double.parseDouble(str); }
	
	public static int strToInt(String str){ return Integer.parseInt(str); }
	
	public static String getUserInputWindow(String menuHeader, String menuMessage, String...strings){
		String[] inputChoices = new String[strings.length];
		
		for(int i = 0; i < strings.length; i++){
			inputChoices[i] = strings[i];
		}
	    String finalChoice = (String) JOptionPane.showInputDialog(null, menuHeader, menuMessage,
	    JOptionPane.QUESTION_MESSAGE, null, inputChoices, inputChoices[0]);
		return finalChoice;
	}
	
	public static double[] dbl_returnTwoJTextFields(String leftChoiceText, String rightChoiceText){
		JTextField leftInput = new JTextField(6);
		JTextField rightInput = new JTextField(6);
		
		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel(leftChoiceText));
		myPanel.add(leftInput);
		myPanel.add(Box.createHorizontalStrut(10)); // a spacer
		myPanel.add(new JLabel(rightChoiceText));
		myPanel.add(rightInput);
		int result = JOptionPane.showConfirmDialog(null, myPanel, 
				"Please Enter Number Values", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
			System.out.println("Number 1: " + leftInput.getText());
		    System.out.println("Number 2: " + rightInput.getText());
		}
		
		int intValue1 = strToInt(leftInput.getText());
		int intValue2 = strToInt(rightInput.getText());
		double[] dblArray = {intValue1, intValue2};
		return dblArray;
	}
	
	public static int[] int_returnTwoJTextFields(String leftChoiceText, String rightChoiceText){
		JTextField leftInput = new JTextField(6);
		JTextField rightInput = new JTextField(6);
		
		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel(leftChoiceText));
		myPanel.add(leftInput);
		myPanel.add(Box.createHorizontalStrut(10)); // a spacer
		myPanel.add(new JLabel(rightChoiceText));
		myPanel.add(rightInput);
		int result = JOptionPane.showConfirmDialog(null, myPanel, 
				"Please Enter Values", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
			leftInput.getText();
		    rightInput.getText();
		}
		
		int intValue1 = strToInt(leftInput.getText());
		int intValue2 = strToInt(rightInput.getText());
		int[] intArray = {intValue1, intValue2};
		return intArray;
	}

	public static String createOneJTextField(){
		String s = "";
		JTextField leftInput = new JTextField(6);
		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("Number 1:"));
		myPanel.add(leftInput);
		int result = JOptionPane.showConfirmDialog(null, myPanel, 
				"Please Enter Number Values", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
			s = leftInput.getText();
		}
		return s;
	}
		
	public static double[] variableJTextFieldBoxesAsDblArray(String startNameOfInputs, int numberOfBoxes, int JTextFieldSize, int boxSeparatorSize){
		double[] dblArray = new double[numberOfBoxes];
		String[] elementName = new String[numberOfBoxes];
		JTextField[] JTextFieldArray = new JTextField[numberOfBoxes];
		JPanel myPanel = new JPanel();
		for(int i = 0; i < numberOfBoxes; i++ ){
		elementName[i] = startNameOfInputs + " " + Integer.toString(i) + ":";
		JTextFieldArray[i] = new JTextField(JTextFieldSize);
		myPanel.add(new JLabel(elementName[i]));
		myPanel.add(JTextFieldArray[i]);
		myPanel.add(Box.createHorizontalStrut(boxSeparatorSize)); // a spacer
		//System.out.println(elementName[i]);
		}
		int result = JOptionPane.showConfirmDialog(null, myPanel, "Please Enter Values", JOptionPane.OK_CANCEL_OPTION);
		
		if (result == JOptionPane.OK_OPTION) {
			for (int i = 0; i < numberOfBoxes; i++){
				System.out.println(JTextFieldArray[i].getText());
				dblArray[i] = Double.parseDouble(JTextFieldArray[i].getText()); // parse the double and then initialise it to the array element
			}
		} else { Utilities.showMsg("User Cancelled Operation");	}
		if (sumDblArray(dblArray) == 0){
			Utilities.showMsg("Error: dblArray has no values");	
		}
		return dblArray;
	}
	
	public static int[] variableJTextFieldBoxesAsIntArray(String startNameOfInputs, int numberOfBoxes, int JTextFieldSize, int boxSeparatorSize){
		int[] intArray = new int[numberOfBoxes];
		String[] elementName = new String[numberOfBoxes];
		JTextField[] JTArray = new JTextField[numberOfBoxes];
		JPanel myPanel = new JPanel();
		for(int i = 0; i < numberOfBoxes; i++ ){
			elementName[i] = startNameOfInputs + " " + Integer.toString(i) + ":";
			JTArray[i] = new JTextField(JTextFieldSize);
			myPanel.add(new JLabel(elementName[i]));
			myPanel.add(JTArray[i]);
			myPanel.add(Box.createHorizontalStrut(boxSeparatorSize)); // a spacer
		}
		int result = JOptionPane.showConfirmDialog(null, myPanel, "Please Enter Values", JOptionPane.OK_CANCEL_OPTION);
		
		if (result == JOptionPane.OK_OPTION) {
			System.out.println("OK_PRESSED");
			for (int i = 0; i < numberOfBoxes; i++){
				//System.out.println(JTArray[i].getText());
				intArray[i] = Integer.parseInt(JTArray[i].getText()); // parse the double and then initialise it to the array element
			}
		} else { Utilities.showMsg("User Cancelled Operation");	}
		if (sumIntArray(intArray) == 0){
			Utilities.showMsg("Error: dblArray has no values");	
		}
		return intArray;
	}
	
	public static double sumInfiniteDbls(double...dbls){
		double dblResult = 0;
		 for(int i = 0 ; i < dbls.length; i++){
			 dblResult += dbls[i];
		} 
		return dblResult;
		
	}
	
	public static double sumDblArray(double[] dblArray){
		double arraySum = 0;
		if(dblArray.length > 0){
			for(int i = 0; i < dblArray.length; i++){
				arraySum += dblArray[i];
			}
		} else { Utilities.showMsg("Error! double array length <= 0"); }
		
		return arraySum;
	}
	
	public static int sumIntArray(int[] intArray){
		int arraySum = 0;
		if(intArray.length > 0){
			for(int i = 0; i < intArray.length; i++){
				arraySum += intArray[i];
			}
		} else { Utilities.showMsg("Error! double array length <= 0"); }
		
		return arraySum;
	}
	
	public static String dblArrayToSepString(double[] dblArray){
		String arraySum = "";
		if(dblArray.length > 0){
			for(int i = 0; i < dblArray.length; i++){
				arraySum += Double.toString(dblArray[i]) + ",";
			}
		} else {
			arraySum = "Not input";
		}
		return arraySum;
	}
	
	public static double sumInfiniteInts(int...ints){
		int intResult = 0;
		 for(int i = 0 ; i < ints.length; i++){
			 intResult += ints[i];
		} 
		return intResult;
	}
	
	public static String getInput(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	
	public static void showMsg(String msg){
		JOptionPane.showMessageDialog(null, msg); 
	}
	
	public static void setWeight(int yrd, int ft, int inc){
		if ( validateLength(yrd, ft, inc) == true ){
		} else if (validateLength(yrd, ft, inc) == false ){
			if ( yrd < 0 ){ Utilities.showMsg("Not a valid yard length input, g is less than zero"); }
			if ( ft < 0 ){ Utilities.showMsg("Not a valid feet length input, p is less than zero");}
			if ( inc < 0 ){ Utilities.showMsg("Not a valid gallon weight input, p is less than zero");}
			else {	
				@SuppressWarnings("unused")
				int[] yrd_ft_inc = remainderChanges(yrd, ft, inc);
				
			}
			
		} else { System.out.println("BOOL ERROR");}
	}
	
	public static void addWeight(int yrd, int ft, int inc){
		if (validateLength(yrd, ft, inc) == true ) {
			// TODO Some code here...
		} else if (validateLength(yrd, ft, inc) == false){
			@SuppressWarnings("unused")
			int[] yrd_ft_inc = remainderChanges(yrd, ft, inc);
			// TODO work out remainder..
			
		} else { 
			Utilities.showMsg("ERROR 111"); 
		}
	}
	
	/*public static void subtractWeight(int g, int p){
		if ( g >= 0 && p >= 0 ) {
			if ( validateWeight(g, p) == true && g < gallons && p < pints ){
				gallons -= g;	
				pints -= p;
			} else /* if (validateWeight(g , p) == false ) {
				int[] gall_pint = remainderChanges(g, p);
				int totalPintsNow = (gallons*8 + pints);
				int totalPintsToRemove = ( gall_pint[0]*8 + gall_pint[1] );
				if (totalPintsNow <= totalPintsToRemove){
					gallons = 0;
					pints = 0;
					//Utilities.showMsg("You removed more than you had! now you have none.");
				} else if (totalPintsNow > totalPintsToRemove) {
					int totalPintsLeft = totalPintsNow - totalPintsToRemove;
					int remPints = totalPintsLeft % 8;
					int remGallons = (totalPintsLeft - remPints)/8;
					gallons = remGallons;
					pints = remPints;
				} else {Utilities.showMsg("Something went wrong here");}
			}
		} else { Utilities.showMsg("Invalid input values for subtraction. please use values > 0 "); }
	}
	 */
	
	public static void displayLength(){
		if( Lengths.yards != 0 && Lengths.feet != 0 && Lengths.inches != 0){
			Utilities.showMsg("Total Yards: " + Lengths.yards + "\nTotal Feet: " + Lengths.feet + "\nTotal Inches: " + Lengths.inches); 
		}
	}
	
	public static boolean validateLength( int yrd, int ft, int inc ){
		if ( yrd >= 0 && (ft >= 0 && ft < 3) && (inc >= 0 && inc < 13)) { return true; } 
		else { return false; }
	}
	
	public static int[] remainderChanges(int yrd, int ft, int inch){
		int yrdNew = 0;
		int totalInchesLeft = 0;
		int totalFeetLeft = 0;
		int totalInchesNew = (yrd*36 + ft*12 + inch);
		if( yrd >= 0 && ft >= 0 && inch >= 0 ){
			int inchRemainder = totalInchesNew % 36;
			yrdNew += (totalInchesNew - inchRemainder)/36;
			//int feetRemainder = (); 
			//totalFeetLeft += ()/12;
			//System.out.println(yrdNew);
			System.out.println(inchRemainder);
		} else { Utilities.showMsg("ERROR! invalid input values");}
		int[] intArray = new int[]{yrdNew, totalFeetLeft, totalInchesLeft};
		return intArray;
	}
	
	public static int showOption(String inputHeader, String inputText, String... optionChoices){ 
		//Object[] options = new Object[]{optionChoices};
		int val  = JOptionPane.showOptionDialog(null, inputText, inputHeader, JOptionPane.YES_NO_CANCEL_OPTION, 
													JOptionPane.PLAIN_MESSAGE, null, optionChoices, optionChoices[0]);
		return val;
	}
	

	 public static String[] readLinesFromFilesAsArray(String filePath, int numOfLines) throws IOException{
		 	String[] Array = new String[numOfLines];
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			String text = "";
			try {
				String line = br.readLine();
				for (int i = 0; i < numOfLines; i++) {
					text = text + line + "\n";
					Array[i] = line;
					line = br.readLine();
				}
				
			} finally {
				br.close();
			}
			System.out.println(text);
			return Array;
	}
	 
	 public static int getLineCount(String filePath) throws FileNotFoundException, IOException{
		 int lineCount = 0;
		 FileReader fr = new FileReader(filePath);
		 LineNumberReader lnr = new LineNumberReader(fr);
		 try {
			 lnr.skip(Long.MAX_VALUE);
			 lineCount += lnr.getLineNumber() + 1;
		} finally {
			lnr.close();
		}
		 
		 return lineCount;
	 }
		 

}

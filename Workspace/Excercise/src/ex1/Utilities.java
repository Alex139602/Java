package ex1;

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
				System.out.println(JTArray[i].getText());
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
	
	public static int gallonsToPints(int gallons){
		JOptionPane.showMessageDialog(null, gallons*8);
		return gallons*8;
	}
	
	public static void pintsToGallons(int pints){
		JOptionPane.showMessageDialog(null, (int) Math.floor(pints/8)); 
	}
	
	public static void setWeight(int g, int p){
		if (validateWeight(g, p) == true){
			gallons = g;	
			pints = p;
		} else if (validateWeight(g, p) == false){
			if ( g < 0 ){ Utilities.showMsg("Not a valid gallon Weight input, g is less than zero"); }
			if ( p < 0 ){ Utilities.showMsg("Not a valid gallon weight input, p is less than zero");}
			else {	
				int[] gall_pint = remainderChanges(g, p);
				gallons = gall_pint[0];
				pints = gall_pint[1];
			}
			
		} else { System.out.println("BOOL ERROR");}
	}
	
	public static void addWeight(int g, int p){
		if (validateWeight(g, p) == true){
			gallons += g;	
			pints += p;
		} else if (validateWeight(g, p) == false){
			int[] gall_pint = remainderChanges(g, p);
			gallons += gall_pint[0];
			pints += gall_pint[1];
		} else { Utilities.showMsg("ERROR 111"); }
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
	
	public static void displayWeight(){ 
		Utilities.showMsg("Total Gallons: " + gallons +"\nTotal Pints: " + pints); 
		
	}
	
	public static boolean validateWeight( int yrd, int ft, int inc ){
		if ( yrd >= 0 && (ft >= 0 && ft < 4) && (inc >= 0 && inc < 13)){
			return true; 
		} else { 
			return false;
		}
	}
	
	public static int[] remainderChanges(int yrd, int ft, int inc){
		int yrdNew = 0;
		int ftNew = 0;
		int totalInchesNew = (yrd*36 + ft*12 + inc);
		if( yrd >= 0 && ft >= 0 &&  inc >= 0 ){
			yrdNew = totalInchesNew % 36; 
		} else { 
			Utilities.showMsg("Undefined limit values");
		}
		int[] intArray = new int[]{yrdNew, ftNew, totalInchesNew};
		return intArray;
		
	}

}

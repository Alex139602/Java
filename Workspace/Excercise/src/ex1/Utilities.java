package ex1;

import java.util.Arrays;

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
	
	public static double[] returnTwoJTextFields(int numberOfBoxes){
		JTextField leftInput = new JTextField(6);
		JTextField rightInput = new JTextField(6);
		for(int i = 0; i == numberOfBoxes; i++){
			
		}
		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("Number 1:"));
		myPanel.add(leftInput);
		myPanel.add(Box.createHorizontalStrut(10)); // a spacer
		myPanel.add(new JLabel("Number 2:"));
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

	public static void createOneJTextField(){
		JTextField leftInput = new JTextField(6);
		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("Number 1:"));
		myPanel.add(leftInput);
		int result = JOptionPane.showConfirmDialog(null, myPanel, 
				"Please Enter Number Values", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
			System.out.println("Number 1: " + leftInput.getText());
		}
		
	}
		
	public static double[] variableJTextFieldBoxes(String nameOfInputs, int numberOfBoxes, int JTextFieldSize, int boxSeparatorSize){
		double[] dblArray = new double[numberOfBoxes];
		String[] elementName = new String[numberOfBoxes];
		JPanel myPanel = new JPanel();
		for(int i = 0; i < numberOfBoxes; i++ ){
		dblArray[i] = i;
		elementName[i] = nameOfInputs + " " + Integer.toString(i) + ":";
		
		JTextField JTextName = new JTextField(JTextFieldSize);
		myPanel.add(new JLabel(elementName[i]));
		myPanel.add(Box.createHorizontalStrut(boxSeparatorSize)); // a spacer
		int result = JOptionPane.showConfirmDialog(null, myPanel, "Please Enter Values", JOptionPane.OK_CANCEL_OPTION);
		
		if (result == JOptionPane.OK_OPTION) {
			System.out.println(JTextName.toString());
		}
		
		}
		
		return dblArray;
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
		} 
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
		return gallons*8;
	}
	
	public static void pintsToGallons(int pints){
		JOptionPane.showMessageDialog(null, pints); 
	}
}

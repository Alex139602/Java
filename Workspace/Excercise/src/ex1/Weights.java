package ex1;

import java.util.Arrays;

import ex1.Utilities;

public class Weights {
	
	static int gallons = 0;
	static int pints = 0;

	public static void main(String[] args){
		String result = Utilities.getUserInputWindow("Choice of operation", "Please choose an operation", "Add weight", "Set weight", "Subtract weight", "Display Weight");
		if( result == "Add weight"){
			//String radius = Utilities.getInput("Please Choose a Radius for your circle:");
			Utilities.createOneJTextField();
			double[] array = Utilities.variableJTextFieldBoxes("Number", 4, 3, 10);
			System.out.println(Arrays.toString(array));
		} 
		

		
		
	} // end of main method
	
	
	
	
	public static void setWeight(int g, int p){
		gallons = g;
		pints = p;
	}
	
	public static void addWeight(int g, int p){
		gallons += g;
		pints += p;
	}
	
	public static void subtrWeight(int g, int p){
		gallons -= g;
		pints -= p;
	}
	
	public static void lookAtGallons(){
				
	}
	
	public static void lookAtPints(){
	}
}





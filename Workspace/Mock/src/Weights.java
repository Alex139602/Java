

import java.util.Arrays;

import javax.rmi.CORBA.Util;

@SuppressWarnings("unused")

public class Weights {
	
	public static int gallons = 0; // must be greater than 0 and an Int
	public static int pints = 0; // must be between 0 and 7 and an Int

	public static void main(String[] args){
		boolean whileNow = true;
		while( whileNow == true ){
			String result1 = Utilities.getUserInputWindow("Please set weight", "If cancel is chosen, gallons and pints will have values of 0", "Set Initial Weight", "Reset Weight to Zero", "Exit the Programme"); 
				if ( result1 == "Set Initial Weight"){
					int[] gall_pint = new int[]{gallons, pints};
					if( gallons == 0 && pints == 0){
						gall_pint = Utilities.int_returnTwoJTextFields("new Initial Value for Gallons:", "new Initial Value for Pints:");
						setWeight(gall_pint[0], gall_pint[1]);
					} 
					displayWeight();
				} else if ( result1 == "Exit the Programme"){
					whileNow = false;
					Utilities.showMsg("Goodbye!");
					System.exit(0);
				}	else if ( result1 == "Reset Weight to Zero") {  
						gallons = 0;
						pints = 0;
				}
			String result2 = Utilities.getUserInputWindow("Operation Choices", "Please Choose An Operation", "Add Weight", "Subtract Weight", "Display Weight", "Exit the Programme");
			 	if ( result2 == "Add Weight"){
			 		int[] gall_pint = Utilities.int_returnTwoJTextFields("Gallons:", "Pints:");
			 		addWeight(gall_pint[0], gall_pint[1]);
			 	} else if ( result2 == "Subtract Weight"){
			 		int[] gall_pint = Utilities.int_returnTwoJTextFields("Gallons:", "Pints:");
			 		subtractWeight(gall_pint[0], gall_pint[1]);
			 	} else if (result2 == "Exit the Programme"){
			 		whileNow = false;
			 		Utilities.showMsg("Goodbye!");
			 		System.exit(0);
			 	}
				displayWeight();
		}
	} // end of main method
	
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
	
	public static void subtractWeight(int g, int p){
		if ( g >= 0 && p >= 0 ) {
			if ( validateWeight(g, p) == true && g < gallons && p < pints ){
				gallons -= g;	
				pints -= p;
			} else /* if (validateWeight(g , p) == false ) */ {
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
	
	public static void displayWeight(){ Utilities.showMsg("Total Gallons: " + gallons +"\nTotal Pints: " + pints); }
	
	public static int getGallons(){
		return gallons;
	}
	
	public static int getPints(){
		return pints;
	}
	
	public static boolean validateWeight(int g, int p){
		if ( g >= 0 && (p >= 0 && p < 8)){
			return true; 
		} else { 
			return false;
		}
	}
	
	public static int[] remainderChanges(int g, int p){
		int gallonsNew = 0;
		int totalPintsRemainder = 0;
		int totalPints = (g*8 + p);
		if( g >= 0 && p >= 0){
			totalPintsRemainder += totalPints % 8;
			gallonsNew = (totalPints - totalPintsRemainder)/8;
		} else { 
			System.out.println(totalPints);
			System.out.println(totalPintsRemainder);
			
		}
		int[] intArray = new int[]{gallonsNew, totalPintsRemainder};
		return intArray;
		
	}




}






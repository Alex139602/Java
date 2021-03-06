package Solution;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConvertCurrency {
	public static double _dollarsPerPound = 1.57;
	
	public static void main(String[] args) {		
		//getName();
		if( returnConversionChoices() == "Pounds to Dollars"){
			JOptionPane.showMessageDialog(null, "$" + convertPoundsToDollars(getCurrency()) + " Converted from pounds");
		} else if ( returnConversionChoices() == "Dollars to Pounds"){
			JOptionPane.showMessageDialog(null, "�" + convertDollarsToPounds(getCurrency()) + " Converted from dollars");
		}else {
			JOptionPane.showMessageDialog(null, "ERROR");
		}
		
	} // End of main method
	
	public static String random = "twelve";
		
	public static double getCurrency(){
		JTextField inputNumber1 = new JTextField(5);
		
	    JPanel myPanel = new JPanel();
	    myPanel.add(new JLabel("Currency to Convert:"));
	    myPanel.add(inputNumber1);
	    /*myPanel.add(Box.createHorizontalStrut(15)); // a spacer
	    myPanel.add(new JLabel("Number 2:"));
	    myPanel.add(inputNumber2);*/

	    int result = JOptionPane.showConfirmDialog(null, myPanel, 
	             "Please Enter currency Value that you want changed", JOptionPane.OK_CANCEL_OPTION);
	    if (result == JOptionPane.OK_OPTION) {
	         System.out.println("Currency to convert: " + inputNumber1.getText());
	         //System.out.println("Number 2: " + inputNumber2.getText());
	      }
	    double moneyValue = Double.parseDouble(inputNumber1.getText());
	    
	    
	    
	    return moneyValue;
		
		
	}
	public static String getName(){
		return JOptionPane.showInputDialog("What is your name?");
	}
	
	
	public static String showName(String name) {
		JOptionPane.showMessageDialog(null, name);
		return name;
	}
	
	public static String returnConversionChoices(){
		String[] conversions = {"Pounds to Dollars", "Dollars to Pounds"};
	    String conversionChoice = (String) JOptionPane.showInputDialog(null, "Operation Choice", "Please choose an Operation",
	    JOptionPane.QUESTION_MESSAGE, null, conversions, conversions[0]);
		return conversionChoice;
	}
	
	public static double convertDollarsToPounds(double dollarValue ){
				
		return (dollarValue/_dollarsPerPound);
	}
	
	public static double convertPoundsToDollars(double poundsValue ){
		
		return (poundsValue*_dollarsPerPound);
	}
	
	
	
	
	
	
	
}

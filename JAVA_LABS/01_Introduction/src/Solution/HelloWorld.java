package Solution;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HelloWorld {

	public static void main(String[] args) {		
		//JOptionPane.showMessageDialog(null, getName());
		//JOptionPane.showMessageDialog(null, getNumbers());
		//System.out.println(Arrays.toString(getNumbers()));
		int[] intReturnArray = getNumbers();
		if( returnChoices() == "Divide"){
			divideNumbers(intReturnArray[0], intReturnArray[1]);
		}else if( returnChoices() == "Multiply"){
			multiplyNumbers(intReturnArray[0], intReturnArray[1]);
		}else if( returnChoices() == "Addition"){
			addNumbers(intReturnArray[0], intReturnArray[1]);
		}else if( returnChoices() == "Subtraction"){
			subtractNumbers(intReturnArray[0], intReturnArray[1]);
		}else {
			JOptionPane.showMessageDialog(null, "ERROR!!");
		}
		
		
	} // End of main method
	
	public static String getName(){
		return JOptionPane.showInputDialog("What is your name?");
	}
	
	public static int[] getNumbers(){
		JTextField inputNumber1 = new JTextField(10);
		JTextField inputNumber2 = new JTextField(10);
		
	    JPanel myPanel = new JPanel();
	    myPanel.add(new JLabel("Number 1:"));
	    myPanel.add(inputNumber1);
	    myPanel.add(Box.createHorizontalStrut(15)); // a spacer
	    myPanel.add(new JLabel("Number 2:"));
	    myPanel.add(inputNumber2);

	    int result = JOptionPane.showConfirmDialog(null, myPanel, 
	             "Please Enter Number Values", JOptionPane.OK_CANCEL_OPTION);
	    if (result == JOptionPane.OK_OPTION) {
	         System.out.println("Number 1: " + inputNumber1.getText());
	         System.out.println("Number 2: " + inputNumber2.getText());
	      }
	    int intValue1 = Integer.parseInt(inputNumber1.getText());
	    int intValue2 = Integer.parseInt(inputNumber2.getText());
	    
	    
	    int[] intArray = {intValue1, intValue2};
	    return intArray;
		
		
	}
	public static int getValue(){
		String inputNumber = JOptionPane.showInputDialog("Hello " + getName() + ", Please input a number to square:");
		int _value = Integer.parseInt(inputNumber);
		return _value*_value;
	}
	
	public static String showName(String name) {
		JOptionPane.showMessageDialog(null, name);
		return name;
	}
	
	public static String returnChoices(){
		String[] operations = {"Divide", "Multiply", "Addition", "Subtraction"};
	    String operationChoice = (String) JOptionPane.showInputDialog(null, "Operation Choice", "Please choose an Operation",
	    JOptionPane.QUESTION_MESSAGE, null, operations, operations[0]);
		return operationChoice;
	}
	
	public static int divideNumbers(int n1, int n2){
		
		if (n2 == 0){
			JOptionPane.showMessageDialog(null, "#DIV0 ERROR, please change the second number");
		} 
		return (n1/n2) ;
	}
	
	
	public static int multiplyNumbers(int n1, int n2){
		
		return (n1*n2);
	}
	
	
	public static int addNumbers(int n1, int n2){
		
		return (n1 + n2);
	}
	
	public static int subtractNumbers(int n1, int n2){
		
		return (n1 - n2);
	}
	
	

} //End of Class

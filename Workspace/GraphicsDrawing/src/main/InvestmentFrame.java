package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InvestmentFrame extends JFrame
{
	private static final long serialVersionUID = 1L;
	private static final int FRAME_WIDTH = 650;
	private static final int FRAME_HEIGHT = 300;
	private static final int AREA_ROWS = 10;
	private static final int AREA_COLUMNS = 30;
	
	private static final double DEFAULT_RATE = 5;
	private static final double INITIAL_BALANCE = 0;
	
	private JLabel rateLabel;
	private JTextField rateField;
	private JLabel principalLabel;
	private JTextField principalField;
	
	private JButton button;
	
	private JTextArea resultArea;
	private JPanel panel;
	private TemperatureAccount temp;
	
	public InvestmentFrame()
	{
		temp = new TemperatureAccount (INITIAL_BALANCE);
		//resultLabel = new JLabel("Balance: " + account.getBalance());
		resultArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
		resultArea.setEditable(false);
		
		createTextField();
		createButton();
		createPanel();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	private void createTextField()
	{
		final int FIELD_WIDTH = 10;
		rateLabel = new JLabel("Interest Rate: ");
		rateField = new JTextField(FIELD_WIDTH);
		
		principalLabel = new JLabel("Temperature in Celcius: ");
		principalField = new JTextField(FIELD_WIDTH);
		
		rateField.setText("" + DEFAULT_RATE);
	}
	
	private void createButton()
	{
		button = new JButton("Convert To Farenheight"); //CREATE A BUTTON
		class AddInterestListener implements ActionListener //CREATE A CLASS THAT PERFORMS AN ACTION
		{
			public void actionPerformed(ActionEvent event)
			{
				if(!principalField.getText().equals(""))
				{
					//System.out.println(principalField.getText());
					temp.setCelcius(Double.parseDouble(principalField.getText() ) );
					double fh = temp.convertToF(temp.getCelcius());
					
					resultArea.append(String.format("Celcius: %10.2f, Farenheight: %10.2f \n", temp.getCelcius(), fh) );
					//principalField.setText("");
				}
				//double c = Double.parseDouble(rateField.getText());
				
				
			}//END OF ACTIONPERFORMED
			
		}//END OF INNER CLASS
		
		ActionListener listener = new AddInterestListener(); //CREATE AN OBJECT TO PERFORM AN ACTION
		button.addActionListener(listener);//USE THE OBJECT ON THE BUTTON
	}
	
	private void createPanel()
	{
		panel = new JPanel();
		JScrollPane scrollPane = new JScrollPane (resultArea);
		
		//GOING THROUGH THE ARRAY AND ADDING COMPONENTS TO THE PANEL
		JComponent[] anArray = {principalLabel, principalField, /*rateLabel, rateField,*/ button, scrollPane};
		for(int i = 0; i < anArray.length; i++)
		{
			panel.add(anArray[i]);
		}
		add(panel);//FINALLY CREATING THE PANEL
	}
	
}

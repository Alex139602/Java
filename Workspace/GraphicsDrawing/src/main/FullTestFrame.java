package main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FullTestFrame extends JFrame {
	
	public static final int STARTING_VALUE = 1000;
	public static final double BASE_INTEREST_RATE = Math.E;
	private static String STRING_APP_TITLE = "Processing text input";
	public JButton button;
	public JLabel interestLabel;
	public JTextArea textArea;
	public JLabel balanceLabel = createBalanceLabel();
	public static double balance = 1000;
	public static JPanel panel;
	public final int FIELD_WIDTH = 10;
	public final JTextField rateField = new JTextField(FIELD_WIDTH);
	
	public final JComponent panelArray[] = new JComponent[]{button, interestLabel, balanceLabel, rateField }; 
	
	public static void main(String[] args) throws Exception
	{
		FullTestFrame frame = new FullTestFrame();
		Dimension dimens = new Dimension( 800, 800 );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setSize( dimens );
		frame.setTitle( STRING_APP_TITLE );
		
		frame.createButton();
		frame.createBalanceLabel();
		frame.createInterestLabel();

		frame.createTextArea();
		
		frame.createPanel();
		
		frame.setVisible(true);
	}
	
	private void createTextArea() 
	{
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setSize(400, 400);
		textArea.setVisible(true);
		System.out.println(textArea);
	}

	private void createButton()
	{
		button = new JButton("Add Interest");
		class AddInterestListener implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("got to here");
				if ( !rateField.getText().equals("") ) {
					double rate = Double.parseDouble(rateField.getText());
					//System.out.println(Double.toString(rate));
					double interest = FullTestFrame.getBalance() * rate / 1000;
					//System.out.println(interest);
					FullTestFrame.balance += interest;
					//rateField.setText(Double.toString(FullTestFrame.balance));
					
				} else {
						try {
							throw new Exception("Rate Field Empty!");
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							//e1.printStackTrace();
						}
				}
				
			}

			
			
		}
		AddInterestListener l = new AddInterestListener();
		button.addActionListener(l);
		
	}

	public static double getBalance() {
		return FullTestFrame.balance;
	}
	
	public static void setBalance(double balance){
		FullTestFrame.balance = balance;
	}

	private void createInterestLabel()
	{
		interestLabel = new JLabel("Interest Rate: ");
	}

	private JLabel createBalanceLabel()
	{
		return new JLabel("Balance: " + FullTestFrame.balance);
	}
	
	private void createPanel()
	{
		panel = new JPanel();
		panel.add(button);
		panel.add(interestLabel);
		panel.add(rateField);
		panel.add(balanceLabel);
		
		panel.add(textArea);
		
		add(panel);
	}
	

}

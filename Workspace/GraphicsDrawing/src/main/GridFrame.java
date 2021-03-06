package main;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GridFrame extends JFrame {
	

	public static int GRID_ROWS = 4;
	public static int GRID_COLS = 3;
	
	
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setBounds(50, 50, 300, 300);
		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Layout test"); 
		
		
		JPanel keypadPanel = new JPanel();
		keypadPanel.setLayout(new BorderLayout());
		
		final JTextField display = new JTextField(); // MUST BE FINAL FOR THE INNER CLASS TO USE IT
		display.setEditable(false);
		
		class ButtonListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Button temp = (Button) e.getSource();
				display.setText(temp.getLabel());
			}
			
		}
		ButtonListener bl =  new ButtonListener();
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(GRID_ROWS, GRID_COLS));
		
		String buttonArr[] = new String[]{"7", "8", "9","4", "5", "6","1", "2", "3", "0", ".", "CE"}; 
		for (int i = 0; i < buttonArr.length; i++) 
		{
			Button btn = new Button(buttonArr[i]);
			btn.addActionListener(bl);
			buttonPanel.add(btn);
		}
		
		keypadPanel.add(display, BorderLayout.NORTH);
		
		keypadPanel.add(buttonPanel, BorderLayout.CENTER);
		
		
		frame.add(keypadPanel);
		
		
		
		frame.setVisible(true);
	}

}

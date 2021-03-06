package main;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

@SuppressWarnings("serial")
public class FontViewerFrame extends JFrame 
{

	public static final int SIZE_SMALL = 24;
	public static final int SIZE_MEDIUM = 36;
	public static final int SIZE_LARGE = 48;
	public static final int FRAME_WIDTH = 300;
	public static final int FRAME_HEIGHT = 400;
	
	private JLabel samepleField;
	private JCheckBox italicCheckBox;
	private JCheckBox boldCheckBox;
	private JRadioButton smallButton, mediumButton, largeButton;
	private JComboBox facenameCombo;
	private ActionListener listener;
	
	public FontViewerFrame()
	{
		samepleField = new JLabel("Big Java");
		add(samepleField, BorderLayout.CENTER);
		
		class ChoiceListener implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setSampleFont();
			}
		}
		listener = new ChoiceListener();
		this.createControlPanel();
		this.setSampleFont();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	private void setSampleFont() 
	{
		
	}
	
	private void createControlPanel() 
	{
		JPanel facenamePanel = createComboBox();
		JPanel sizeGroupPanel = createCheckBoxes();
		JPanel styleGroupPanel = createRadioButtons();
		
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout());
		
	}
	
	private JPanel createRadioButtons() 
	{
		return null;
	}

	private JPanel createCheckBoxes() 
	{
		return null;
	}

	private JPanel createComboBox() 
	{
		return null;
	}

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setBounds(50, 50, 300, 300);
		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Layout test"); 
		
		// make radio buttons 
		//smallButton = new JRadioButton("Small"), mediumButton = new JRadioButton("Medium"), largeButton = new JRadioButton("Large");
		/*JRadioButton[] buttonRay = new JRadioButton[]{smallButton, mediumButton, largeButton}; 
		ButtonGroup group = new ButtonGroup();
		for (JRadioButton b : buttonRay) {
			group.add(b);
		}*/
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBorder(new EtchedBorder());
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
		
		ButtonListener bl = new ButtonListener();
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		frame.setVisible(true);
	}
	
	
} // end of class

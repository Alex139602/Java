package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ClickListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try{
			Field fields[] = e.getClass().getDeclaredFields();
			for (int i=0; i<fields.length; i++)
			{
				fields[i].setAccessible(true);
			    System.out.println(fields[i].getName() + " - " + fields[i].get(e));
			}
			
		} catch(IllegalArgumentException ex1){
			// ignore
		} catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println(e.getSource());
		System.out.println(e.getActionCommand());
		System.out.println(e.getModifiers());
		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setSize(300, 300);
		JLabel label = new JLabel();
		if (e.getActionCommand() == "I am good") {
			label.setText("Good Button Clicked!");
		} else if (e.getActionCommand() == "I am bad") {
			label.setText("Bad Button Clicked");
		} else {
			label.setText("No button clicked");
		}
		label.setVerticalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(label);
		frame.setVisible(true);
	}

}

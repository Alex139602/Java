package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class TestFrame extends JFrame {
	
	public static JLabel l;
	
	public static final double INTEREST_RATE = Math.E;
	
	public static final double STARTING_BALANCE = 1000;
	
	public static double NOW_BALANCE;
	
	/*public static void alert(String s){
		Date now = new Date();
		TestFrame f1 = new TestFrame();
		JLabel label = new JLabel();
		label.setText(s);
		label.setVerticalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		f1.setSize(300, 300);
		f1.setResizable(false);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
		System.out.println(now.toString());
		while (new Date().getTime() - now.getTime() > 7000 ) {
			f1.dispatchEvent(new WindowEvent(f1, WindowEvent.WINDOW_CLOSING));
			
		}
	}*/
	
	public static void main(String[] args) {
		TestFrame s1 = new TestFrame();
		//s1.setLocationRelativeTo(null);
		s1.setSize(400, 150);
		s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s1.setTitle("Bank Balance");
		
		
		JButton button1 = new JButton("Add Interest");
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel();
		label1.setText(Double.toString(TestFrame.STARTING_BALANCE));
		TestFrame.l = label1;
		class MyListener implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				TestFrame.updateBalance(TestFrame.l);
			}
		};
		
		MyListener l = new MyListener();
		button1.addActionListener(l);
		
		panel1.add(button1);
		panel1.add(label1);
		s1.add(panel1);
		s1.setVisible(true);
		
	}
	
	public static double updateBalance(JLabel l){
		/*if (TestFrame.NOW_BALANCE != TestFrame.STARTING_BALANCE) {
			TestFrame.NOW_BALANCE *= TestFrame.INTEREST_RATE;
		} else {
			TestFrame.NOW_BALANCE = TestFrame.STARTING_BALANCE;
			TestFrame.NOW_BALANCE *= TestFrame.INTEREST_RATE;
		}*/
		TestFrame.NOW_BALANCE = 
		l.setText(Double.toString(TestFrame.NOW_BALANCE));
		System.out.println("updated information");
		return TestFrame.NOW_BALANCE;
	}

}

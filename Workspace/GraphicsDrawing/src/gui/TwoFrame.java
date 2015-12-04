package gui;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.Timer;

@SuppressWarnings("serial")
public class TwoFrame extends JFrame {
	
	public static final int FRAME_SIZE = 400;
	
	public static int DELAY = 100;
	
	public static void main(String[] args) {
		final TwoFrame tf = new TwoFrame();
		tf.setSize(FRAME_SIZE, FRAME_SIZE);
		tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tf.setTitle("Bank Balance");
		
		RectangleSecondComponent component = new RectangleSecondComponent();
		
		
		
		class TimerListener implements ActionListener{
			
			private int x = 0, y = 0 ;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (x > ( tf.getHeight() - 20 ) || y > (tf.getWidth() - 20) ) {
					
				}
			}
		};
		ActionListener tl = new TimerListener();

		tf.add(component);
		Timer t = new Timer(DELAY, tl);
		
		t.start();
		tf.setVisible(true);
		
	}
}

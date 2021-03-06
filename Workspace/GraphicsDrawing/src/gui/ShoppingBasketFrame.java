package gui;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class ShoppingBasketFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1136717941919517633L;
	
	public static long getSeriealVersionUID(){return ShoppingBasketFrame.serialVersionUID;}
	
	public static void main(String[] args) {
		ShoppingBasketFrame s1 = new ShoppingBasketFrame();
		s1.setLocationRelativeTo(null);
		s1.setSize(400, 400);
		s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s1.setTitle("Hello World!");
		s1.setLayout(new GridLayout());
		JButton button1 = new JButton();
		button1.setText("I am good");

		JButton button2 = new JButton();
		button2.setText("I am bad");
		s1.add(button1);
		s1.add(button2);
		ActionListener buttonListener = new ClickListener();
		button1.addActionListener(buttonListener);
		button2.addActionListener(buttonListener);
		
		s1.setVisible(true);
	}

}

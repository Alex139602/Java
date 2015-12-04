package gui;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
@SuppressWarnings({ "unused", "serial" })

public class MouseFrame extends JFrame {
	public static int FRAME_SIZE = 800;
	public static void main(String[] args) {
		MouseFrame m = new MouseFrame();
		m.setSize(FRAME_SIZE, FRAME_SIZE);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setTitle("Bank Balance");
		
		final ShapeComponent comp = new ShapeComponent();
		
		class ShoppingMouseListener extends MouseAdapter  
		{	
			public void mouseClicked(MouseEvent e) 
			{
				int x = e.getX(), y = e.getY();
				
				System.out.println(e.getButton());
			}
			
		}
		
		
		m.setVisible(true);
	}

}

package gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShoppingMouseListener extends MouseAdapter  
{	
	public void mouseClicked(MouseEvent e) 
	{
		int x = e.getX(), y = e.getY();
		
		System.out.println(e.getButton());
	}
	
	

}

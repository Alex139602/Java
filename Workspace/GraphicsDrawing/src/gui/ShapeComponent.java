package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class ShapeComponent extends JComponent {
	
	@Override
	public void paintComponent(Graphics g) 
	{
		Graphics2D g2d = (Graphics2D) g;
		Rectangle box = new Rectangle(10, 10, 15, 15);
		
		g2d.setColor(new Color(255, 128, 222));
		g2d.draw(box);
	}
	
	public void moveBy(){
		
	}
	
}

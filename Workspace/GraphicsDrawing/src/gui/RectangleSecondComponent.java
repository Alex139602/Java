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
public class RectangleSecondComponent extends JComponent {
	
	private Rectangle box;
	
	public RectangleSecondComponent(){
		box = new Rectangle(0, 0, 10, 10);
	}
	
	public RectangleSecondComponent(int x, int y){
		box = new Rectangle(x,y,0,0);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		// Get Graphics2D
		Graphics2D g2d = (Graphics2D) g;
		RectangleSecondComponent r = new RectangleSecondComponent();
		g2d.draw(box);
	}
}

package gui;

import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

@SuppressWarnings("serial")
public class RectangleComponent extends JComponent {
	
	@Override
	public void paintComponent(Graphics g) {
		
		// Get Graphics2D
		Graphics2D g2d = (Graphics2D) g;
		Rectangle box = new Rectangle(5, 10, 15, 20);
		g2d.setColor(new Color(255, 128, 222));
		g2d.draw(box);
		box.translate(10, 30); // move shape and redraw box. cannot call Rectangle box2 = box.translate() as translate() returns void
		g2d.draw(box);
		Ellipse2D comp2 = new Ellipse2D.Double(30, 100, 140, 220);
		
		Point2D from = new Point2D.Double(30, 90);
		Point2D to = new Point2D.Double(300, 320);
		Line2D comp3 = new Line2D.Double(from, to);
		g2d.draw(comp2);
		g2d.draw(comp3);

		double diffX = Math.abs(from.getX() - to.getX());
		double diffY = Math.abs(from.getY() - to.getY());
		System.out.println(String.format("diffX = %3.2f, diffY = %3.2f", diffX, diffY));
		double pythag = Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
		g2d.drawString(String.format("Line Length = %3.3f", pythag), 200, 20);
		
		
		
	}

}

package java_0801;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Java2D_4 extends Frame {
	
	Rectangle2D.Double rect;
	
	public Java2D_4(String title) {
		super(title);
		
		rect = new Rectangle2D.Double(300, 50, 100, 150);
		
		setSize(800, 800);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.draw(rect);
		g2.translate(200, -10);
		g2.rotate(Math.PI/6);
		
		g2.setColor(new Color(178,235,244));
		g2.fill(rect);

		g2.translate(200, 50);
		g2.rotate(Math.PI/8);
		
		g2.setColor(new Color(255,205,18));
		g2.fill(rect);
		
		g2.translate(200, 50);
		g2.rotate(Math.PI/10);
		
		g2.setColor(new Color(255,150,150));
		g2.fill(rect);
		
		g2.translate(200, 50);
		g2.rotate(Math.PI/12);
		
		g2.setColor(new Color(150,255,150));
		g2.fill(rect);
		
		g2.translate(200, 50);
		g2.rotate(Math.PI/14);
		
		g2.setColor(new Color(150,150,255));
		g2.fill(rect);
		
		g2.translate(200, 50);
		g2.rotate(Math.PI/16);
		
		g2.setColor(new Color(255,150,255));
		g2.fill(rect);
		
		g2.translate(200, 50);
		g2.rotate(Math.PI/18);
		
		g2.setColor(new Color(150,255,255));
		g2.fill(rect);
		
		g2.translate(200, 50);
		g2.rotate(Math.PI/20);
		
		g2.setColor(new Color(255,255,150));
		g2.fill(rect);
		
	}
	
	public static void main(String[] args) {
		new Java2D_4("2D Test");
	}

}

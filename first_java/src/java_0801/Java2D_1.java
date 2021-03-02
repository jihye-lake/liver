package java_0801;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Java2D_1 extends Frame {
	
	Rectangle2D.Double rect;
	Ellipse2D.Double circle;
	Line2D.Double line, line1;
	
	public Java2D_1(String title) {
		super(title);
		
		rect = new Rectangle2D.Double(20, 50, 250, 200);
		circle = new Ellipse2D.Double(50, 50, 200, 200);
		line = new Line2D.Double(20.9, 50.8, 270.4, 251.2);  // 숫자를 실수값으로 쓸 수도 있음
		line1 = new Line2D.Double(270, 50, 20, 250);  // 숫자를 실수값으로 쓸 수도 있음
		
		setSize(350, 350);
		setVisible(true);
		
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(new Color(255,205,18));
		g2.draw(rect);
		
		g2.setColor(new Color(20,30,40));
		g2.fill(circle);
		
		g2.setColor(new Color(16,98,10));
		g2.draw(line);
		
		g2.setColor(new Color(16,98,10));
		g2.draw(line1);
	}
	
	public static void main(String[] args) {
		new Java2D_1("2D Test");
	}

}

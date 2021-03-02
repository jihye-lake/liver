package java_0801;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Java2D_2 extends Frame {
	
	Rectangle2D.Double rect;
	Ellipse2D.Double circle;
	Line2D.Double line;
	
	float[] pattern = {30,50,10,25,10};  // 이 패턴으로 계속 반복된다는 뜻(line 이)
	float[] pattern1 = {50,40,50,40,50};  // 이 패턴으로 계속 반복된다는 뜻(line 이)
	float[] pattern2 = {10,10,10,10,10};  // 이 패턴으로 계속 반복된다는 뜻(line 이)
	
	public Java2D_2(String title) {
		super(title);
		
		rect = new Rectangle2D.Double(40, 70, 250, 200);
		circle = new Ellipse2D.Double(70, 70, 200, 200);
		line = new Line2D.Double(44.4, 73.3, 311.7, 289.1);
		
		setSize(350, 350);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setStroke(new BasicStroke(4,BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, pattern2, 0));  // BasicStroke(4) 은 선의 굵기
		g2.setColor(new Color(0,51,153));
		g2.draw(rect);

		g2.setStroke(new BasicStroke(8,BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, pattern1, 0));
		g2.setColor(new Color(207,144,255));
		g2.draw(circle);

		g2.setStroke(new BasicStroke(100,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,10,pattern,0));
		g2.setColor(new Color(171,242,0));
		g2.draw(line);
	}
	
	public static void main(String[] args) {
		new Java2D_2("2D Test");
	}

}

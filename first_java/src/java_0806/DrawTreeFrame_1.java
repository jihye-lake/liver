package java_0806;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class DrawTreeFrame_1 extends JFrame {
	
	public DrawTreeFrame_1() {
		setSize(1200, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
			
	}
	
	
	private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {  // depth  는 몇 갈래로 갈라지게 할 거냐
		if (depth == 0)
			return;
		
		int xx1 = (int)(Math.random()*25);
		int yy1 = (int)(Math.random()*25);
		
		int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * xx1);  // cos sin 으로 각도를 만들어주는 것임
		int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * yy1);
		
		g.drawLine(x1, y1, x2, y2);  // x1 부터 시작해서 x2 까지 그림을 그린다
		drawTree(g, x2, y2, angle - 30, depth - 1);
		drawTree(g, x2, y2, angle - 25, depth - 1);
//		drawTree(g, x2, y2, angle + 30, depth - 1);
		drawTree(g, x2, y2, angle + 25, depth - 1);
		
	}
	
	public void paint(Graphics g) {
		g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
		drawTree(g, 600, 900, -90, 10);
	}
	
	public static void main(String[] args) {
		new DrawTreeFrame_1();
	}

}
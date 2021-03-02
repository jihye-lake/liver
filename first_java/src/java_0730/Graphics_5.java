package java_0730;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graphics_5 extends Frame {
	
	public Graphics_5(String title) {
		super(title);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
			
		});
		
		XCanvas_2 grr = new XCanvas_2();
		
		grr.setSize(300,300);
		
		add("Center", grr);
		
		setSize(350, 350);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Graphics_5("Graphics Test");
	}

}

class XCanvas_2 extends Canvas {
	
	public void paint(Graphics g) {
		for (int i = 0, j = 255; i < 256; i++, j--) {
			
			g.setColor(new Color(i,j,0));
			
			g.drawLine(15, 15, 256-i,  10+i);
			
		}
	}
	
}
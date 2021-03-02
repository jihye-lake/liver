package java_0731;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class XCanvas_2 extends Canvas {
	
	Font font = new Font("Timesroman", Font.ITALIC, 30);
	
	String str = "빨주노초파남보";
	
	Color[] color = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.cyan, Color.magenta};
	
	public void paint(Graphics g) {
		g.setFont(font);
		
		for (int i = 0; i < 7; i++) {
			g.setColor(new Color(255,205,18));
			g.drawString(str.charAt(i) + " ", (i*30 + 25), 125);
			
			g.setColor(new Color(0,51,153));
			g.drawString(str.charAt(i) + " ", (i*30 + 20), 120);
			
			g.setColor(new Color(178,235,244));
			g.drawString(str.charAt(i) + " ", (i*30 + 15), 115);
			
			g.setColor(new Color(207,144,255));
			g.drawString(str.charAt(i) + " ", (i*30 + 10), 110);
			
			g.setColor(Color.gray);
			g.drawString(str.charAt(i) + " ", (i*30 + 5), 105);
			
			g.setColor(color[i]);
			g.drawString(str.charAt(i) + " ", (i*30), 100);
			
		}
	}

}

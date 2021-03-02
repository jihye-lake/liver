package java_0731;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Font_2 {
	public static void main(String[] args) {
		XCanvas_1 canvas = new XCanvas_1();
		Frame ff = new Frame("Font Test!");
		ff.add(canvas);
		ff.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
		});
		ff.setSize(300,300);
		ff.setVisible(true);
	}
}
class XCanvas_1 extends Canvas{
	Font font_1 = null;
 
 public void paint(Graphics g) {
	 font_1 = new Font("Timesroman", Font.PLAIN, 30);
	 g.setFont(font_1);
	 FontMetrics fonts = g.getFontMetrics(font_1);
  
	 int ascent = fonts.getAscent();         //머리선
	 int descent = fonts.getDescent();        //꼬리선
  
	 g.setColor(new Color(255,20,20));        //기준선
	 g.drawLine(0, 100, 270, 100);
  
	 g.setColor(new Color(20,20,255));
	 g.drawString("Java Programming", 10, 100);
  
	 g.setColor(new Color(250,150,150));
	 g.drawLine(0, 100-ascent, 270, 100-ascent);
  
	 g.setColor(new Color(20,255,20));
	 g.drawLine(0, 100+descent, 270, 100+descent);
  
  
 }
}
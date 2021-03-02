package java_0801;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

public class Java2D_6_1 extends Frame {
	
	TexturePaint texture;
	BufferedImage bImg;
	Ellipse2D.Double circle;
	
	public Java2D_6_1(String title) {
		super(title);
		
		Image img = Toolkit.getDefaultToolkit().getImage("bttrfly1.png");
		MediaTracker mt = new MediaTracker(this);
		
		mt.addImage(img, 0);
		
		try {
			mt.waitForAll();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		bImg = new BufferedImage(img.getWidth(this), img.getHeight(this), BufferedImage.TYPE_3BYTE_BGR);
		
		Graphics2D g2 = bImg.createGraphics();
		
		g2.drawImage(img, 0, 0, this);
		
		Rectangle circle2 = new Rectangle(0, 0, img.getWidth(this),img.getHeight(this));
		
		texture = new TexturePaint(bImg, circle2);
		
		circle = new Ellipse2D.Double(50, 50, 300, 300);
		
		setSize(400, 400);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setPaint(texture);
		g2.fill(circle);
		
		g2.translate(200, 210);
		g2.setColor(new Color(178,235,244));
		g2.setFont(new Font("Serif", Font.ITALIC, 27));
		
		for (int i = 0; i < 16; i++) {
			
			g2.rotate(Math.PI/6);
//			g2.rotate(80);
			g2.drawString("      New Zealand", 0, 0);
			
		}
	}
	
	public static void main(String[] args) {
		new Java2D_6_1("2D Test");
	}

}
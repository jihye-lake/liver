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
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class Java2D_6 extends Frame {
	
	TexturePaint texture;
	BufferedImage bImg;
	Rectangle2D.Double rect;
	
	public Java2D_6(String title) {
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
		
		Rectangle rect2 = new Rectangle(0, 0, img.getWidth(this),img.getHeight(this));
		
		texture = new TexturePaint(bImg, rect2);
		
		rect = new Rectangle2D.Double(0, 0, 300, 300);		
		
		setSize(350, 350);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setPaint(texture);
		g2.fill(rect);
		
		g2.translate(150, 150);
		g2.setColor(new Color(178,235,244));
		g2.setFont(new Font("Serif", Font.ITALIC, 25));
		
		for (int i = 0; i < 8; i++) {
			
			g2.rotate(Math.PI/4);
			g2.drawString("       New Zealand", 0, 0);
			
		}
	}
	
	public static void main(String[] args) {
		new Java2D_6("2D Test");
	}

}

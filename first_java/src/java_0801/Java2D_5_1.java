package java_0801;

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

public class Java2D_5_1 extends Frame {
	
	TexturePaint texture, texture1;
	BufferedImage bImg, bImg1;
	Ellipse2D.Double circle, circle1;
	Image img, img1;
	
	public Java2D_5_1(String title) {
		super(title);
		
		img = Toolkit.getDefaultToolkit().getImage("bttrfly1.png");
		img1 = Toolkit.getDefaultToolkit().getImage("bttrfly2.png");
		MediaTracker mt = new MediaTracker(this);
//		MediaTracker 클래스는 이미지 로딩이 성공적으로 완료되도록 처리한다.
//		배치되는 형태와 비슷한 역할을 함.
		
		mt.addImage(img, 0);
		mt.addImage(img1, 0);
		
		try {
			mt.waitForAll();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		bImg = new BufferedImage(img.getWidth(this),img.getHeight(this),BufferedImage.TYPE_3BYTE_BGR);
		bImg1 = new BufferedImage(img1.getWidth(this),img1.getHeight(this),BufferedImage.TYPE_3BYTE_BGR);
		
		Graphics2D g2 = bImg.createGraphics();
		Graphics2D g3 = bImg1.createGraphics();
		
		g2.drawImage(img, 0, 0, this);
		g3.drawImage(img1, 0, 0, this);
		
		Rectangle rect = new Rectangle(0, 0, img.getWidth(this), img.getHeight(this));
		Rectangle rect1 = new Rectangle(0, 0, img1.getWidth(this), img1.getHeight(this));
		
		texture = new TexturePaint(bImg, rect);
		circle = new Ellipse2D.Double(60, 140, 230, 230);
		
		texture1 = new TexturePaint(bImg1, rect1);
		circle1 = new Ellipse2D.Double(350, 140, 230, 230);
		
		setSize(650, 500);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;		
		g2.setPaint(texture);
		g2.fill(circle);
		
		Graphics2D g3 = (Graphics2D) g;		
		g3.setPaint(texture1);
		g3.fill(circle1);
	}
	
	public static void main(String[] args) {
		new Java2D_5_1("2D Test");
	}

}
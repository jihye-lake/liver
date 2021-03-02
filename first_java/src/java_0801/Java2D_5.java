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

public class Java2D_5 extends Frame {
	
	TexturePaint texture;
	BufferedImage bImg;
	Ellipse2D.Double circle;
	
	public Java2D_5(String title) {
		super(title);
		
		Image img = Toolkit.getDefaultToolkit().getImage("bttrfly1.png");
		MediaTracker mt = new MediaTracker(this);
//		MediaTracker 클래스는 이미지 로딩이 성공적으로 완료되도록 처리한다.
//		배치되는 형태와 비슷한 역할을 함.
		
		mt.addImage(img, 0);
		
		try {
			mt.waitForAll();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		bImg = new BufferedImage(img.getWidth(this),img.getHeight(this),BufferedImage.TYPE_3BYTE_BGR);
		
		Graphics2D g2 = bImg.createGraphics();
		
		g2.drawImage(img, 0, 0, this);
		
		Rectangle rect = new Rectangle(0, 0, img.getWidth(this), img.getHeight(this));
		
		texture = new TexturePaint(bImg, rect);
		circle = new Ellipse2D.Double(60, 140, 230, 230);
		
		setSize(350, 500);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;		
		g2.setPaint(texture);
		g2.fill(circle);
	}
	
	public static void main(String[] args) {
		new Java2D_5("2D Test");
	}

}

package java_0731;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Image_1 extends Frame {
	
	Image img, img_2;
	
//	String ss = "Daniel_1.jpg";
	String ss = "src\\images\\Daniel_1.jpg";  // ��θ� ������ٸ� �� ��δ�� ������� ��
	String ss_1 = "src\\images\\combat.jpg";  // ��θ� ������ٸ� �� ��δ�� ������� ��
//	String ss = "src/images/Daniel_1.jpg";  // ������ ���(�̰͵� ��)
//	String ss_1 = "src/images/combat.jpg";  // ������ ���(�̰͵� ��)
	
	public Image_1(String title) {
		super(title);
		
		img = Toolkit.getDefaultToolkit().getImage(ss);
		img_2 = Toolkit.getDefaultToolkit().getImage(ss_1);
		
		addWindowListener(new Handler());
		
		setSize(700, 550);
		setVisible(true);
		
	}
	
	public void paint(Graphics g) {
		g.drawImage(img,10,30,this);
		g.drawImage(img_2,450,200,this);
	}
	
	class Handler extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new Image_1("Image Test");
		
	}

}


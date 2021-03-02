package java_0731;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Scrollbar;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Animation_1 extends Frame {
	
	Image[] img = new Image[8];
	Image[] img1 = new Image[8];
	Image[] img2 = new Image[8];
	Image[] img3 = new Image[8];
	int num = 0;
	int num1 = 0;
	int num2 = 0;
	static int move = 0;
	static int move1 = 0;
//	static int move2 = 0;
//	static int move3 = 0;
	boolean turn = true;
	int a;
	
	public Animation_1(String title) {
		super(title);
		
		for (int i = 0; i < 8; i++) {
			img[i] = Toolkit.getDefaultToolkit().getImage("bttrfly" +(i+1)+ ".png");  // bttrfly 에 대한 파일을 전부 불러올 수 있음
			img1[i] = Toolkit.getDefaultToolkit().getImage("bttrfly" +(i+1)+ ".png");  // bttrfly 에 대한 파일을 전부 불러올 수 있음
			img2[i] = Toolkit.getDefaultToolkit().getImage("bttrfly" +(i+1)+ ".png");  // bttrfly 에 대한 파일을 전부 불러올 수 있음
			img3[i] = Toolkit.getDefaultToolkit().getImage("bttrfly" +(i+1)+ ".png");  // bttrfly 에 대한 파일을 전부 불러올 수 있음
			
		}
		
		addWindowListener(new WindowHandler());
		setSize(500,500);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		if (num > 7) { num = 0; }
		if (move > 450) turn = !turn; 
		if (move < -20) turn = !turn; 
		if (turn){
			g.drawImage(img[num++], move+=15, 300, this);
			g.drawImage(img2[num++], 150 , move+=15, this);
		} else {
			g.drawImage(img[num++], move-=15, 300, this);
			g.drawImage(img2[num++], 150 , move-=15, this);
		}
		
		if (num1 > 7) { num1 = 0; }
		if (move1 > 450) turn = !turn;
		if (move1 < -20) turn = !turn;
		if (turn){
			g.drawImage(img1[num1++], move1-=15 , 190, this);
			g.drawImage(img3[num1++], 300 , move1-=15, this);
		} else {
			g.drawImage(img1[num1++], move1+=15 , 190, this);
			g.drawImage(img3[num1++], 300 , move1+=15, this);
		}
//		
//		if (num2 > 7) { num2 = 0; }
//		if (move2 > 450) turn = !turn;
//		if (move2 < -20) turn = !turn;
//		if (turn){
////			g.drawImage(img1[num1++], move1-=15 , 190, this);
//			g.drawImage(img3[num2++], 300 , move2-=15, this);
//		} else {
////			g.drawImage(img1[num1++], move2+=15 , 190, this);
//			g.drawImage(img3[num2++], 300 , move2+=15, this);
//		}
		
		
//		if (move > 20) {
//			
//			move = 0;
//		}
		
	}
	
	class WindowHandler extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		Animation_1 ani = new Animation_1("fly");
		
		while (true) {
			
			try {
				
				//move++;
				Thread.sleep(100);
				ani.repaint();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			
		}
	}

}

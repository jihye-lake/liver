package java_0730;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graphics_7 extends Frame implements MouseMotionListener{  // Graphics_6 과 같은 코드
	
	int x = 0;
	int y = 0;
	
	Image img = null;
	Graphics gImg = null;
	
	public Graphics_7(String title) {
		super(title);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		setBounds(100, 100, 500, 500);
		setVisible(true);
		
		img = createImage(500, 500);
		gImg = img.getGraphics();
		gImg.drawString("왼쪽 버튼을 누른 채로 마우스를 움직임", 15, 50);
		repaint();		
	}
	
	public void paint(Graphics g) {
		if (img != null) {
			
			g.drawImage(img,0,5,this);  // 가상 화면에 그려진 그림을 Frame 에 복사
			
		}
	}
	
	public static void main(String[] args) {
		new Graphics_7("Graphics Test");
	}

	@Override
	public void mouseDragged(MouseEvent me) {
		
		if (me.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			
			x = me.getX();
			y = me.getY();
			
			gImg.drawString("*", x, y);
			repaint();
			
		}
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
	

}

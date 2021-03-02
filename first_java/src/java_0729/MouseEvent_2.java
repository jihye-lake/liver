package java_0729;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseEvent_2 extends Frame implements MouseMotionListener{
	
	Label info;
	
	public MouseEvent_2(String title) {
		super(title);
		info = new Label();
		
		add("North", info);
		addMouseMotionListener(this);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseEvent_2("MouseMotion Event Test");
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		info.setText("마우스 드래그");	// 클릭하고서 드래그하면 마우스 드래그가 나옴
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		info.setText(" X = " + e.getX() + " XX = " + e.getXOnScreen() + " , Y = " + e.getY());
								// X 의 좌표				스크린의 좌표(XX)					Y 의 좌표
		
		info.setBackground(new Color(150,220,220));
		setBackground(new Color (e.getX()%255, e.getXOnScreen()%255, e.getY()%255));
	}

}

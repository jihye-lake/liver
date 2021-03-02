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
		info.setText("���콺 �巡��");	// Ŭ���ϰ� �巡���ϸ� ���콺 �巡�װ� ����
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		info.setText(" X = " + e.getX() + " XX = " + e.getXOnScreen() + " , Y = " + e.getY());
								// X �� ��ǥ				��ũ���� ��ǥ(XX)					Y �� ��ǥ
		
		info.setBackground(new Color(150,220,220));
		setBackground(new Color (e.getX()%255, e.getXOnScreen()%255, e.getY()%255));
	}

}

package java_0716;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Button_3_1 extends Frame {
	
	Label[]		lbl		= new Label[500]; //�迭 ����
	Button[]	btn	= new Button[500]; //�迭 ��ư
	
	public Button_3_1(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		for (int i = 0; i < 500; i++) {
			
			lbl[i]		= new Label(i + " ���̺� ");
			btn[i]	= new Button(i + " ��ư ");
			
//			setBackground(new Color((int)((Math.random()*(255-200))+200),(int)((Math.random()*(255-200))+200),(int)(Math.random()*20)));
			lbl[i].setBackground(new Color((int)(Math.random()*100),(int)((Math.random()*(255-160))+160),(int)(Math.random()*80)));
			btn[i].setBackground(new Color((int)(Math.random()*100),(int)((Math.random()*(255-160))+160),(int)(Math.random()*130)));
			//������� (255,255,0) �� R,G��  255�� ������ ������ �ϰ�, B�� 0�� ������ ������ �Ѵ�.
			//160���� 255������ ���ڰ� ����
			
			add(lbl[i]) ; add(btn[i]);
		
			
			
		}
		
		setLocation(1000, 200);
		setSize(500, 500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Button_3_1("�迭 ���̺�, ��ư �����");
	}

}
package java_0719;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class BorderLayout_1 extends Frame{
	
	BorderLayout bbl = new BorderLayout();
	
	public BorderLayout_1(String title) {
		super(title);
		setLayout(bbl); //��� �⺻ Layout �� Border �̱� ������ ������
		
		Button btn = new Button();
//		btn.setBackground(new Color(40,50,60));
		
		add("North", new Button("����")).setBackground(new Color(90,210,230));
		add("West", new Button("����")).setBackground(new Color(0,70,255));
		add("East", new Button("����")).setBackground(new Color(60,50,240));
		add("Center", new Button("�߾�")).setBackground(new Color(60,50,40));  //���ʰ� ������ ������ ���Ͱ� ���� �����ϰ� ��.
		add("South", new Button("����")).setBackground(new Color(240,123,20));
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new BorderLayout_1("BorderLayout Test");
	}

}

package java_0717;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextField_4 extends Frame {
	
	public TextField_4(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		TextArea txt1 = new TextArea("������ �޸� �Է�"); //����� ������ �ָ� �� �������� ��������, �������� ������ ����Ʈ ����� ���´�.
		TextArea txt2 = new TextArea(10, 20);
		TextArea txt3 = new TextArea("���ڿ�, ���ڿ�", 5, 30);
		
		txt1.setBackground(new Color(171,242,0));
		txt2.setBackground(new Color((int)((Math.random()*(256-200))+200), (int)(Math.random()*160), (int)((Math.random()*(256-200))+200)));
		txt3.setBackground(new Color(171,242,0));
		
		add(txt1);
		add(txt2);
		add(txt3);
		
		setLocation(900, 200);
		setSize(500, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TextField_4("�׽�Ʈ ����� �׽�Ʈ");
	}

}

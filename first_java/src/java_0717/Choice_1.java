package java_0717;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Choice_1 extends Frame {  //Choice �� "���ùڽ�"��� ��
	
	public Choice_1(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		Label lbl = new Label("������ �����Ͻÿ�.", Label.CENTER);
		lbl.setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
//		lbl.setForeground(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
		lbl.setForeground(new Color(255,255,255));
		
		Choice choice = new Choice();		
		choice.add("���ѹα�");
		choice.add("ȣ��");
		choice.add("ĳ����");
		choice.add("��Ű");
		choice.add("���þ�");
		choice.add("��������");
		
		add(lbl);  //�����ӿ� ��ġ�ض�
		add(choice);  //�����ӿ� ��ġ�ض�
		
		setLocation(900,200);
		setSize(200, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Choice_1("���ùڽ� �׽�Ʈ");		
	}

}

package java_0717;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.*;

public class Choice_2 extends Frame {
	
	String[] continent = {"�ƽþ�", "����", "�Ƹ޸�ī", "������ī", "�����ƴϾ�"};
//	String[] continent = {};
	String[] country = {"�ѱ�", "������", "ĳ����", "����", "��������"};
	String[] capital = {"����", "�ĸ�", "��Ÿ��", "��ũ��", "������"};
	
	public Choice_2(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		Label lbl1 = new Label("����� �����Ͻÿ�.", Label.CENTER);
		Label lbl2 = new Label("���� �����Ͻÿ�.", Label.CENTER);
		Label lbl3 = new Label("������ �����Ͻÿ�.", Label.CENTER);
		
		lbl1.setBackground(new Color(255,205,18));
		lbl2.setBackground(new Color(0,51,153));
		lbl2.setForeground(new Color(255,245,18));
		lbl3.setBackground(new Color(16,98,10));
		lbl3.setForeground(new Color(255,205,18));
		
		Choice choice1 = new Choice();
		choice1.setBackground(new Color((int)(Math.random()*20), (int)(Math.random()*50), (int)((Math.random()*(255-200))+200)));
		Choice choice2 = new Choice();
		choice2.setBackground(new Color((int)((Math.random()*(255-200))+200), (int)((Math.random()*(255-200))+200), (int)(Math.random()*30)));
		Choice choice3 = new Choice();
		choice3.setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
		
//		choice1.add("�ƽþ�");
//		choice1.add("����");
//		choice1.add("�Ƹ޸�ī");
//		choice1.add("������ī");
//		choice1.add("�����ƴϾ�");
		
		for (int i = 0; i < country.length; i++) {
			choice1.add(continent[i]);
		}
		
		for (int i = 0; i < country.length; i++) {
			choice2.add(country[i]);
		}
		
		for (int i = 0; i < capital.length; i++) {
			choice3.add(capital[i]);
		}

		add(lbl1);  add(choice1);
		add(lbl2);  add(choice2);
		add(lbl3);  add(choice3);
		
		setLocation(900, 300);	
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Choice_2("Choice �׽�Ʈ");
	}

}

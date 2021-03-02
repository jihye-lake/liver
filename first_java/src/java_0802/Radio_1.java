package java_0802;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Radio_1 extends JFrame {  // AWT�� �ߺ��Ǵ� �͸� J ����. �ߺ����� �ʴ� �͵��� J�� ���� �ʴ´�.
	
	JCheckBox win, linux, solaris;
	JRadioButton cat, dog, spider, woman, b, g, a;
	
	public Radio_1(String title) {
		super(title);
		
		getContentPane().setLayout(new FlowLayout());
		win = new JCheckBox("������", false);
		linux = new JCheckBox("������", true);
		solaris = new JCheckBox("�ֶ󸮽�", false);
		
		ButtonGroup group = new ButtonGroup();
		cat = new JRadioButton("�����", false);
		dog = new JRadioButton("��", true);
//		spider = new JRadioButton("�Ź�", true);
		
		ButtonGroup group2 = new ButtonGroup();
		b = new JRadioButton("�ϸ���", true);
		g = new JRadioButton("���ǻ�", true);
		a = new JRadioButton("������", true);
		
		group.add(cat);
		group.add(dog);
//		group.add(spider);
		group.add(b);
		group.add(g);
		group.add(a);
		
		getContentPane().add(win);
		getContentPane().add(linux);
		getContentPane().add(solaris);
		getContentPane().add(cat);
		getContentPane().add(dog);
//		getContentPane().add(spider);
		getContentPane().add(new JLabel("                           "));  // �̷��� �ϸ� ���Ⱑ ��.
		getContentPane().add(b);
		getContentPane().add(g);
		getContentPane().add(a);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Radio_1("CheckBox & Radio Button Test");
	}
	
}

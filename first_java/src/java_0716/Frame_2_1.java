package java_0716;

import java.awt.Color;
import java.awt.Frame;

public class Frame_2_1 extends Frame {
	
//	public Frame_2_1(String str) {
//		super(str);
	public Frame_2_1() {
		super("�������� ���� ������������");  //super �� ���� ���� �;� ��
		setTitle("�������� ���� ������"); // 1������ ������ �̰� ������ super �� ���´�
		setSize(300, 300);
		setVisible(true);
		setBackground(new Color(178, 235, 244));
	}
	
	public static void main(String[] args) {
		
//		new Frame_2_1("�������� ���� ������");
		new Frame_2_1();
		
	}

}
package java_0716;

import java.awt.Frame;

public class Frame_3 extends Frame {  //Frame_2 ����� Frame_3 ����� �� �� �˾ƾ� ��. ��ӹ޴� ����� �ַ� ���� ��
	
		public Frame_3(String str) {
			super(str);  //Frame ������
			setSize(300,300);
			setVisible(true);
		}
		
		public static void main(String[] args) {
			
			new Frame_3("������ ������");
		
	}

}

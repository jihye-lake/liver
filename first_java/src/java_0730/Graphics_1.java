package java_0730;

import java.awt.Frame;
import java.awt.Graphics;

public class Graphics_1 extends Frame {
	
	public Graphics_1(String title) {
		super(title);
		
		setSize(300, 250);
		setVisible(true);
	}
	
	public void paint(Graphics g) {  // paint �� �ڵ�ȣ����(run�� ����������)
		g.drawLine(10, 10, 190, 190);  // 10, 10 �� ������
		g.drawRect(10, 10, 100, 100);  // �簢��
		g.drawOval(55, 55, 100, 100);  // �� 100,100 �� �ȿ��� ���� �׸��ڴٴ� ��
		g.drawArc(100, 100, 80, 80, 0, 90); // 80, 80 �ȿ��� 0������ �����ؼ� 90����ŭ �����ڴٴ� ��
		
	}
	
	public static void main(String[] args) {
		new Graphics_1("Graphics Test");
	}

}

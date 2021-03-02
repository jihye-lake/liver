package java_0717;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;

public class ScrollBar_1 extends Frame {
	
	public ScrollBar_1(String title) {
		super(title);
		Scrollbar srb1 = new Scrollbar(Scrollbar.VERTICAL, 10, 100, 0, 255);  // �������̾ƿ� �̰� ����
																				//10ĭ�� ���� 100���� ��ŭ�� ��ũ�ѹٸ� ������ , ���̴� 0~255�ε� ��ũ�ѹٰ� ������ �� �ִ� ���̴� 255-100�̴�
		Scrollbar srb2 = new Scrollbar(Scrollbar.HORIZONTAL, 100, 50, 0, 255);  //�̰� ����
																				//100ĭ�� ����(100�� ��ġ����) 50���̸�ŭ�� ��ũ�ѹٸ� ������, ������ ��ü ���̴� 0~255�̴�. ��ũ�ѹٴ� 255-50��ŭ ������ �� �ִ�.
		
		add("East", srb1); // ������ �ȿ��� "" �ȿ� ���ڴ� ������ �ޱ� ������ ��ҹ��ڿ� �����ؾ��Ѵ�.
		add("Center", new Label("��ũ�ѹ� �׽�Ʈ"));
		add("North", srb2);
		//�ƹ��͵� �� ���� add �� ��������� �� ���� ������ ��µȴ�.
		
		setLocation(900, 300);
		setSize(200, 200);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new ScrollBar_1("ScrollBar Test");
	}

}

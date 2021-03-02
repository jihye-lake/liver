package java_0719;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayout_1 extends Frame {
	
	FlowLayout fll = new FlowLayout();  // ȭ�鿡 �� ���� �� �ϸ� ���� �Ʒ��� ������ �� �ְ� ��
	Button[] btn = new Button[10];
	
	public FlowLayout_1(String title) {
		super(title);
		setLayout(fll);  // ������ ���Ϳ� ���� �ǰ� ������ �Ǹ鼭 �ϳ��� ���̰� ��
		//Layout �� ���� ������ BorderLayout �ε� �̰� �߰��� ���̰� �ȴ�.
		//BorderLayout �� ������ �������� ��ġ�� ����� �Ѵ�. �ƴϸ� ���Ϳ��� ��ư��� ��� ��ģ��
		
		for (int i = 0; i < 10; i++) {
			btn[i] = new Button(i + "�� ��ư");
			add(btn[i]);			
		}
		
		setBounds(100,100,200,200);  // setLocation + setSize �� ��ģ ��
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new FlowLayout_1("FlowLayout Test");
		
	}

}

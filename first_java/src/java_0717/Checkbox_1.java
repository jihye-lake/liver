package java_0717;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Checkbox_1 extends Frame {
		
		public Checkbox_1(String str) {  // �̰� super(str) ���� ����
			super(str); //������� �� "üũ�ڽ� �׽�Ʈ"�� Frame���� ��
			setLayout(new FlowLayout());
			
			Checkbox cbx_1 = new Checkbox("����", true);  //���߼����� ������ üũ�ڽ�
			Checkbox cbx_2 = new Checkbox("ȣ��"); //���⿡�� true false �ᵵ ��. �׷��� ����Ʈ�� üũ, ��üũ�� �� �� ����.
			
			add(cbx_1);
			add(cbx_2);
			
			setLocation(800, 200);
			setSize(200,200);
			setVisible(true);
			
		}
		
		public static void main(String[] args) {
			new Checkbox_1("üũ�ڽ� �׽�Ʈ"); // => �̰� String str ���� ����
		}
		
	}

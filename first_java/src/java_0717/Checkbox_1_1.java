package java_0717;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Checkbox_1_1 {
	public static void main(String[] args) {
	
	Frame ff = new Frame("üũ�ڽ� �׽�Ʈ");

			ff.setLayout(new FlowLayout());
			
			ff.setLocation(800, 200);
			ff.setSize(200,200);
			ff.setVisible(true);
			
			Checkbox cbx_1 = new Checkbox("����", true);  //���߼����� ������ üũ�ڽ�
			Checkbox cbx_2 = new Checkbox("�쵿"); //���⿡�� true false �ᵵ ��. �׷��� ����Ʈ�� üũ, ��üũ�� �� �� ����.
			Checkbox cbx_3 = new Checkbox("ü��");
			Checkbox cbx_4 = new Checkbox("ī��");
			Checkbox cbx_5 = new Checkbox("���");
			Checkbox cbx_6 = new Checkbox("�̸�");
			
			ff.add(cbx_1);
			ff.add(cbx_2);
			ff.add(cbx_3);
			ff.add(cbx_4);
			ff.add(cbx_5);
			ff.add(cbx_6);
			
			
	}
			
		}
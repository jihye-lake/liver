package java_0718;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("Panel Test");
		
		ff.setLocation(900, 500);
		ff.setSize(450, 350);
		ff.setLayout(null);  // Layout Manager �� ������� �ʴ´�.
		ff.setBackground(new Color(189,189,189));
		
		Panel p1 = new Panel();
		p1.setBackground(new Color(178,235,244));
		p1.setSize(150, 100);
		p1.setLocation(50, 50);  // �������� ��ġ�� ��´�(�𼭸��������� ����, ���� 50 ����
		
		Panel p2 = new Panel();
		p2.setSize(150, 100);
		p2.setLocation(50, 170);
		p2.setBackground(new Color(255,205,18));

		Panel p3 = new Panel();
		p3.setSize(150, 100);
		p3.setLocation(250, 50);
		p3.setBackground(new Color(171,242,0));
	
		Panel p4 = new Panel();
		p4.setSize(150, 100);
		p4.setLocation(250, 170);
		p4.setBackground(new Color(207,144,155));
		
		Button ok = new Button("OK");
		Button cancel = new Button("CANCEL");
		Button CH = new Button("������");
		Button PH = new Button("010-5555-6666");
		
		
		p1.add(ok);
		p2.add(cancel);
		p3.add(CH);
		p4.add(PH);
		ff.add(p1);
		ff.add(p2);
		ff.add(p3);
		ff.add(p4);
		
		ff.setVisible(true);
		
		 // ��ư�� �гο� �ø���, �ٽ� �г��� �����ӿ� ���� �Ŵ�
		
			}

}

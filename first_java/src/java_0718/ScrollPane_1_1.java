package java_0718;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;

public class ScrollPane_1_1 extends Frame{
	
	public ScrollPane_1_1(String title) {
		super(title);
		
		ScrollPane srp = new ScrollPane();
		
		srp.setSize(220, 200);
		
		Panel panel = new Panel();
		Panel panel2 = new Panel();
		panel.setLayout(new BorderLayout());
		
		TextArea txt = new TextArea("�ؽ�Ʈ�����");
		txt.setBackground(new Color(207,144,255));
		
		panel.add("North", new Button("��ư"));
//		panel.add("Center", txt); //TextArea �� �� ������ ù ��° ���
		panel.add("Center", new TextArea("�� ��° ���")).setBackground(new Color(10,20,60)); //TextArea �� �� ������ �� ��° ���
		panel.add("South", new Button("Ȯ��"));
		
		panel2.add("North", new Button("��ư"));
//		panel.add("Center", txt); //TextArea �� �� ������ ù ��° ���
		panel2.add("Center", new TextArea("�� ��° ���")).setBackground(new Color(240,60,50)); //TextArea �� �� ������ �� ��° ���
		panel2.add("South", new Button("Ȯ��"));
		
		srp.add(panel);
		srp.add(panel2);
		
		add("Center", srp);
		
		setLocation(900, 200);
		setSize(200, 200);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new ScrollPane_1_1("ScrollPane Test");
	}

}

package java_0718;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class PanelTest_2 extends Frame {
	
	public PanelTest_2(String title) {
		super(title);
		
		Panel panel1 = new Panel();
		
		panel1.add(new Button("Panel 1 ���� ��ư"));
		panel1.add(new Checkbox("������"));
		
		Panel panel2 = new Panel();
		
		panel2.add(new Label("�󺧶�"));
		panel2.add(new Button("Panel2 ���� ��ư"));
		
		add("North", panel1);  //�гΰ� ��ư�� ��ġ��Ŵ
		add("Center", new Button("��ư"));  //Center �� ������. �����ϰ� ������ Panel �� ���� ����� ��.
		add("South", panel2);
		
		setLocation(900, 500);
		setSize(400, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new PanelTest_2("Panel Test");
	}

}

package java_0718;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class PanelTest_2_2 extends Frame {  // ��ư �� ���� ���� �߾ӿ� ��ġ�ϱ�
															   // setLayout|(null); �� ���ְ�
															   // panel ���ε��� Size �� Location ���ֱ�
															  
		public PanelTest_2_2(String title) {
		super(title);
		setLayout(null);
//		setLocation(900, 200);
		setSize(400, 400);
		setVisible(true);
		setBackground(new Color(230,230,230));
		
		Panel panel1 = new Panel();
		
		panel1.add(new Button("Panel 1 ���� ��ư"));
		panel1.add(new Checkbox("������"));
		panel1.setSize(300, 100);
		panel1.setLocation(50, 40);  //�������� �г� ���� �÷��� ��ġ��Ų��.
//		panel1.setBackground(new Color(207,144,155));
		
		Panel panel2 = new Panel();
		
		panel2.add(new Label("�󺧶�"));
		panel2.add(new Button("Panel2 ���� ��ư"));
		panel2.setSize(300, 100);
		panel2.setLocation(50, 350);  //�������� �г� ���� �÷��� ��ġ��Ų��.
//		panel2.setBackground(new Color(255,205,18));
		
		
		Panel panel3 = new Panel();
		
		panel3.add(new Button("��ư1"));
		panel3.setSize(100, 100);
		panel3.setLocation(50, 150);  //�������� �г� ���� �÷��� ��ġ��Ų��.
//		panel3.setBackground(new Color(0,51,153));
		
		Panel panel4 = new Panel();
		
		panel4.add(new Button("��ư2"));
		panel4.setSize(100, 100);
		panel4.setLocation(150, 150);  //�������� �г� ���� �÷��� ��ġ��Ų��.
		
		
		add(panel1);  //�гΰ� ��ư�� ��ġ��Ŵ
//		add("Center", new Button("��ư"));  //Center �� ������. �����ϰ� ������ Panel �� ���� ����� ��.
		add(panel2);
		add(panel3);
		add(panel4);
		
		
	}
	
	public static void main(String[] args) {
		new PanelTest_2_2("Panel Test");
	}

}
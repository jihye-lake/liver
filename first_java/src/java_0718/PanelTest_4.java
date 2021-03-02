package java_0718;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class PanelTest_4 extends Frame{
	
	public PanelTest_4(String title) {  // �����ӿ� ��ġ�� ȭ���� �� ���� ��쿡 ��ũ�ѹٷ� ������ �� �ִ�
		super(title);
		
		CheckboxGroup cbg;
		
		Panel panel1 = new Panel();
		
		panel1.setBackground(new Color(200,250,50));
		panel1.add(new Checkbox("������2000"));
		panel1.add(new Checkbox("������"));
		panel1.add(new Checkbox("�ֶ󸮽�"));
		panel1.add(new Checkbox("������10"));
		
		Panel panel2 = new Panel();
		panel2.setBackground(new Color(200,80,250));
		
//		Label lbl1 = new Label("ȯ�漳��", Label.CENTER);
//		lbl1.setBackground(new Color());
		panel2.add(new Label("ȯ�漳��", Label.CENTER));
		panel2.add(new Button("�ҷ�����"));
		panel2.add(new Button("��   ��"));
		panel2.add(new Button("�ٸ� �̸����� ����"));
		
		cbg = new CheckboxGroup();
		
		Panel panel3 = new Panel();
		
		panel3.add(new Label("���� �����ϴ� ��", Label.CENTER));
		panel3.add(new Checkbox("�ϸ���", cbg, true));
		panel3.add(new Checkbox("���ǻ�", cbg, false));
		panel3.add(new Checkbox("�ֿջ�", cbg, false));
		panel3.add(new Checkbox("������", cbg, false));
		
		panel3.setBackground(new Color(20,230,0));
		
		
		add("North", panel1);  //���� ��, üũ�ڽ� ����� �гο� �ٰ�, �г��� �����ӿ� �ٴ´�
		add("Center", panel2);
		add("South", panel3);
		
		
		setLocation(900, 200);
		setSize(450, 180);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new PanelTest_4("Panel Test");
	}

}

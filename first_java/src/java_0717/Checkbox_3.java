package java_0717;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Checkbox_3 extends Frame{
	
	Checkbox os1, os2, os3;
	Checkbox cpu1, cpu2, cpu3, cpu4;
	Checkbox hoppy1, hoppy2, hoppy3, hoppy4, hoppy5;
	CheckboxGroup cbg, cbg2;
//	CheckboxGroup cbp;
	
	public Checkbox_3(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		Label lbl1 = new Label("��ġ�Ǿ� �ִ� OS ����(����)", Label.CENTER);
//		lbl1.setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
		lbl1.setBackground(new Color(178,235,244));
		add(lbl1);
		
		os1 = new Checkbox("������ 98");
		os2 = new Checkbox("������ 2000");
		os3 = new Checkbox("������ XP");
		
		add(os1);
		add(os2);
		add(os3);
		
		Label lbl2 = new Label("��ǻ�� CPU ���� ����", Label.CENTER);
//		lbl2.setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256),(int)(Math.random()*256)));
		lbl2.setBackground(new Color(207,144,255));
		lbl2.setForeground(new Color(255,255,255));
		add(lbl2);
		
		cbg = new CheckboxGroup();
		
		cpu1 = new Checkbox("��Ƽ��4", cbg, false);
		cpu2 = new Checkbox("������XP", cbg, true);
		cpu3 = new Checkbox("����ھ�", cbg, false);
		cpu4 = new Checkbox("���", cbg, false);
		
		add(cpu1);
		add(cpu2);
		add(cpu3);
		add(cpu4);
		
		cbg2 = new CheckboxGroup();  //�ϳ� �� ��������� ������ �ϳ��� �׷��� �Ǿ������ ������ 2�� �������� ��
		
		Label lbl3 = new Label("���� ���", Label.CENTER);
		lbl3.setBackground(new Color(0,51,153));
		lbl3.setForeground(new Color(255,255,255));
		add(lbl3);
		
		hoppy1 = new Checkbox("���", cbg2, true);
		hoppy2 = new Checkbox("����", cbg2, false);
		hoppy3 = new Checkbox("���ǰ���", cbg2, false);
		hoppy4 = new Checkbox("�౸", cbg2, false);
		hoppy5 = new Checkbox("�߱�", cbg2, false);
		
		add(hoppy1);
		add(hoppy2);
		add(hoppy3);
		add(hoppy4);
		add(hoppy5);
		
		setLocation(900,200);
		setSize(460, 150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Checkbox_3("üũ�ڽ� �׽�Ʈ2");
	}

}

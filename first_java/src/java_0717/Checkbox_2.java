package java_0717;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Checkbox_2 extends Frame {
	
	Checkbox cbx1, cbx2, cbx3, cbx4;
	CheckboxGroup cbg;
	
	public Checkbox_2(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		Label lbl = new Label(" �����ϴ� ������ ", Label.CENTER);  // ���̺��� �� ���� �ȿ��� ����� ������ ���ʿ� ������ ����(���� �������� �� �� �� �ִ�)
		lbl.setBackground(new Color(255, 205, 18));		
		add(lbl);
		
		cbg = new CheckboxGroup();
		
		cbx1 = new Checkbox("���", cbg, false);
		cbx2 = new Checkbox("�ø�", cbg, true);   // �߰��� cbg �� �־��ָ� ���ϼ����� �����ϰ� ��.
		cbx3 = new Checkbox("�쵿", cbg, false);  // true �� �������� ������ �������� üũ�� �ȴ�.
		cbx4 = new Checkbox("�̸�", cbg, false);  // �� �����ָ� ���߼����� �ȴ�.
		
		cbx1.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
		cbx2.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
		cbx3.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
		cbx4.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
		
		add(cbx1);		add(cbx2);
		add(cbx3);		add(cbx4);
		
		setLocation(900,200);
		setSize(400,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Checkbox_2("���� ��ư �׽�Ʈ");
		
	}

}

package java_0716;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Label_1 extends Frame{
	
	Label label1,label2,label3,label4;
	// AWT �� Label
	
	public Label_1(String str) {
		super(str);
		
		setLayout(new FlowLayout()); //FlowLayout �� �¿��� ��� ��ġ�ϰ�, ĭ�� ���ڶ� ��� ���� �������� �ѱ��.
		label1 = new Label("<��>");
		label2 = new Label("<����>");
		label3 = new Label("<����>");
		label4 = new Label("<�ܿ�>");
		
		label1.setBackground(new Color(178, 235, 244));
		label1.setForeground(new Color(0, 51, 153));
		
		label2.setBackground(Color.red);  //���� ����
		label2.setForeground(Color.white);  //���ڻ�
		
		label3.setBackground(new Color(16, 98, 10));  //���� ����
		label3.setForeground(new Color(178, 235, 244));  //���ڻ�
		
		label4.setBackground(new Color(0, 51, 153));  //���� ����
		label4.setForeground(new Color(255, 255, 255));  //���ڻ�
		
		add(label1);  // ���̺� ������Ʈ�̴�. ������Ʈ�� �ݵ�� �����̳ʿ� ��� ����� �� �ִ�.
		add(label2);  // Frame �̶�� �����̳ʿ� add �ż� �����ش�.
		add(label3);
		add(label4);
		
		setSize(300, 200);
		setVisible(true);
//		setBackground(new Color(0, 51, 153));
		
	}
	
	public static void main(String[] args) {
		new Label_1("���̺� �����"); // �� ������ ���� String str �� ���� super str �� ���ٴ� ��
		
	}

}

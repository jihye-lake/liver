package java_0716;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Label_1_1 {
	public static void main(String[] args) {
	
	Label label1,label2,label3,label4;
	// AWT �� Label
	
	Frame ff = new Frame("��¼�� ��¼�� ���̺�");
			
		ff.setLayout(new FlowLayout()); //FlowLayout �� �¿��� ��� ��ġ�ϰ�, ĭ�� ���ڶ� ��� ���� �������� �ѱ��.
		label1 = new Label("<��>");
		label2 = new Label("<����>");
		label3 = new Label("<����>");
		label4 = new Label("<�ܿ�>");
		
		ff.setBackground(new Color(255, 205, 18));
		
		label1.setBackground(new Color(178, 235, 244));
		label1.setForeground(new Color(0, 51, 153));
		
		label2.setBackground(new Color(207, 144, 255));  //���� ����
		label2.setForeground(new Color(189, 189, 189));  //���ڻ�
		
		label3.setBackground(new Color(189, 189, 189));  //���� ����
		label3.setForeground(new Color(0, 51, 153));  //���ڻ�
		
		label4.setBackground(new Color(0, 51, 153));  //���� ����
		label4.setForeground(new Color(255, 255, 255));  //���ڻ�
		
		ff.add(label1);  // ���̺� ������Ʈ�̴�. ������Ʈ�� �ݵ�� �����̳ʿ� ��� ����� �� �ִ�.
		ff.add(label2);  // Frame �̶�� �����̳ʿ� add �ż� �����ش�.
		ff.add(label3);
		ff.add(label4);
		
		ff.setSize(300, 200);
		ff.setVisible(true);
		
	}
	
		
	}
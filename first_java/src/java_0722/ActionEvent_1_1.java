package java_0722;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Exit_7 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

public class ActionEvent_1_1 extends Frame implements ActionListener{  //  Ctrl + 1 ����
	
	Label lbl_info;
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
	
	public ActionEvent_1_1(String title) {
		super(title);
		

		
		lbl_info = new Label("��ư�� ���� �ּ���.");
		btn1 = new Button("�� ��ư");
		btn2 = new Button("�� ��ư");
		btn3 = new Button("�� ��ư");
		btn4 = new Button("�� ��ư");
		btn5 = new Button("�� ��ư");
		btn6 = new Button("�� ��ư");
		btn7 = new Button("�� ��ư");
		btn8 = new Button("�� ��ư");
		btn9 = new Button("�� ��ư");
		btn10 = new Button("�� ��ư");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn10.addActionListener(this);
		
		Panel panel = new Panel();
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(btn7);
		panel.add(btn8);
		panel.add(btn9);
		panel.add(btn10);
		
		add("Center", panel);
		add("South", lbl_info);
		
		setSize(300, 200);
		setVisible(true);
		
		Exit_7 end = new Exit_7();
		addWindowListener(end);
	}

	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if ((Button)obj == btn1) {
			
			lbl_info.setText("���� ��ư�� ���Ƚ��ϴ�.");
			System.out.println("���� ��ư�� ���Ƚ��ϴ�.");  // �ܼ�â���� ���
			
		} else if ((Button)obj == btn2) {
			
			lbl_info.setText("��� ��ư�� ���Ƚ��ϴ�.");
			System.out.println("��� ��ư�� ���Ƚ��ϴ�.");  // �ܼ�â���� ���			
			
		} else if ((Button)obj == btn3) {
			lbl_info.setText("������ ��ư�� ���Ƚ��ϴ�.");
			System.out.println("������ ��ư�� ���Ƚ��ϴ�.");
		} else
			lbl_info.setText("'��' �Դϴ� ��������������");
			System.out.println("'��' �Դϴ� ��������������");
		
	}

	public static void main(String[] args) {
		new ActionEvent_1_1("ActionEvent Test");
	}
}

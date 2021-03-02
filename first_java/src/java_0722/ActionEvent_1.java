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

class Exit_6 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

public class ActionEvent_1 extends Frame implements ActionListener{  //  Ctrl + 1 ����
	
	Label lbl_info;
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
	
	public ActionEvent_1(String title) {
		super(title);
		

		
		lbl_info = new Label("��ư�� ���� �ּ���.");  // ����Ʈ�� �ߴ� ����
		btn1 = new Button("�� ��ư");
		btn2 = new Button("�� ��ư");
		btn3 = new Button("�� ��ư");
		btn1.addActionListener(this);  // ActionListener �� �����ִ� �ڱ��ڽ�
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		Panel panel = new Panel();
		
		panel.add(btn1);
		panel.add(btn2);  // ��ư�� ������ ���ϴ� ��
		panel.add(btn3);
		
		add("Center", panel);
		add("South", lbl_info);
		
		setSize(300, 200);
		setVisible(true);
		
		Exit_6 end = new Exit_6();
		addWindowListener(end);
	}

	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if ((Button)obj == btn1) { // obj �� ��ư���� ����ȯ �� ������ �װ� btn1 �� ���ٸ�(���ȴٸ�)
			
			lbl_info.setText("���� ��ư�� ���Ƚ��ϴ�.");  //  set �� ���� �����´�, get �� ���� ��������
			System.out.println("���� ��ư�� ���Ƚ��ϴ�.");  // �ܼ�â���� ���
			
		} else if ((Button)obj == btn2) {
			
			lbl_info.setText("��� ��ư�� ���Ƚ��ϴ�.");
			System.out.println("��� ��ư�� ���Ƚ��ϴ�.");  // �ܼ�â���� ���			
			
		} else if ((Button)obj == btn3) {
			lbl_info.setText("������ ��ư�� ���Ƚ��ϴ�.");
			System.out.println("������ ��ư�� ���Ƚ��ϴ�.");
		}
		
	}

	public static void main(String[] args) {
		new ActionEvent_1("ActionEvent Test");
	}
}

package java_0722;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Exit_5 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

public class Event_1 extends Frame implements ActionListener {
	
	public Event_1(String title) {
		super(title);
		Button btn = new Button("��ư");
		btn.addActionListener(this);  // ���� ��ư�� �����ʸ� �޾Ҵ� => �׼�������Ʈ�� ���ؼ� �̺�Ʈ�� �߻��Ѵ�
		// this ��� Anonymous �� Handler ����� �� ����.
		
		add(btn);
		setSize(300, 300);
		setVisible(true);		
		
		Exit_5 end = new Exit_5();
		addWindowListener(end);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("*************************�̺�Ʈ �߻� ����****************************");
		System.out.println("e.getSource() Method : " + e.getSource());
		System.out.println("e.toString() : " + e.toString());
		System.out.println("e.getID() : " + e.getID());  // ���� �ߴ� �� �ϳ��� ������ȣ��
		System.out.println("*********************************************************************");
		
		
	}
	
	
	
	public static void main(String[] args) {
		new Event_1("Event Test");
		
	}

}

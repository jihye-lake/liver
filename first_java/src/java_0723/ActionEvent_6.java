package java_0723;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
//class Exit_9 extends WindowAdapter {
//	public void windowclosing(WindowEvent e) {
//		System.exit(0);
//	}
//}

public class ActionEvent_6 extends Frame {  // Handler ����
	
	Label lid;
	Label lpwd;
	TextField tfId;  // TextField : Ÿ���� ����
	TextField tfPwd;
	Button ok;
	
	public ActionEvent_6(String title) {
		super(title);
		
		lid = new Label("ID : ", Label.RIGHT);  // ������ �ٴ´�
		lpwd = new Label("PWD : ", Label.RIGHT);  // ������ �ٴ´�
		
		tfId = new TextField(10);  // �� ���� ���ڸ� ���� �� ����
		tfPwd = new TextField(10);
		tfPwd.setEchoChar('*');  // tfPwd ���� ���� ��´�
		ok = new Button("OK");
		// �ټ� ���� ������Ʈ
		
		tfId.addActionListener(new EventHandler());  // �� ���� tf , �ϳ��� ��ư �� �� �������� �׼� �̺�Ʈ�� �߻���Ű�� ����
		tfPwd.addActionListener(new EventHandler());
		ok.addActionListener(new EventHandler());
		
		setLayout(new FlowLayout());  // �¿��� ��� �ٴ´�.
		
		add(lid);	add(tfId);
		add(lpwd);	add(tfPwd);
		add(ok);
		
		setSize(450, 80);
		setVisible(true);
		
//		Exit_9 end = new Exit_9();
//		addWindowListener(end);
	
	}
	
	public static void main(String[] args) {
		new ActionEvent_6("Login Test");
	}
	
	class EventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String id = tfId.getText(); // tfId.getText �� id �� ��ƶ� => ����ڰ� ��� ���ڸ� ���� �װ� tf �� ��ƶ�
			String password = tfPwd.getText();
			
			if (!id.equals("korea")) {
				System.out.println("�Է��Ͻ� ID �� �������� �ʽ��ϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				tfId.requestFocus();  // Ŀ���� Id ��ġ�� ���ٳ���
				tfId.selectAll();  // ��ü�� �������Ѷ� => ���ڸ� ���� ó������ �� �� ����
				
			} else if (!password.equals("seoul")) {
				System.out.println("�Է��Ͻ� password �� Ʋ�Ƚ��ϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				tfPwd.requestFocus();
				tfPwd.selectAll();
				
			} else
				System.out.println(id + "�� �������.");
			
		}
		
	}

}

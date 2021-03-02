package java_0723;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_6_1 extends Frame implements ActionListener {  // implements ���� this ����
	
	Label lid;
	Label lpwd;
	TextField tfId;  // TextField : Ÿ���� ����
	TextField tfPwd;
	Button ok;
	
	public ActionEvent_6_1(String title) {
		super(title);
		
		lid = new Label("ID : ", Label.RIGHT);  // ������ �ٴ´�
		lpwd = new Label("PWD : ", Label.RIGHT);  // ������ �ٴ´�
		
		tfId = new TextField(10);  // �� ���� ���ڸ� ���� �� ����
		tfPwd = new TextField(10);
		tfPwd.setEchoChar('*');  // tfPwd ���� ���� ��´�
		ok = new Button("OK");
		// �ټ� ���� ������Ʈ
		
		tfId.addActionListener(this);  // �� ���� tf , �ϳ��� ��ư �� �� �������� �׼� �̺�Ʈ�� �߻���Ű�� ����
		tfPwd.addActionListener(this);  // this �� �̺�Ʈ �����ʸ� '����' ������ �ִٴ� ����. �װ� ���ٰ� �����ִ� ��.
		ok.addActionListener(this);
		
		setLayout(new FlowLayout());  // �¿��� ��� �ٴ´�.
		
		add(lid);	add(tfId);
		add(lpwd);	add(tfPwd);
		add(ok);
		
		setSize(450, 80);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new ActionEvent_6_1("Login Test");
	}

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
				System.out.println(id + " �� �������.");
			
			// �ڵ尡 Ŀ���� �ڵ鷯���� (���� �ΰ� �и��ؾ� �ϱ� ������)
		}
		
	}

package java_0717;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextField_1 extends Frame{
	
	public TextField_1(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		Label lbl1 = new Label("���̵� �Է� : ");
		Label lbl2 = new Label("��й�ȣ �Է� : ");
		
		TextField txt1 = new TextField("ID", 20);  // ���ڼ��� 20���� �����ϰڴ�.
		TextField txt2 = new TextField("korea", 20); 
		
		txt2.setEchoChar('*');  //���� ���´�, �ٸ� Ư�����ڷ� ���� �װ� ���´�
		
		add(lbl1) ; add(txt1) ;
		add(lbl2) ; add(txt2) ;
		
		setSize(200, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TextField_1("TextField Test");
	}

}

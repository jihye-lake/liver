package java_0716;

import java.awt.Frame;
import java.awt.Label;

public class Login_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("Login");
		
		ff.setSize(300, 200);
		ff.setLayout(null);  //Layout ���� null �̹Ƿ� ������ ���� �� �� 
		
		Label id = new Label("ID : ");
		id.setBounds(110, 70, 20, 18);  //setLocation + setSize = setBounds(x, y, ����, ����)
		
		Label pwd = new Label("Password : ");
		pwd.setBounds(110, 100, 100, 18);
		
		Label name = new Label("�� �� �� ��");
		name.setBounds(110, 130, 100, 18);
		
		ff.add(id);
		ff.add(pwd);
		ff.add(name);
		
		ff.setVisible(true);
	}

}

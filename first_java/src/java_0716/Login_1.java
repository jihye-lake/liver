package java_0716;

import java.awt.Frame;
import java.awt.Label;

public class Login_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("Login");
		
		ff.setSize(300, 200);
		ff.setLayout(null);  //Layout 값이 null 이므로 옆으로 나열 안 함 
		
		Label id = new Label("ID : ");
		id.setBounds(110, 70, 20, 18);  //setLocation + setSize = setBounds(x, y, 넓이, 높이)
		
		Label pwd = new Label("Password : ");
		pwd.setBounds(110, 100, 100, 18);
		
		Label name = new Label("최 지 혜 ㅋ");
		name.setBounds(110, 130, 100, 18);
		
		ff.add(id);
		ff.add(pwd);
		ff.add(name);
		
		ff.setVisible(true);
	}

}

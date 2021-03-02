package java_0716;

import java.awt.Frame;
import java.awt.Label;

public class Login_1_1 extends Frame{
		
		public Login_1_1(String str) {
			super(str);
			setSize(300, 200);
			setLayout(null);
			
			Label id = new Label("ID : ");
			setBounds(110, 70, 20, 18);  //setLocation + setSize = setBounds(x, y, 넓이, 높이)
			
			Label pwd = new Label("Password : ");
			setBounds(110, 100, 100, 18);
			
			Label name = new Label("최 지 혜 ㅋ");
			name.setBounds(110, 130, 100, 18);
			
			add(id);
			add(pwd);
			add(name);
			
			setVisible(true);
		}
		
		public static void main(String[] args) {
			new Login_1_1("나와라");
		}
		
		
	}
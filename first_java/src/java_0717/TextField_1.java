package java_0717;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextField_1 extends Frame{
	
	public TextField_1(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		Label lbl1 = new Label("아이디 입력 : ");
		Label lbl2 = new Label("비밀번호 입력 : ");
		
		TextField txt1 = new TextField("ID", 20);  // 글자수를 20으로 제한하겠다.
		TextField txt2 = new TextField("korea", 20); 
		
		txt2.setEchoChar('*');  //별이 나온다, 다른 특수문자로 쓰면 그게 나온다
		
		add(lbl1) ; add(txt1) ;
		add(lbl2) ; add(txt2) ;
		
		setSize(200, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TextField_1("TextField Test");
	}

}

package java_0717;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class TextField_2 extends Frame{
	
	public TextField_2(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		TextArea txt1 = new TextArea(10, 30);  //10행 30열의 개념이다(폰트에 따라 다르다)
		TextField txt2 = new TextField("안녕하세요", 20);
		
		txt1.setText("반갑습니다.");
		txt1.setBackground(new Color(178,235,244));
		txt1.setFont(new Font("궁서체", Font.ITALIC|Font.BOLD, 20));  // 17이 폰트 크기임. ITALIC(기울이기), BOLD(진하게)
		txt1.setForeground(new Color(0,51,153));
		
		txt2.setEchoChar('#');
		txt2.setForeground(new Color(189,189,189));  // #의 색깔
		
		add(txt1);
		add(txt2);
		
		setSize(500, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TextField_2("TextArea Test");
		
	}

}

package java_0723;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_4_1 extends Frame implements ActionListener { // 계속 위치가 돌게끔 텍스트 설정
	
	TextField txt_1, txt_2, txt_3;
	
	public ActionEvent_4_1(String str) {
		super(str);
		txt_1 = new TextField("문자를 입력하세요.", 20);
		txt_2 = new TextField("...", 20);
		txt_3 = new TextField("%%%", 20);
		
		txt_1.addActionListener(this);
		txt_2.addActionListener(this);
		txt_3.addActionListener(this);
		
		add("North", txt_1);
		add("Center", txt_3);
		add("South", txt_2);
		
		setSize(300, 300);
		setVisible(true);
						
	}
	
	public static void main(String[] args) {
		new ActionEvent_4_1("ActionEvent Test");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		TextField obj = (TextField) e.getSource(); // 몇 번 텍스트 필드인지 판단할 수 있음
		
		if (obj == txt_1) {  // 1번 TextField 에서 Enter 키를 쳤다면
			txt_2.setText(txt_1.getText());  // 텍스트1번의 글자를 가져다가 텍스트 2번에 집어넣으라는 뜻
			txt_3.setText(txt_1.getText());
			txt_2.setFocusable(true);  //그다음을 포커스를 2번으로 옮기고
			txt_1.setFocusable(false);  //1번 포커스는 죽여라
			txt_3.setFocusable(false);
			
		} else if (obj == txt_2) {
			txt_1.setText(txt_2.getText());
			txt_3.setText(txt_2.getText());
			txt_3.setFocusable(true);  //  true 값이 먼저 와야함. 중간에 가면 한 번만 돌고 멈춰버림.
			txt_1.setFocusable(false);
			txt_2.setFocusable(false);
			
		} else {   // 3번 이라면
			txt_1.setText(txt_3.getText());
			txt_2.setText(txt_3.getText());
			txt_1.setFocusable(true);
			txt_2.setFocusable(false);
			txt_3.setFocusable(false);
	}			
		
	}

	
}
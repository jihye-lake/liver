package java_0717;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextField_4 extends Frame {
	
	public TextField_4(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		TextArea txt1 = new TextArea("간단한 메모를 입력"); //사이즈를 설정해 주면 그 사이즈대로 나오지만, 설정하지 않으면 디폴트 사이즈가 나온다.
		TextArea txt2 = new TextArea(10, 20);
		TextArea txt3 = new TextArea("문자열, 문자열", 5, 30);
		
		txt1.setBackground(new Color(171,242,0));
		txt2.setBackground(new Color((int)((Math.random()*(256-200))+200), (int)(Math.random()*160), (int)((Math.random()*(256-200))+200)));
		txt3.setBackground(new Color(171,242,0));
		
		add(txt1);
		add(txt2);
		add(txt3);
		
		setLocation(900, 200);
		setSize(500, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TextField_4("테스트 에어리어 테스트");
	}

}

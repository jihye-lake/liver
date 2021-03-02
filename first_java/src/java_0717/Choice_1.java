package java_0717;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Choice_1 extends Frame {  //Choice 는 "선택박스"라고 함
	
	public Choice_1(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		Label lbl = new Label("국가를 선택하시오.", Label.CENTER);
		lbl.setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
//		lbl.setForeground(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
		lbl.setForeground(new Color(255,255,255));
		
		Choice choice = new Choice();		
		choice.add("대한민국");
		choice.add("호주");
		choice.add("캐나다");
		choice.add("터키");
		choice.add("러시아");
		choice.add("뉴질랜드");
		
		add(lbl);  //프레임에 배치해라
		add(choice);  //프레임에 배치해라
		
		setLocation(900,200);
		setSize(200, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Choice_1("선택박스 테스트");		
	}

}

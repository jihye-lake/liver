package java_0716;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Button_3_1 extends Frame {
	
	Label[]		lbl		= new Label[500]; //배열 만듦
	Button[]	btn	= new Button[500]; //배열 버튼
	
	public Button_3_1(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		for (int i = 0; i < 500; i++) {
			
			lbl[i]		= new Label(i + " 레이블 ");
			btn[i]	= new Button(i + " 버튼 ");
			
//			setBackground(new Color((int)((Math.random()*(255-200))+200),(int)((Math.random()*(255-200))+200),(int)(Math.random()*20)));
			lbl[i].setBackground(new Color((int)(Math.random()*100),(int)((Math.random()*(255-160))+160),(int)(Math.random()*80)));
			btn[i].setBackground(new Color((int)(Math.random()*100),(int)((Math.random()*(255-160))+160),(int)(Math.random()*130)));
			//노란색은 (255,255,0) 임 R,G는  255에 가깝게 나오게 하고, B는 0에 가깝게 나오게 한다.
			//160부터 255사이의 숫자가 나옴
			
			add(lbl[i]) ; add(btn[i]);
		
			
			
		}
		
		setLocation(1000, 200);
		setSize(500, 500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Button_3_1("배열 레이블, 버튼 만들기");
	}

}
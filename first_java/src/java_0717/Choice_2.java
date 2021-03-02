package java_0717;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.*;

public class Choice_2 extends Frame {
	
	String[] continent = {"아시아", "유럽", "아메리카", "아프리카", "오세아니아"};
//	String[] continent = {};
	String[] country = {"한국", "프랑스", "캐나다", "수단", "뉴질랜드"};
	String[] capital = {"서울", "파리", "오타와", "아크라", "웰링턴"};
	
	public Choice_2(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		Label lbl1 = new Label("대륙을 선택하시오.", Label.CENTER);
		Label lbl2 = new Label("나라를 선택하시오.", Label.CENTER);
		Label lbl3 = new Label("수도를 선택하시오.", Label.CENTER);
		
		lbl1.setBackground(new Color(255,205,18));
		lbl2.setBackground(new Color(0,51,153));
		lbl2.setForeground(new Color(255,245,18));
		lbl3.setBackground(new Color(16,98,10));
		lbl3.setForeground(new Color(255,205,18));
		
		Choice choice1 = new Choice();
		choice1.setBackground(new Color((int)(Math.random()*20), (int)(Math.random()*50), (int)((Math.random()*(255-200))+200)));
		Choice choice2 = new Choice();
		choice2.setBackground(new Color((int)((Math.random()*(255-200))+200), (int)((Math.random()*(255-200))+200), (int)(Math.random()*30)));
		Choice choice3 = new Choice();
		choice3.setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
		
//		choice1.add("아시아");
//		choice1.add("유럽");
//		choice1.add("아메리카");
//		choice1.add("아프리카");
//		choice1.add("오세아니아");
		
		for (int i = 0; i < country.length; i++) {
			choice1.add(continent[i]);
		}
		
		for (int i = 0; i < country.length; i++) {
			choice2.add(country[i]);
		}
		
		for (int i = 0; i < capital.length; i++) {
			choice3.add(capital[i]);
		}

		add(lbl1);  add(choice1);
		add(lbl2);  add(choice2);
		add(lbl3);  add(choice3);
		
		setLocation(900, 300);	
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Choice_2("Choice 테스트");
	}

}

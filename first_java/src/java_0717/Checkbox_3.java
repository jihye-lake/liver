package java_0717;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Checkbox_3 extends Frame{
	
	Checkbox os1, os2, os3;
	Checkbox cpu1, cpu2, cpu3, cpu4;
	Checkbox hoppy1, hoppy2, hoppy3, hoppy4, hoppy5;
	CheckboxGroup cbg, cbg2;
//	CheckboxGroup cbp;
	
	public Checkbox_3(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		Label lbl1 = new Label("설치되어 있는 OS 선택(복수)", Label.CENTER);
//		lbl1.setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
		lbl1.setBackground(new Color(178,235,244));
		add(lbl1);
		
		os1 = new Checkbox("윈도우 98");
		os2 = new Checkbox("윈도우 2000");
		os3 = new Checkbox("윈도우 XP");
		
		add(os1);
		add(os2);
		add(os3);
		
		Label lbl2 = new Label("컴퓨터 CPU 종류 선택", Label.CENTER);
//		lbl2.setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256),(int)(Math.random()*256)));
		lbl2.setBackground(new Color(207,144,255));
		lbl2.setForeground(new Color(255,255,255));
		add(lbl2);
		
		cbg = new CheckboxGroup();
		
		cpu1 = new Checkbox("팬티엄4", cbg, false);
		cpu2 = new Checkbox("에슬론XP", cbg, true);
		cpu3 = new Checkbox("듀얼코어", cbg, false);
		cpu4 = new Checkbox("페넘", cbg, false);
		
		add(cpu1);
		add(cpu2);
		add(cpu3);
		add(cpu4);
		
		cbg2 = new CheckboxGroup();  //하나 더 만들어주지 않으면 하나의 그룹이 되어버리기 때문에 2를 만들어줘야 함
		
		Label lbl3 = new Label("나의 취미", Label.CENTER);
		lbl3.setBackground(new Color(0,51,153));
		lbl3.setForeground(new Color(255,255,255));
		add(lbl3);
		
		hoppy1 = new Checkbox("등산", cbg2, true);
		hoppy2 = new Checkbox("조깅", cbg2, false);
		hoppy3 = new Checkbox("음악감상", cbg2, false);
		hoppy4 = new Checkbox("축구", cbg2, false);
		hoppy5 = new Checkbox("야구", cbg2, false);
		
		add(hoppy1);
		add(hoppy2);
		add(hoppy3);
		add(hoppy4);
		add(hoppy5);
		
		setLocation(900,200);
		setSize(460, 150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Checkbox_3("체크박스 테스트2");
	}

}

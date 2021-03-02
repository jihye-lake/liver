package java_0717;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Checkbox_2 extends Frame {
	
	Checkbox cbx1, cbx2, cbx3, cbx4;
	CheckboxGroup cbg;
	
	public Checkbox_2(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		Label lbl = new Label(" 좋아하는 음식은 ", Label.CENTER);  // 레이블이 그 범위 안에서 가운데에 오느냐 왼쪽에 오느냐 차이(색을 입혀보면 잘 알 수 있다)
		lbl.setBackground(new Color(255, 205, 18));		
		add(lbl);
		
		cbg = new CheckboxGroup();
		
		cbx1 = new Checkbox("라면", cbg, false);
		cbx2 = new Checkbox("냉면", cbg, true);   // 중간에 cbg 를 넣어주면 단일선택이 가능하게 됨.
		cbx3 = new Checkbox("우동", cbg, false);  // true 가 여러개가 있으면 마지막만 체크가 된다.
		cbx4 = new Checkbox("쫄면", cbg, false);  // 안 적어주면 다중선택이 된다.
		
		cbx1.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
		cbx2.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
		cbx3.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
		cbx4.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
		
		add(cbx1);		add(cbx2);
		add(cbx3);		add(cbx4);
		
		setLocation(900,200);
		setSize(400,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Checkbox_2("라디오 버튼 테스트");
		
	}

}

package java_0719;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class BorderLayout_2 extends Frame{
	
	public BorderLayout_2(String title) {
		super(title);
		
		Panel pp = new Panel();
		
		pp.setLayout(new FlowLayout());
		
		pp.add(new Button("               버튼            1 ")).setBackground(new Color(240,100,222));;  // 공백을 넣으면 버튼이 커져서 한 줄에 하나씩 나올 수도 있게 된다.
		pp.add(new Button("               버튼            2 "));
		pp.add(new Button("               버튼            3 "));
		
		add("North", new Label("레이아웃"));
		add("Center", pp);
		add("South", new TextField("레이아웃 관리자 혼합", 15));
		
		setSize(200,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new BorderLayout_2("BorderLayout Test");
		
	}

}

package java_0719;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class BorderLayout_1 extends Frame{
	
	BorderLayout bbl = new BorderLayout();
	
	public BorderLayout_1(String title) {
		super(title);
		setLayout(bbl); //없어도 기본 Layout 은 Border 이기 때문에 괜찮다
		
		Button btn = new Button();
//		btn.setBackground(new Color(40,50,60));
		
		add("North", new Button("북쪽")).setBackground(new Color(90,210,230));
		add("West", new Button("서쪽")).setBackground(new Color(0,70,255));
		add("East", new Button("동쪽")).setBackground(new Color(60,50,240));
		add("Center", new Button("중앙")).setBackground(new Color(60,50,40));  //북쪽과 서쪽이 없으면 센터가 전부 차지하게 됨.
		add("South", new Button("남쪽")).setBackground(new Color(240,123,20));
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new BorderLayout_1("BorderLayout Test");
	}

}

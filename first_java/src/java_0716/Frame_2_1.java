package java_0716;

import java.awt.Color;
import java.awt.Frame;

public class Frame_2_1 extends Frame {
	
//	public Frame_2_1(String str) {
//		super(str);
	public Frame_2_1() {
		super("최지혜가 만든 프레이이이임");  //super 는 가장 위에 와야 함
		setTitle("초지혜가 만든 프레임"); // 1번으로 나오고 이게 없으면 super 가 나온다
		setSize(300, 300);
		setVisible(true);
		setBackground(new Color(178, 235, 244));
	}
	
	public static void main(String[] args) {
		
//		new Frame_2_1("최지혜가 만든 프레임");
		new Frame_2_1();
		
	}

}
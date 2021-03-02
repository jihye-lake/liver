package java_0716;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Label_1 extends Frame{
	
	Label label1,label2,label3,label4;
	// AWT 의 Label
	
	public Label_1(String str) {
		super(str);
		
		setLayout(new FlowLayout()); //FlowLayout 은 좌에서 우로 배치하고, 칸이 모자랄 경우 다음 라인으로 넘긴다.
		label1 = new Label("<봄>");
		label2 = new Label("<여름>");
		label3 = new Label("<가을>");
		label4 = new Label("<겨울>");
		
		label1.setBackground(new Color(178, 235, 244));
		label1.setForeground(new Color(0, 51, 153));
		
		label2.setBackground(Color.red);  //글자 배경색
		label2.setForeground(Color.white);  //글자색
		
		label3.setBackground(new Color(16, 98, 10));  //글자 배경색
		label3.setForeground(new Color(178, 235, 244));  //글자색
		
		label4.setBackground(new Color(0, 51, 153));  //글자 배경색
		label4.setForeground(new Color(255, 255, 255));  //글자색
		
		add(label1);  // 레이블도 컴포넌트이다. 컴포넌트는 반드시 컨테이너에 담고서 사용할 수 있다.
		add(label2);  // Frame 이라는 컨테이너에 add 돼서 보여준다.
		add(label3);
		add(label4);
		
		setSize(300, 200);
		setVisible(true);
//		setBackground(new Color(0, 51, 153));
		
	}
	
	public static void main(String[] args) {
		new Label_1("레이블 만들기"); // 이 내용이 위의 String str 에 들어가서 super str 에 간다는 뜻
		
	}

}

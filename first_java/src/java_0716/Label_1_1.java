package java_0716;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Label_1_1 {
	public static void main(String[] args) {
	
	Label label1,label2,label3,label4;
	// AWT 의 Label
	
	Frame ff = new Frame("어쩌고 저쩌고 레이블");
			
		ff.setLayout(new FlowLayout()); //FlowLayout 은 좌에서 우로 배치하고, 칸이 모자랄 경우 다음 라인으로 넘긴다.
		label1 = new Label("<봄>");
		label2 = new Label("<여름>");
		label3 = new Label("<가을>");
		label4 = new Label("<겨울>");
		
		ff.setBackground(new Color(255, 205, 18));
		
		label1.setBackground(new Color(178, 235, 244));
		label1.setForeground(new Color(0, 51, 153));
		
		label2.setBackground(new Color(207, 144, 255));  //글자 배경색
		label2.setForeground(new Color(189, 189, 189));  //글자색
		
		label3.setBackground(new Color(189, 189, 189));  //글자 배경색
		label3.setForeground(new Color(0, 51, 153));  //글자색
		
		label4.setBackground(new Color(0, 51, 153));  //글자 배경색
		label4.setForeground(new Color(255, 255, 255));  //글자색
		
		ff.add(label1);  // 레이블도 컴포넌트이다. 컴포넌트는 반드시 컨테이너에 담고서 사용할 수 있다.
		ff.add(label2);  // Frame 이라는 컨테이너에 add 돼서 보여준다.
		ff.add(label3);
		ff.add(label4);
		
		ff.setSize(300, 200);
		ff.setVisible(true);
		
	}
	
		
	}
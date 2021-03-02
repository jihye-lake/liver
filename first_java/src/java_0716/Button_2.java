package java_0716;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Button_2 extends Frame {
		
		Label lbl1, lbl2, lbl3;
		Button btn1, btn2, btn3;
		
		public Button_2(String str) {
			super(str);
			setLayout(new FlowLayout());
			lbl1 = new Label("가위");
			lbl2 = new Label("바위");
			lbl3 = new Label(" 보  ");
			
			btn1 = new Button("가위");
			btn2 = new Button("바위");
			btn3 = new Button("  보  ");
			
			add(lbl1) ;  add(btn1);
			add(lbl2) ;  add(btn2);
			add(lbl3) ;  add(btn3);
			
			lbl1.setEnabled(false);  //false 를 누면 버튼 비활성화가 된다.
			btn3.setEnabled(false);
			
			setSize(300, 200);
			setLocation(300, 300);  //x축은 좌 → 우가 + 이지만, y축은 위 ↓ 아래가 +임
			setVisible(true);
		}
		
		public static void main(String[] args) {
			new Button_2("버튼과 레이블");
		}
		
	}

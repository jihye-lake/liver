package java_0722;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Exit extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

public class Calc_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("계산기");
		TextField tf = new TextField("0");
		
		tf.setEnabled(false); // 활성화가 안 돼서 입력불가로 뜸
		
		ff.setSize(250, 200);
		ff.setLocation(900, 300);
		
		ff.add("North", tf); // 계산되는 부분이 어디로 가느냐
		
		Panel numPanel = new Panel();
		Button[] numButtons = null;
		numPanel.setLayout(new GridLayout(4,5,5,5));  // 4행 5열의 그리드. String 을 일렬로 적어도 4행 5열로 나옴.
																			// 5,5 은 버튼간의 여백간격
		numPanel.setBackground(new Color(210,255,198));
		
		ff.add("Center", numPanel);
		
		String[] numStr = {"7","8","9","/","CE","4","5","6","*","BS","1","2","3","-","1/x","0","+/-",".","+","="};
		
		numButtons = new Button[numStr.length];
		
		for (int i = 0; i < numStr.length; i++) {
			numButtons[i] = new Button(numStr[i]);
			numButtons[i].setForeground(new Color(0,0,0));
			numPanel.add(numButtons[i]);
			
			Exit end = new Exit();
			ff.addWindowListener(end);
						
		}
		
		ff.setResizable(false);  // 사이즈를 늘리거나 줄일 수 없음(true 를 주면 크기 변경 가능함 기본값은 true)
		ff.setVisible(true);
		
	}

}

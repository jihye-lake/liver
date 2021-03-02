package java_0722;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Exit_4 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

public class Window_1_2 extends Frame {
	
	Window[] win = new Window[100];
	Color[] color = {(new Color(199,198,255)),(new Color(185,186,255)),(new Color(174,173,255)),(new Color(164,163,255)),(new Color(154,153,255)),(new Color(144,143,255)),(new Color(134,133,255)),(new Color(124,123,255)),(new Color(114,113,255)),(new Color(104,103,255)),(new Color(94,93,255)),(new Color(84,83,255)),(new Color(74,73,255)),(new Color(64,63,255)),(new Color(54,53,255)),(new Color(44,43,255)),(new Color(34,33,255)),(new Color(24,23,255)),(new Color(14,13,255)),(new Color(4,3,255))};
	
	public Window_1_2(String title) {
		super(title);
		
		int x = 0;
		int y = 0;
		
		setLayout(new FlowLayout());
		
		for (int i = 0; i < 100; i++) {
			
			win[i] = new Window(this);
			win[i].setBackground(color[i % 10]);  // 10개를 반복해서 집어넣는다(배열 안에 들어간다고 생각하는 것 중요)
			Label lbl = new Label(i + "번 윈도우");
			
			win[i].add(lbl);
			win[i].setVisible(true);
			
			if ((i / 10) % 2 != 1) {
				
				x += 10; // 10씩 증가시키기
				y += 10;
				
				win[i].setBounds(150+(x),  150+(y),  100,  100);
				
			} else {
				
				x += 10; // 10씩 증가시키기
				y -= 10;
				
				win[i].setBounds(150+(x),  150+(y), 100, 100);
				
			}
		
		}

		
//		for (int i = 0; i < 10; i+=3) {  // 주석처리하면 박스가 전부 다 뜸
////			win[i].hide();
//			win[i].setVisible(false);
//		}
		
		setLocation(400, 370);
		setVisible(true);
		
		Exit_4 end = new Exit_4();
		addWindowListener(end);
		
	}
	
	public static void main(String[] args) {
		new Window_1_2("Window Test");
	}

}
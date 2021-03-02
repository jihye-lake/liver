package java_0722;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Exit_2 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

public class Window_1 extends Frame {
	
	Window[] win = new Window[20];
	Window[] win2 = new Window[20];
	Color[] color = {(new Color(199,198,255)),(new Color(185,186,255)),(new Color(174,173,255)),(new Color(164,163,255)),(new Color(154,153,255)),(new Color(144,143,255)),(new Color(134,133,255)),(new Color(124,123,255)),(new Color(114,113,255)),(new Color(104,103,255)),(new Color(94,93,255)),(new Color(84,83,255)),(new Color(74,73,255)),(new Color(64,63,255)),(new Color(54,53,255)),(new Color(44,43,255)),(new Color(34,33,255)),(new Color(24,23,255)),(new Color(14,13,255)),(new Color(4,3,255))};
	
	public Window_1(String title) {
		super(title);
		
		for (int i = 0; i < 20; i++) {
			
			win[i] = new Window(this);
			win[i].setBackground(color[i % 10]);
			Label lbl = new Label(i + "번 윈도우");
			
			win[i].add(lbl);
			win[i].setBounds(100+(i*10), 300-(i*10), 100, 100);
//			win[i].show();
			win[i].setVisible(true);
			
			if (i < 10) {
				win[i].setBounds(100+(i*10), 100+(i*10), 100, 100);
			}
		
		}
		
		for (int j = 0; j < 20; j++) {
			
			win2[j] = new Window(this);
			win2[j].setBackground(color[j % 10]);
			Label lbl1 = new Label(j + "번 윈도우");
			
			win2[j].add(lbl1);
			win2[j].setBounds(300+(j*10), 300-(j*10), 100, 100);
//			win[i].show();
			win2[j].setVisible(true);
			
			if (j < 10) {
				win2[j].setBounds(300+(j*10), 100+(j*10), 100, 100);
			}
		}

		
//		for (int i = 0; i < 10; i+=3) {  // 주석처리하면 박스가 전부 다 뜸
////			win[i].hide();
//			win[i].setVisible(false);
//		}
		
		setLocation(400, 370);
		setVisible(true);
		
		Exit_1 end = new Exit_1();
		addWindowListener(end);
		
	}
	
	public static void main(String[] args) {
		new Window_1("Window Test");
	}

}

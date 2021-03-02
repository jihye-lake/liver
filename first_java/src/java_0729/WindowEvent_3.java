package java_0729;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEvent_3 extends Frame{

	
	Frame[] win = new Frame[9];
	
	String[] str = {"빨강","주황","파랑","노랑","초록","핑크","검정","최지혜1","최지혜2"};
	Color[] color = {Color.red, Color.orange, Color.blue, Color.yellow, Color.green, Color.pink, Color.black, new Color(70,150,65), new Color(40,42,245)};
	
	public WindowEvent_3(String title) {
		super(title);
		int i;
		
		for (i = 0; i < 9; i++) {
			win[i] = new Frame();
			win[i].setBackground(color[i]);
			win[i].setLocation(i*200, i*100);  // 값을 늘리면 더 완만하게 나오고, 줄이면 더 경사지게 나온다.
			win[i].setSize(150, 100);
			win[i].addWindowListener(new WindowHandler());
			win[i].setVisible(true);
			
		}
	}
	
	class WindowHandler extends WindowAdapter {
		public void windowClosing(WindowEvent e) {  // windowClosing 철자가 틀려도 오류는 뜨지 않지만, 닫히지는 않음.
			String msg = "";  // null
			Window obj = (Window) e.getSource();
			
			for (int i = 0; i < 9; i++) {
				if (obj == win[i]) {
					msg = str[i];
					win[i].dispose();  // 현재의 윈도우를 닫아라(하나씩 닫을 수 있음)
				}
				
			}
			System.out.println("닫힌 윈도우 색 : " + msg);
		}
		
		public void windowIconified(WindowEvent e) {  // 최소화 누르면 전체가 닫힘(어플리케이션 전체가 닫히는 것)
			System.out.println(" 윈도우 닫기 ");  // exit 와 순서를 바꾸면 '윈도우 닫기'가 뜨지 않음
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		new WindowEvent_3("Window Event Test");
	}
}

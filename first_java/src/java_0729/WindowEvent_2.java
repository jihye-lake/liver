package java_0729;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEvent_2 extends Frame {
	
	public WindowEvent_2(String title) {
		super(title);
		
		addWindowListener(new Handler());
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new WindowEvent_2("Window Event Test");
	}
	
	class Handler extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.out.println("윈도우 닫기");
			System.exit(0); //  프로그램 종료 => 한 칸 위에 있으면 닫혀도 열리지 않는다.
		}
	}
	
	

}

package java_0722;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Exit_1 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
}

public class Layout_1 extends Frame{  // 해상도가 다양하기 때문에 Layout 을 쓰지 않고 프레임을 생성하는 것은 권장하지 않음(잘릴 수 있으니까)
	
	public Layout_1(String title) {
		super(title);
		setLayout(null); // 레이아웃 관리자 사용 안하기
		
		Button btn1 = new Button("버튼 1");
		btn1.setLocation(20, 30);
		btn1.setSize(70, 50);
		add(btn1);
		
		Button btn2 = new Button("버튼 2");
		btn2.setBounds(210,200,100,30);
		add(btn2);
		
		TextArea txt = new TextArea();
		txt.setBounds(50, 100, 100, 150);
		add(txt);
		
		setLocation(900,300);
		setSize(350,300);
		setVisible(true);
		
		Exit_1 end = new Exit_1();
		addWindowListener(end);
	}
	
	public static void main(String[] args) {
		new Layout_1("Layout Test");
	}

}

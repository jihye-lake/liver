package java_0722;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Exit_5 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

public class Event_1 extends Frame implements ActionListener {
	
	public Event_1(String title) {
		super(title);
		Button btn = new Button("버튼");
		btn.addActionListener(this);  // 위의 버튼에 리스너를 달았다 => 액션컴포넌트에 의해서 이벤트가 발생한다
		// this 대신 Anonymous 와 Handler 방식이 더 있음.
		
		add(btn);
		setSize(300, 300);
		setVisible(true);		
		
		Exit_5 end = new Exit_5();
		addWindowListener(end);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("*************************이벤트 발생 정보****************************");
		System.out.println("e.getSource() Method : " + e.getSource());
		System.out.println("e.toString() : " + e.toString());
		System.out.println("e.getID() : " + e.getID());  // 여기 뜨는 건 하나의 구별기호임
		System.out.println("*********************************************************************");
		
		
	}
	
	
	
	public static void main(String[] args) {
		new Event_1("Event Test");
		
	}

}

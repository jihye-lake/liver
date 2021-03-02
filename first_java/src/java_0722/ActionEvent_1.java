package java_0722;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Exit_6 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

public class ActionEvent_1 extends Frame implements ActionListener{  //  Ctrl + 1 엔터
	
	Label lbl_info;
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
	
	public ActionEvent_1(String title) {
		super(title);
		

		
		lbl_info = new Label("버튼을 눌러 주세요.");  // 디폴트로 뜨는 문자
		btn1 = new Button("◀ 버튼");
		btn2 = new Button("● 버튼");
		btn3 = new Button("▶ 버튼");
		btn1.addActionListener(this);  // ActionListener 가 갖고있는 자기자신
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		Panel panel = new Panel();
		
		panel.add(btn1);
		panel.add(btn2);  // 버튼의 순서를 정하는 곳
		panel.add(btn3);
		
		add("Center", panel);
		add("South", lbl_info);
		
		setSize(300, 200);
		setVisible(true);
		
		Exit_6 end = new Exit_6();
		addWindowListener(end);
	}

	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if ((Button)obj == btn1) { // obj 를 버튼으로 형변환 한 다음에 그게 btn1 과 같다면(눌렸다면)
			
			lbl_info.setText("왼쪽 버튼이 눌렸습니다.");  //  set 은 값을 가져온다, get 은 값을 가져간다
			System.out.println("왼쪽 버튼이 눌렸습니다.");  // 콘솔창에도 뜬다
			
		} else if ((Button)obj == btn2) {
			
			lbl_info.setText("가운데 버튼이 눌렸습니다.");
			System.out.println("가운데 버튼이 눌렸습니다.");  // 콘솔창에도 뜬다			
			
		} else if ((Button)obj == btn3) {
			lbl_info.setText("오른쪽 버튼이 눌렸습니다.");
			System.out.println("오른쪽 버튼이 눌렸습니다.");
		}
		
	}

	public static void main(String[] args) {
		new ActionEvent_1("ActionEvent Test");
	}
}

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

class Exit_7 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

public class ActionEvent_1_1 extends Frame implements ActionListener{  //  Ctrl + 1 엔터
	
	Label lbl_info;
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
	
	public ActionEvent_1_1(String title) {
		super(title);
		

		
		lbl_info = new Label("버튼을 눌러 주세요.");
		btn1 = new Button("◀ 버튼");
		btn2 = new Button("● 버튼");
		btn3 = new Button("▶ 버튼");
		btn4 = new Button("▶ 버튼");
		btn5 = new Button("▶ 버튼");
		btn6 = new Button("▶ 버튼");
		btn7 = new Button("▶ 버튼");
		btn8 = new Button("▶ 버튼");
		btn9 = new Button("▶ 버튼");
		btn10 = new Button("▶ 버튼");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn10.addActionListener(this);
		
		Panel panel = new Panel();
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(btn7);
		panel.add(btn8);
		panel.add(btn9);
		panel.add(btn10);
		
		add("Center", panel);
		add("South", lbl_info);
		
		setSize(300, 200);
		setVisible(true);
		
		Exit_7 end = new Exit_7();
		addWindowListener(end);
	}

	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if ((Button)obj == btn1) {
			
			lbl_info.setText("왼쪽 버튼이 눌렸습니다.");
			System.out.println("왼쪽 버튼이 눌렸습니다.");  // 콘솔창에도 뜬다
			
		} else if ((Button)obj == btn2) {
			
			lbl_info.setText("가운데 버튼이 눌렸습니다.");
			System.out.println("가운데 버튼이 눌렸습니다.");  // 콘솔창에도 뜬다			
			
		} else if ((Button)obj == btn3) {
			lbl_info.setText("오른쪽 버튼이 눌렸습니다.");
			System.out.println("오른쪽 버튼이 눌렸습니다.");
		} else
			lbl_info.setText("'꽝' 입니다 ㅋㅋㅋㅋㅋㅋㅋ");
			System.out.println("'꽝' 입니다 ㅋㅋㅋㅋㅋㅋㅋ");
		
	}

	public static void main(String[] args) {
		new ActionEvent_1_1("ActionEvent Test");
	}
}

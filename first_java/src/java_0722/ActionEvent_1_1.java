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

public class ActionEvent_1_1 extends Frame implements ActionListener{  //  Ctrl + 1 殖斗
	
	Label lbl_info;
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
	
	public ActionEvent_1_1(String title) {
		super(title);
		

		
		lbl_info = new Label("獄動聖 喚君 爽室推.");
		btn1 = new Button("�� 獄動");
		btn2 = new Button("＋ 獄動");
		btn3 = new Button("∈ 獄動");
		btn4 = new Button("∈ 獄動");
		btn5 = new Button("∈ 獄動");
		btn6 = new Button("∈ 獄動");
		btn7 = new Button("∈ 獄動");
		btn8 = new Button("∈ 獄動");
		btn9 = new Button("∈ 獄動");
		btn10 = new Button("∈ 獄動");
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
			
			lbl_info.setText("図楕 獄動戚 喚携柔艦陥.");
			System.out.println("図楕 獄動戚 喚携柔艦陥.");  // 嬬車但拭亀 近陥
			
		} else if ((Button)obj == btn2) {
			
			lbl_info.setText("亜錘汽 獄動戚 喚携柔艦陥.");
			System.out.println("亜錘汽 獄動戚 喚携柔艦陥.");  // 嬬車但拭亀 近陥			
			
		} else if ((Button)obj == btn3) {
			lbl_info.setText("神献楕 獄動戚 喚携柔艦陥.");
			System.out.println("神献楕 獄動戚 喚携柔艦陥.");
		} else
			lbl_info.setText("'歌' 脊艦陥 せせせせせせせ");
			System.out.println("'歌' 脊艦陥 せせせせせせせ");
		
	}

	public static void main(String[] args) {
		new ActionEvent_1_1("ActionEvent Test");
	}
}

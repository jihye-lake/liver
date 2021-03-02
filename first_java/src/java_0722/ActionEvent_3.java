package java_0722;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
//class Exit_9 extends WindowAdapter {
//	public void windowclosing(WindowEvent e) {
//		
//	}
//}

public class ActionEvent_3 extends Frame implements ActionListener {
	
	Label lbl_info;
	Button[] btn = new Button[10];
	Color[] color = {Color.red,Color.orange,Color.yellow,Color.green,Color.magenta,Color.cyan,Color.gray,(new Color(150,244,245)), (new Color(130,244,132)), (new Color(51,51,170))};
	String[] string = {"Red", "Orange", "Yellow", "Green","Magenta","Cyan","Gray","¾îÂ¼°í","ÀúÂ¼°í","¿äÂ¼°í"};
	
	public ActionEvent_3(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		for (int i = 0; i < 10; i++) {
			btn[i] = new Button(string[i]);
			btn[i].setForeground(color[i]);
			btn[i].addActionListener(this);

			add(btn[i]);

//			Exit_9 end = new Exit_9();
//			addWindowListener(end);
		}
		
		setSize(300, 200);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new ActionEvent_3("ActionEvent Test");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button obj = (Button) e.getSource();
		
		for (int i = 0; i < 10; i++) {
			if (obj == btn[i]) {
				this.setBackground(color[i]);
							
			}
			
			System.out.println(e.getActionCommand() + " ´­·È½À´Ï´Ù. \n");
			
		}
	}
	

}

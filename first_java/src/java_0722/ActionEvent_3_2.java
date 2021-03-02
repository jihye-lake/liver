package java_0722;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionEvent_3_2 extends Frame implements ActionListener {
	
	Label lbl_info;
	Button[] btn = new Button[9];
	Color[] color = {Color.red,Color.orange,Color.yellow,Color.green,Color.magenta,Color.cyan,Color.gray,(new Color(150,244,245)), (new Color(130,244,132))};
	String[] string = {"Red", "Orange", "Yellow", "Green","Magenta","Cyan","Gray","¾îÂ¼°í","ÀúÂ¼°í"};
	
	Panel p_1 = new Panel();
	Panel p_2 = new Panel();
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Panel p4 = new Panel();
	
	public ActionEvent_3_2(String title) {
		super(title);
		
		for (int i = 0; i < 9; i++) {
			btn[i] = new Button(string[i]);
			btn[i].setForeground(color[i]);
			btn[i].addActionListener(this);
			
			p_1.add(btn[i]);

		}
		
		add("North", p_1);
		add("Center", p_2);
		
		p_2.add(p1);
		p_2.add(p2);
		p_2.add(p3);
		p_2.add(p4);
		
		p_2.setLayout(new GridLayout(2, 2));
		
		setSize(500, 500);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new ActionEvent_3_2("ActionEvent Test");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button obj = (Button) e.getSource();
		
		for (int i = 0; i < 9; i++) {
			if (obj == btn[i]) {
				p1.setBackground(color[i%9]);
				p2.setBackground(color[(i+1)%9]);
				p3.setBackground(color[(i+2)%9]);
				p4.setBackground(color[(i+3)%9]);
			}
			
			System.out.println(e.getActionCommand() + " ´­·È½À´Ï´Ù. \n");
			
		}
	}
	

}
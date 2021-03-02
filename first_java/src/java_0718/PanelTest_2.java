package java_0718;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class PanelTest_2 extends Frame {
	
	public PanelTest_2(String title) {
		super(title);
		
		Panel panel1 = new Panel();
		
		panel1.add(new Button("Panel 1 위의 버튼"));
		panel1.add(new Checkbox("최지혜"));
		
		Panel panel2 = new Panel();
		
		panel2.add(new Label("라벨라벨"));
		panel2.add(new Button("Panel2 위의 버튼"));
		
		add("North", panel1);  //패널과 버튼을 위치시킴
		add("Center", new Button("버튼"));  //Center 는 누적됨. 구별하고 싶으면 Panel 을 따로 만들면 됨.
		add("South", panel2);
		
		setLocation(900, 500);
		setSize(400, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new PanelTest_2("Panel Test");
	}

}

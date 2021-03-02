package java_0718;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class PanelTest_2_2 extends Frame {  // 버튼 두 개를 만들어서 중앙에 배치하기
															   // setLayout|(null); 을 해주고
															   // panel 따로따로 Size 와 Location 해주기
															  
		public PanelTest_2_2(String title) {
		super(title);
		setLayout(null);
//		setLocation(900, 200);
		setSize(400, 400);
		setVisible(true);
		setBackground(new Color(230,230,230));
		
		Panel panel1 = new Panel();
		
		panel1.add(new Button("Panel 1 위의 버튼"));
		panel1.add(new Checkbox("최지혜"));
		panel1.setSize(300, 100);
		panel1.setLocation(50, 40);  //프레임을 패널 위에 올려서 배치시킨다.
//		panel1.setBackground(new Color(207,144,155));
		
		Panel panel2 = new Panel();
		
		panel2.add(new Label("라벨라벨"));
		panel2.add(new Button("Panel2 위의 버튼"));
		panel2.setSize(300, 100);
		panel2.setLocation(50, 350);  //프레임을 패널 위에 올려서 배치시킨다.
//		panel2.setBackground(new Color(255,205,18));
		
		
		Panel panel3 = new Panel();
		
		panel3.add(new Button("버튼1"));
		panel3.setSize(100, 100);
		panel3.setLocation(50, 150);  //프레임을 패널 위에 올려서 배치시킨다.
//		panel3.setBackground(new Color(0,51,153));
		
		Panel panel4 = new Panel();
		
		panel4.add(new Button("버튼2"));
		panel4.setSize(100, 100);
		panel4.setLocation(150, 150);  //프레임을 패널 위에 올려서 배치시킨다.
		
		
		add(panel1);  //패널과 버튼을 위치시킴
//		add("Center", new Button("버튼"));  //Center 는 누적됨. 구별하고 싶으면 Panel 을 따로 만들면 됨.
		add(panel2);
		add(panel3);
		add(panel4);
		
		
	}
	
	public static void main(String[] args) {
		new PanelTest_2_2("Panel Test");
	}

}
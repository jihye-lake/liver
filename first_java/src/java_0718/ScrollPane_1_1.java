package java_0718;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;

public class ScrollPane_1_1 extends Frame{
	
	public ScrollPane_1_1(String title) {
		super(title);
		
		ScrollPane srp = new ScrollPane();
		
		srp.setSize(220, 200);
		
		Panel panel = new Panel();
		Panel panel2 = new Panel();
		panel.setLayout(new BorderLayout());
		
		TextArea txt = new TextArea("텍스트에어리어");
		txt.setBackground(new Color(207,144,255));
		
		panel.add("North", new Button("버튼"));
//		panel.add("Center", txt); //TextArea 에 색 입히기 첫 번째 방법
		panel.add("Center", new TextArea("두 번째 방법")).setBackground(new Color(10,20,60)); //TextArea 에 색 입히기 두 번째 방법
		panel.add("South", new Button("확인"));
		
		panel2.add("North", new Button("버튼"));
//		panel.add("Center", txt); //TextArea 에 색 입히기 첫 번째 방법
		panel2.add("Center", new TextArea("두 번째 방법")).setBackground(new Color(240,60,50)); //TextArea 에 색 입히기 두 번째 방법
		panel2.add("South", new Button("확인"));
		
		srp.add(panel);
		srp.add(panel2);
		
		add("Center", srp);
		
		setLocation(900, 200);
		setSize(200, 200);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new ScrollPane_1_1("ScrollPane Test");
	}

}

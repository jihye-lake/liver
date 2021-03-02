package java_0718;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("Panel Test");
		
		ff.setLocation(900, 500);
		ff.setSize(450, 350);
		ff.setLayout(null);  // Layout Manager 을 사용하지 않는다.
		ff.setBackground(new Color(189,189,189));
		
		Panel p1 = new Panel();
		p1.setBackground(new Color(178,235,244));
		p1.setSize(150, 100);
		p1.setLocation(50, 50);  // 꼭짓점의 위치를 잡는다(모서리에서부터 가로, 세로 50 가서
		
		Panel p2 = new Panel();
		p2.setSize(150, 100);
		p2.setLocation(50, 170);
		p2.setBackground(new Color(255,205,18));

		Panel p3 = new Panel();
		p3.setSize(150, 100);
		p3.setLocation(250, 50);
		p3.setBackground(new Color(171,242,0));
	
		Panel p4 = new Panel();
		p4.setSize(150, 100);
		p4.setLocation(250, 170);
		p4.setBackground(new Color(207,144,155));
		
		Button ok = new Button("OK");
		Button cancel = new Button("CANCEL");
		Button CH = new Button("최지혜");
		Button PH = new Button("010-5555-6666");
		
		
		p1.add(ok);
		p2.add(cancel);
		p3.add(CH);
		p4.add(PH);
		ff.add(p1);
		ff.add(p2);
		ff.add(p3);
		ff.add(p4);
		
		ff.setVisible(true);
		
		 // 버튼을 패널에 올리고, 다시 패널을 프레임에 붙인 거다
		
			}

}

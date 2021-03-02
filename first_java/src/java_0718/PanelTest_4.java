package java_0718;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class PanelTest_4 extends Frame{
	
	public PanelTest_4(String title) {  // 프레임에 배치된 화면이 안 보일 경우에 스크롤바로 움직일 수 있다
		super(title);
		
		CheckboxGroup cbg;
		
		Panel panel1 = new Panel();
		
		panel1.setBackground(new Color(200,250,50));
		panel1.add(new Checkbox("윈도우2000"));
		panel1.add(new Checkbox("리눅스"));
		panel1.add(new Checkbox("솔라리스"));
		panel1.add(new Checkbox("윈도우10"));
		
		Panel panel2 = new Panel();
		panel2.setBackground(new Color(200,80,250));
		
//		Label lbl1 = new Label("환경설정", Label.CENTER);
//		lbl1.setBackground(new Color());
		panel2.add(new Label("환경설정", Label.CENTER));
		panel2.add(new Button("불러오기"));
		panel2.add(new Button("저   장"));
		panel2.add(new Button("다른 이름으로 저장"));
		
		cbg = new CheckboxGroup();
		
		Panel panel3 = new Panel();
		
		panel3.add(new Label("내가 좋아하는 산", Label.CENTER));
		panel3.add(new Checkbox("북망산", cbg, true));
		panel3.add(new Checkbox("관악산", cbg, false));
		panel3.add(new Checkbox("주왕산", cbg, false));
		panel3.add(new Checkbox("아차산", cbg, false));
		
		panel3.setBackground(new Color(20,230,0));
		
		
		add("North", panel1);  //만든 라벨, 체크박스 등등이 패널에 붙고, 패널이 프레임에 붙는다
		add("Center", panel2);
		add("South", panel3);
		
		
		setLocation(900, 200);
		setSize(450, 180);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new PanelTest_4("Panel Test");
	}

}

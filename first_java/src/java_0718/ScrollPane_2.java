 package java_0718;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ScrollPane_2 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("ScrollPane Test");
		
		ff.setSize(300, 200);
		
		ScrollPane spp = new ScrollPane();  // 컴포넌트에 스크롤 기능을 제공한다.
															// 한 패널에 한 스크롤만 제공한다.
		Panel pp = new Panel();
		
		pp.setBackground(new Color(20,90,30));
		pp.add(new Button("첫 번째"));
		pp.add(new Button("두 번째"));
		pp.add(new Button("세 번째"));
		pp.add(new Button("네 번째"));
		
		spp.add(pp);
		ff.add("Center",spp);
		
		ff.setVisible(true);
		
		
		
	}

}

package java_0718;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest_3 extends Frame {
	
	Panel n,w,e,c,s;
	
	public PanelTest_3(String title) {
		super(title);
//		setLayout(null);
		
		n = new Panel();
		w = new Panel();
		e = new Panel();
		c = new Panel();
		s = new Panel();
		
//		n.setSize(50, 50);
//		w.setSize(50, 50);
//		e.setSize(50, 50);
//		c.setSize(50, 50);
//		s.setSize(50, 50);
//		
//		n.setLocation(100,40);
//		w.setLocation(40,200);
//		e.setLocation(500,200);
//		c.setLocation(300,300);
//		s.setLocation(300,500);
	
		n.setBackground(new Color(178,235,244));
		w.setBackground(new Color(16,98,10));
		e.setBackground(new Color(0,51,153));
		c.setBackground(new Color(189,189,189));
		s.setBackground(new Color(25,120,250));
		
		n.add(new Button("페널 1"));
		w.add(new Button("페널 2"));
		e.add(new Button("페널 3"));
		c.add(new Button("페널 4"));
		s.add(new Button("페널 5"));
		
		add("North", n);
		add("West", w);
		add("East", e);
		add("Center", c);  //위치를 지정하지 않고 n, w, e 등 하나만 쓰면 마지막 것만 꽉차게 나오게 된다.
		add("South", s);
		
//		add(n);
//		add(w);
//		add(e);
//		add(c);  // 이렇게 동서남북의 위치를 지정하지 않고 n, w, e 등 하나만 쓰면 마지막 것만 꽉차게 나오게 된다.
//		add(s);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PanelTest_3("Panel Test");
	}

}

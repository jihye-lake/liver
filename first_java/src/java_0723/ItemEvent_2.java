package java_0723;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_2 extends Frame {
	
	CheckboxGroup group;
	Checkbox cb1, cb2, cb3, cb4, cb5;
//	Panel p_1 = new Panel();
//	Panel p_2 = new Panel();
//	Panel p1 = new Panel();
//	Panel p2 = new Panel();
	
	public ItemEvent_2(String title) {
		super(title);
		
		group = new CheckboxGroup();
		cb1 = new Checkbox("red", group, false);
		cb2 = new Checkbox("green", group, true);
		cb3 = new Checkbox("blue", group, false);
		cb4 = new Checkbox("ÃÖÁöÇý1", group, false);
		cb5 = new Checkbox("ÃÖÁöÇý2", group, false);
		
//		add("North", p_1);
//		add("Center", p_2);
//		
//		p_2.add(p1);
//		p_2.add(p2);
		
		cb1.addItemListener(new Handler());
		cb2.addItemListener(new Handler());
		cb3.addItemListener(new Handler());
		cb4.addItemListener(new Handler());
		cb5.addItemListener(new Handler());
		
//		setLayout(new GridLayout(1,2));
		setLayout(new FlowLayout());
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		
		setBackground(new Color(189,189,189));
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ItemEvent_2("Item Event Test");
	}

	class Handler implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			Checkbox cb = (Checkbox) e.getSource();
			
			
			String color = cb.getLabel();
			
			if (color.equals("red")) {
				setBackground(Color.red);
				
			} else if (color.equals("green")) {
				setBackground(Color.green);
				
			} else if (color.equals("blue")) {
				setBackground(Color.blue);
				
			} else if (color.equals("ÃÖÁöÇý1")) {
				setBackground(new Color(215,217,255));
			
			} else if (color.equals("ÃÖÁöÇý2")) {
				setBackground(new Color(120,255,150));
			}
		}
	}
	
}

package java_0717;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBar_2 extends Frame implements AdjustmentListener{
	Scrollbar red, green, blue;
	Panel panel1, panel2;
	
	public ScrollBar_2(String title) {
		super(title);
		red = new Scrollbar(Scrollbar.VERTICAL, 10, 20, 0, 275);
		green = new Scrollbar(Scrollbar.VERTICAL, 10, 20, 0, 275);
		blue = new Scrollbar(Scrollbar.VERTICAL, 10, 20, 0, 275);
		
		red.addAdjustmentListener(this);
		green.addAdjustmentListener(this);
		blue.addAdjustmentListener(this);
		
		panel1 = new Panel();
		panel2 = new Panel();
		
		panel1.setSize(200, 100);
		panel2.setSize(200, 100);
		
		panel2.add(red);
		panel2.add(green);
		panel2.add(blue);
		
		add("Center", panel1);
		add("South", panel2);
		
		setLocation(900, 200);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		panel1.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
		
		System.out.println("»¡°­ : " + red.getValue());
		System.out.println("ÃÊ·Ï : " + green.getValue());
		System.out.println("ÆÄ¶û : " + blue.getValue());
		
	}
	
	
	public static void main(String[] args) {
		new ScrollBar_2("À¯");
	}

}

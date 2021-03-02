package java_0723;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class AdjustmentEvent_1 extends Frame implements AdjustmentListener {
	
	Scrollbar r,g,b;
	Panel panel;
	
	public AdjustmentEvent_1(String title) {
		super(title);
		
		r = new Scrollbar(Scrollbar.HORIZONTAL, 255, 20, 0, 275);  // 처음부터 노란색이 나오게 하려면 (255, 20, 0, 275) 
		g = new Scrollbar(Scrollbar.HORIZONTAL, 255, 20, 0, 275);												// (255, 20, 0, 275) 로 설정해 주면 된다.
		b = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 275);		// 이벤트를 발생시키려면 한 번 눌러줘야 하므로 red green 한 번 클릭하면 노란색이 나온다.
		
		r.addAdjustmentListener(this);
		g.addAdjustmentListener(this);
		b.addAdjustmentListener(this);
		
		panel = new Panel();
		
		panel.add(r);
		panel.add(g);
		panel.add(b);
		
		add("Center", panel);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new AdjustmentEvent_1("Adjustment Event Test");
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		
		int red, green, blue;
		
		red = r.getValue();
		green = g.getValue();
		blue = b.getValue();
		
		System.out.println("red : " + red + ", green : " + green + ", blue" + blue);
		panel.setBackground(new Color(red,green,blue));
		
	}

}

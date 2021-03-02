package java_0723;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class AdjustmentEvent_1_1 extends Frame {
	
	Scrollbar r,g,b;
	Panel panel;
	
	public AdjustmentEvent_1_1(String title) {
		super(title);
		
		r = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 255, 275);  // ó������ ������� ������ �Ϸ��� (255, 20, 0, 275) 
		g = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 255, 275);												// (255, 20, 0, 275) �� ������ �ָ� �ȴ�.
		b = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 275);		// �̺�Ʈ�� �߻���Ű���� �� �� ������� �ϹǷ� red green �� �� Ŭ���ϸ� ������� ���´�.
		
		r.addAdjustmentListener(new Handler());  // Handler �� �� ���� ��(�����ϱ� ������) - �� ���α׷��� Ŀ���� ���� ������ ����
		g.addAdjustmentListener(new Handler());
		b.addAdjustmentListener(new Handler());
		
		panel = new Panel();
		
		panel.add(r);
		panel.add(g);
		panel.add(b);
		
		add("Center", panel);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new AdjustmentEvent_1_1("Adjustment Event Test");
	}
	
	class Handler implements AdjustmentListener {

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
}


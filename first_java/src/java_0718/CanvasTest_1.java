package java_0718;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class CanvasTest_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("CanvasTest");
		ff.setSize(300, 300);
		ff.setLayout(null);
		
		Canvas cc = new Canvas();
		
		cc.setBackground(new Color(150,30,20));
		cc.setBounds(100, 100, 150, 100);
		
		ff.add(cc);
		
		ff.setVisible(true);
		
	}

}

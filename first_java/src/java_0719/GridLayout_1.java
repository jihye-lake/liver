package java_0719;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayout_1 extends Frame {
	
	Button[] btn = new Button[6];
	
	public GridLayout_1(String title) {
		super(title);
		
		setLayout(new GridLayout(3,2));
		
		for (int i = 0; i < 6; i++) {
			btn[i] = new Button(i + "Button");
			add(btn[i]);
			
		}
		
		setSize(200, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GridLayout_1("GridLayout Test");
	}

}

package java_0730;

import java.awt.Frame;
import java.awt.Graphics;

public class Graphics_1 extends Frame {
	
	public Graphics_1(String title) {
		super(title);
		
		setSize(300, 250);
		setVisible(true);
	}
	
	public void paint(Graphics g) {  // paint 는 자동호출임(run과 마찬가지로)
		g.drawLine(10, 10, 190, 190);  // 10, 10 은 시작점
		g.drawRect(10, 10, 100, 100);  // 사각형
		g.drawOval(55, 55, 100, 100);  // 원 100,100 그 안에서 원을 그리겠다는 뜻
		g.drawArc(100, 100, 80, 80, 0, 90); // 80, 80 안에서 0번부터 시작해서 90도만큼 돌리겠다는 뜻
		
	}
	
	public static void main(String[] args) {
		new Graphics_1("Graphics Test");
	}

}

package java_0730;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graphics_2 extends Frame {
	
	public static void main(String[] args) {
		new Graphics_2("Graphics Test");
	}
	
	public void paint(Graphics g ) {  // g 는 붓이라는 뜻
		g.setFont(new Font("Univers", Font.PLAIN, 17));
		g.drawString("Graphics 를 이용해 그림을 그립니다.", 68, 50);  // 10,50 은 시작하는 위치
		
		g.drawOval(50,  100,  50,  50);
		
		g.setColor(Color.blue);
		g.fillOval(100, 100, 50, 50);  // 타원형으로 만들고 싶으면 50,50 의 숫자를 다르게 하면 됨
		
		g.setColor(Color.red);
		g.drawLine(100, 100, 150, 150);
		
		g.fillRoundRect(200, 100, 120, 80, 30, 30);
						//    x,    y,   가로, 세로, 테두리는 30,30의 원에 들어가는 테두리를 갖는다(원을 좀 더 완만하게 하고 싶으면 크기를 키우기)
		
		g.setColor(Color.orange);
//		g.fillPolygon(new int[] {50,  100,  150, 200}, new int[] {250, 200, 200, 250}, 4);  // 4는 4각형을 그리겠다
		// 다각형
//		g.fillPolygon(new int[] {50, 100, 150, 200, 50, 100, 150, 200}, new int[] {250, 200, 200, 250, 250, 300, 300, 250}, 8);  // 육각형 그리기
		g.fillPolygon(new int[] {50, 100, 150, 200, 150, 100}, new int[] {250, 200, 200, 250, 300, 300}, 6);  // 육각형 그리기
		
//		g.setColor(Color.cyan);
//		g.fillArc(250, 200, 100, 100, 0, 120);
		//			x	  y	   사각형크기, 0도부터 시작해서 120도를 그려라
		
		g.setColor(new Color(0,51,153));
		g.fillArc(250, 200, 100, 100, 45, 270);  // 펙맨그리기
			
	}
	
	public Graphics_2(String title) {
		super(title);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
			
		});
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
	}

}

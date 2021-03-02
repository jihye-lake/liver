package java_0731;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class Font_1 {
	
	public static void main(String[] args) {
		
		XCanvas canvas = new XCanvas();
		
		Frame ff = new Frame("Font Test");
		ff.add(canvas);
		
		ff.setSize(350, 300);
		ff.setVisible(true);

	}

}

class XCanvas extends Canvas {
	
	Font font = null;
	
	public void paint(Graphics g) {
		font = new Font("Timesroman", Font.BOLD, 23);
		g.setFont(font);
		
		g.drawString("  비오는 수요일", 50, 50);
		
		font = new Font("바탕", Font.BOLD, 23);
		g.setFont(font);
		
		g.drawString("  비오는 수요일", 50, 70);
		
		font = new Font("Bradley", Font.BOLD, 23);
		g.setFont(font);
		
		g.drawString("  비오는 수요일", 50, 90);		
		
		font = new Font("궁서", Font.BOLD | Font.ITALIC, 17);
		g.setFont(font);
		g.setColor(Color.green);
		
		g.drawString("시원한 강바람을 찾아", 50, 120);
		
		font = new Font("Serif", Font.BOLD | Font.ITALIC, 20);  // Font. 이렇게 쓰는 건 기울기나 굵기 등의 값임
																				// "" 여기 안에 들어가는 게 폰트 값
		g.setFont(font);
		g.setColor(new Color(0,51,153));
		
		g.drawString("서울특별시 광진구 중곡동", 50, 200);
		
		
	}
	
}

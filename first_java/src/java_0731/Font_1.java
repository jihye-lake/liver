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
		
		g.drawString("  ����� ������", 50, 50);
		
		font = new Font("����", Font.BOLD, 23);
		g.setFont(font);
		
		g.drawString("  ����� ������", 50, 70);
		
		font = new Font("Bradley", Font.BOLD, 23);
		g.setFont(font);
		
		g.drawString("  ����� ������", 50, 90);		
		
		font = new Font("�ü�", Font.BOLD | Font.ITALIC, 17);
		g.setFont(font);
		g.setColor(Color.green);
		
		g.drawString("�ÿ��� ���ٶ��� ã��", 50, 120);
		
		font = new Font("Serif", Font.BOLD | Font.ITALIC, 20);  // Font. �̷��� ���� �� ���⳪ ���� ���� ����
																				// "" ���� �ȿ� ���� �� ��Ʈ ��
		g.setFont(font);
		g.setColor(new Color(0,51,153));
		
		g.drawString("����Ư���� ������ �߰", 50, 200);
		
		
	}
	
}

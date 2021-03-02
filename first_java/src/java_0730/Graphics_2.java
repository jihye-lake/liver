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
	
	public void paint(Graphics g ) {  // g �� ���̶�� ��
		g.setFont(new Font("Univers", Font.PLAIN, 17));
		g.drawString("Graphics �� �̿��� �׸��� �׸��ϴ�.", 68, 50);  // 10,50 �� �����ϴ� ��ġ
		
		g.drawOval(50,  100,  50,  50);
		
		g.setColor(Color.blue);
		g.fillOval(100, 100, 50, 50);  // Ÿ�������� ����� ������ 50,50 �� ���ڸ� �ٸ��� �ϸ� ��
		
		g.setColor(Color.red);
		g.drawLine(100, 100, 150, 150);
		
		g.fillRoundRect(200, 100, 120, 80, 30, 30);
						//    x,    y,   ����, ����, �׵θ��� 30,30�� ���� ���� �׵θ��� ���´�(���� �� �� �ϸ��ϰ� �ϰ� ������ ũ�⸦ Ű���)
		
		g.setColor(Color.orange);
//		g.fillPolygon(new int[] {50,  100,  150, 200}, new int[] {250, 200, 200, 250}, 4);  // 4�� 4������ �׸��ڴ�
		// �ٰ���
//		g.fillPolygon(new int[] {50, 100, 150, 200, 50, 100, 150, 200}, new int[] {250, 200, 200, 250, 250, 300, 300, 250}, 8);  // ������ �׸���
		g.fillPolygon(new int[] {50, 100, 150, 200, 150, 100}, new int[] {250, 200, 200, 250, 300, 300}, 6);  // ������ �׸���
		
//		g.setColor(Color.cyan);
//		g.fillArc(250, 200, 100, 100, 0, 120);
		//			x	  y	   �簢��ũ��, 0������ �����ؼ� 120���� �׷���
		
		g.setColor(new Color(0,51,153));
		g.fillArc(250, 200, 100, 100, 45, 270);  // ��Ǳ׸���
			
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

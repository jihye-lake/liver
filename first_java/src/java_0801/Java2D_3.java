package java_0801;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Java2D_3 extends Frame {
	
	GradientPaint grd, grd1;
	Ellipse2D.Double circle;
	
	public Java2D_3(String title) {
		super(title);
		
		grd = new GradientPaint(50, 50, new Color(178,235,244), 100, 100, new Color(255,150,150), true);
//											������ǥ	���ۻ�					����ǥ				����					�ݺ��� ����(�ݺ����� ���� => fasle , �ݺ��� => true)
//		�׶��̼� ȿ���� ���� ��ǥ�� ���� ����ǥ�� ������ ������ ������ ȿ��
		grd = new GradientPaint(100, 50, new Color(255,255,255), 100, 120, new Color(190,190,255), true);
		circle = new Ellipse2D.Double(50, 50, 500, 500);
		
		setSize(800, 800);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setPaint(grd);
		g2.setPaint(grd1);
		g2.fill(circle);
		
	}
	
	public static void main(String[] args) {
		new Java2D_3("2D Test");
	}

}

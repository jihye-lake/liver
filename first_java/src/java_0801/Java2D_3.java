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
//											시작좌표	시작색					끝좌표				끝색					반복의 여부(반복하지 않음 => fasle , 반복함 => true)
//		그라데이션 효과는 시작 좌표의 색이 끝좌표의 색으로 서서히 번지는 효과
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

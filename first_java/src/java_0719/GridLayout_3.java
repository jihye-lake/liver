package java_0719;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class GridLayout_3 { // 컬러파레트 생성
	public static void main(String[] args) {
		
		Frame ff = new Frame();
		ff.setLayout(new GridLayout(17,2));  // 17행, 2열
		
		Panel p1 = new Panel(); p1.setBackground(new Color(199,198,255));  // Color.13개
		Panel p2 = new Panel(); p2.setBackground(new Color(185,186,255));
		Panel p3 = new Panel(); p3.setBackground(new Color(174,173,255));
		Panel p4 = new Panel(); p4.setBackground(new Color(161,162,255));
		Panel p5 = new Panel(); p5.setBackground(new Color(149,150,255));
		Panel p6 = new Panel(); p6.setBackground(new Color(138,137,255));
		Panel p7 = new Panel(); p7.setBackground(new Color(129,128,255));
		Panel p8 = new Panel(); p8.setBackground(new Color(117,118,255));
		Panel p9 = new Panel(); p9.setBackground(new Color(106,104,255));
		Panel p10 = new Panel(); p10.setBackground(new Color(98,97,255));
		Panel p11 = new Panel(); p11.setBackground(new Color(84,83,255));
		Panel p12 = new Panel(); p12.setBackground(new Color(70,71,255));
		Panel p13 = new Panel(); p13.setBackground(new Color(62,63,255));
		Panel p14 = new Panel(); p14.setBackground(new Color(50,52,255));
		Panel p15 = new Panel(); p15.setBackground(new Color(46,45,255));
		Panel p16 = new Panel(); p16.setBackground(new Color(32,31,255));
		Panel p17 = new Panel(); p17.setBackground(new Color(19,18,255));
		
//			지  혜  씨  안  녕  하  세  요 ? ^^  
		
		ff.add(new Label("new Color(199,198,255)")); ff.add(p1);
		ff.add(new Label("new Color(185,186,255)")); ff.add(p2);
		ff.add(new Label("new Color(174,173,255)")); ff.add(p3);
		ff.add(new Label("new Color(161,162,255)")); ff.add(p4);
		ff.add(new Label("new Color(149,150,255)")); ff.add(p5);
		ff.add(new Label("new Color(138,137,255)")); ff.add(p6);
		ff.add(new Label("new Color(129,128,255)")); ff.add(p7);
		ff.add(new Label("new Color(117,118,255)")); ff.add(p8);
		ff.add(new Label("new Color(106,104,255)")); ff.add(p9);
		ff.add(new Label("new Color(98,97,255)")); ff.add(p10);
		ff.add(new Label("new Color(84,83,255)")); ff.add(p11);
		ff.add(new Label("new Color(70,71,255)")); ff.add(p12);
		ff.add(new Label("new Color(62,63,255)")); ff.add(p13);
		ff.add(new Label("new Color(50,52,255)")); ff.add(p14);
		ff.add(new Label("new Color(46,45,255)")); ff.add(p15);
		ff.add(new Label("new Color(32,31,255)")); ff.add(p16);
		ff.add(new Label("new Color(19,18,255)")); ff.add(p17);
		
		ff.setLocation(1100, 200);
		ff.setSize(350, 350);
		ff.setVisible(true);
		
	}

}

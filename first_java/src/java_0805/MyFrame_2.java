package java_0805;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel3 extends JPanel implements ActionListener {
	boolean flag = false;
	private int light_number = 0;
	
	public MyPanel3() {
		setLayout(new BorderLayout());
		JButton b = new JButton("traffic light turn on");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 200, 100, 100);	g.drawOval(200, 100, 100, 100);
		g.drawOval(100, 300, 100, 100);	g.drawOval(300, 100, 100, 100);
		g.drawOval(100, 400, 100, 100);	g.drawOval(400, 100, 100, 100);
		
		g.drawOval(400, 400, 100, 100);
		g.drawOval(300, 400, 100, 100);	g.drawOval(400, 300, 100, 100);
		g.drawOval(200, 400, 100, 100);	g.drawOval(400, 200, 100, 100);
		g.drawOval(100, 400, 100, 100);	g.drawOval(400, 100, 100, 100);
		
		
		if (light_number == 0) {
			g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			g.fillOval(100, 100, 100, 100);
			
		} else if (light_number == 1) {
			g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			g.fillOval(100, 200, 100, 100);
			
		} else if (light_number == 2){
			g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			g.fillOval(100, 300, 100, 100);
			
		} else {
			g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			g.fillOval(100, 400, 100, 100);
		}
		
		if (light_number == 0) {
			g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			g.fillOval(100, 100, 100, 100);
			
		} else if (light_number == 1) {
			g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			g.fillOval(200, 100, 100, 100);
			
		} else if (light_number == 2){
			g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			g.fillOval(300, 100, 100, 100);
			
		} else {
			g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			g.fillOval(400, 100, 100, 100);
		}
		
		
		if (light_number == 0) {
			g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			g.fillOval(400, 400, 100, 100);
			
		} else if (light_number == 1) {
			g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			g.fillOval(300, 400, 100, 100);
			
		} else if (light_number == 2){
			g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			g.fillOval(200, 400, 100, 100);
			
		} else {
			g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			g.fillOval(100, 400, 100, 100);
		}
		
		if (light_number == 0) {
			g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			g.fillOval(400, 400, 100, 100);
			
		} else if (light_number == 1) {
			g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			g.fillOval(400, 300, 100, 100);
			
		} else if (light_number == 2){
			g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			g.fillOval(400, 200, 100, 100);
			
		} else {
			g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			g.fillOval(400, 100, 100, 100);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (++light_number >= 4)
			light_number = 0;
		repaint();
		
	}	
}

public class MyFrame_2 extends JFrame {
	public MyFrame_2() {
		add(new MyPanel3());
		setSize(700, 700);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame_2();
	}
	
}
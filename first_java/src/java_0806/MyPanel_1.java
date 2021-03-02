package java_0806;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Ball1 {
	private int x = 100;
	private int y = 100;
	private int size = 50;
	private int xSpeed = 50;
	private int ySpeed = 50;
	
	public void draw(Graphics g) {
		g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
		g.fillOval(x, y, size, size);
	}
	
	public void update() {
		x += xSpeed;
		y += ySpeed;
		if ((x + size) > MyPanel.BOARD_WIDTH - size || x < 0) {  // x 가 0보다 작아면 다시 반대로 가라
			xSpeed = -xSpeed;
			
		}
		
		if ((y + size) > MyPanel.BOARD_HEIGHT - size || y < 0) {
			ySpeed = -ySpeed;
			
		}
	}
	
}

class Ball2 {
	private int x = 200;
	private int y = 200;
	private int size = 100;
	private int xSpeed = 50;
	private int ySpeed = 50;
	
	public void draw(Graphics g) {
		g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
		g.fillOval(x, y, size, size);
	}
	
	public void update() {
		x += xSpeed;
		y += ySpeed;
		if ((x + size) > MyPanel.BOARD_WIDTH - size || x < 15) {  // x 가 0보다 작아면 다시 반대로 가라
			xSpeed = -xSpeed;
			
		}
		
		if ((y + size) > MyPanel.BOARD_HEIGHT - size || y < 0) {
			ySpeed = -ySpeed;
			
		}
	}
	
}

public class MyPanel_1 extends JPanel {
	static final int BOARD_WIDTH = 1200;  // 고정된 사이즈를 가짐
	static final int BOARD_HEIGHT = 600;   // 고정된 사이즈를 가짐
	private Ball1 ball1 = new Ball1();
	private Ball2 ball2 = new Ball2();
	
	public MyPanel_1() {
		this.setBackground(new Color(150,150,250));
		Runnable task = () -> {
			while (true) {
				ball1.update();
				ball2.update();
				repaint();
				
// 람다식을 이용하여 무한으로 움직이게 한다
				try {
					Thread.sleep(70);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
	};
	
	new Thread(task).start();
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		ball1.draw(g);
		ball2.draw(g);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(MyPanel.BOARD_WIDTH, MyPanel.BOARD_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(new MyPanel_1());
	}
}
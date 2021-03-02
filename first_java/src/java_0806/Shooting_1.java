package java_0806;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class GraphicObject1 {
	BufferedImage img = null;
	int x = 0, y = 0;
	
	public GraphicObject1(String name) {
		try {
			img = ImageIO.read(new File(name));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(0);
//			e.printStackTrace();
		}
	}
	
	public void update() {
		
	}
	
	public void draw(Graphics g) {
		g.drawImage(img,  x, y, null);
	}
	
	public void KeyPressed(KeyEvent event) {
		
	}
}

class Missile1 extends GraphicObject {
	boolean launched = false;
	
	public Missile1(String name) {
		super(name);
		y = -100;
		
	}

	public void update() {
		if (launched) 
			y -= 5;  // 미사일 날아가는 속도
		if (y < -100) 
				launched = false;
			}
			
			public void KeyPressed(KeyEvent event, int x, int y) {
				if (event.getKeyCode() == KeyEvent.VK_SPACE) {
					launched = true;
					this.x = x;
					this.y = y;
				}
			}
		}
		
		class Enemy2 extends GraphicObject {
			int dx = 10;
			
			public Enemy2(String name) {
				super(name);
				x = 500;
				y = 100;
		}
		
		public void update() {
			x += dx;
			if (x < 0)
				dx = +10;
			if (x > 500)
				dx = -10;
		}
	}
		
		class Enemy3 extends GraphicObject {
			int dx = 10;
			
			public Enemy3(String name) {
				super(name);
				x = 300;
				y = -10;
			}
			
			public void update() {
				x += dx;
				if (x < 0)
					dx = +15;
				if (x > 500)
					dx = -15;
			}
		}
		
	class SpaceShip1 extends GraphicObject {
		public SpaceShip1(String name) {
			super(name);
			x = 150;
			y = 350;
		}
			
		public void KeyPressed(KeyEvent event) {
			if (event.getKeyCode() == KeyEvent.VK_LEFT) {
					x -= 10;					
			}
				
			if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
					x += 10;					
			}
				
//			if (event.getKeyCode() == KeyEvent.VK_LEFT) {
//					y -= 10;					
//			}
//				
//			if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
//					y += 10;					
//		}
	}
}
	
	class MyPanel5 extends JPanel implements KeyListener {
		Enemy2 enemy;
		Enemy3 enemy1;
		SpaceShip1 spaceship;
		Missile1 missile;
		ArrayList Missile_List = new ArrayList();
		
		public MyPanel5() {
			super();
			this.addKeyListener(this);
			this.requestFocus();
			setFocusable(true);
			this.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			
			enemy1 = new Enemy3("src\\images\\snack_bite.png");
			enemy = new Enemy2("src\\images\\combat.png");
			spaceship = new SpaceShip1("src\\images\\popcorn11.png");
			missile = new Missile1("src\\images\\popcorn_2.png");
			class MyThread extends Thread {
				public void run() {
					while (true) {
						enemy.update();
						enemy1.update();
						spaceship.update();
						missile.update();
						repaint();
						
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
//							e.printStackTrace();
						}
						
					}
				}
			}
		Thread t = new MyThread();
		t.start();
		}
		
		public void paint(Graphics g) {
			super.paint(g);
			
			enemy.draw(g);
			enemy1.draw(g);
			spaceship.draw(g);
			missile.draw(g);
		}
		
		public void keyPressed(KeyEvent event) {
			spaceship.KeyPressed(event);
			missile.KeyPressed(event, spaceship.x, spaceship.y);
		}
		
		public void keyReleased(KeyEvent args) {
			
		}
		
		public void keyTyped(KeyEvent args) {
			
		}
	}

public class Shooting_1 extends JFrame {
	public Shooting_1() {
		setTitle("  내가 제일 맛있는 과자다!!!!!!!! 다 비켜!!!!");
		add(new MyPanel5());
		setSize(600, 550);
		setVisible(true);
		ArrayList Missile_List = new ArrayList();
	}
	
	public static void main(String[] args) {
		new Shooting_1();
	}

}
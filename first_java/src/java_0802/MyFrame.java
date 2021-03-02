package java_0802;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import practice_2019.white_0624;

class GraphicObject {
	BufferedImage img = null;
	int x = 0, y = 0;
	
	public GraphicObject(String name) {
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

class Missile extends GraphicObject {
	boolean launched = false;
	
	public Missile(String name) {
		super(name);
		y = -200;

	}
	
	public void update() {
		if (launched) 
			y -= 1;
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
		
		class Enemy extends GraphicObject {
			int dx = -10;
			
			public Enemy(String name) {
				super(name);
				x = 500;
				y = 0;
		}
		
		public void update() {
			x += dx;
			if (x < 0)
				dx = +10;
			if (x > 500)
				dx = -10;
		}
	}
		
	class SpaceShip extends GraphicObject {
		public SpaceShip(String name) {
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
	
	class MyPanel extends JPanel implements KeyListener {
		Enemy enemy;
		SpaceShip spaceship;
		Missile missile;
		
		public MyPanel() {
			super();
			this.addKeyListener(this);
			this.requestFocus();
			setFocusable(true);
			
			enemy = new Enemy("bttrfly1.png");
			spaceship = new SpaceShip("bttrfly2.png");
			missile = new Missile("bttrfly3.png");
			class MyThread extends Thread {
				public void run() {
					while (true) {
						enemy.update();
						spaceship.update();
						missile.update();
						repaint();
						
						try {
							Thread.sleep(10);
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

public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("My Game");
		add(new MyPanel());
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}

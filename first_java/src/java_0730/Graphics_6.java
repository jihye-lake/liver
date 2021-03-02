package java_0730;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graphics_6 extends Frame implements MouseMotionListener {
	
	int x = 0;
	int y = 0;
	
	public Graphics_6(String title) {
		super(title);
		
		addMouseMotionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(100,100,500,500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Graphics_6("Graphics Test");
	}
	
	public void paint(Graphics g) {
		g.setColor(new Color((int)(Math.random()*220),(int)(Math.random()*120),(int)(Math.random()*140)));
		g.drawString("마우스를 움직이시오", 20, 50);
		g.drawString("●", x, y);
		
	}
	
	public void update(Graphics g) {
		paint(g);
	}

	@Override
	public void mouseDragged(MouseEvent me) {
		
	}

	@Override
	public void mouseMoved(MouseEvent me) {
		
		x = me.getX();
		y = me.getY();
		repaint();
		
	}

}

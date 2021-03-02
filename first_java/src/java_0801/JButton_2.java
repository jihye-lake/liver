package java_0801;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButton_2 extends JPanel {
	
	public JButton_2() {
		
		ImageIcon b1 = new ImageIcon("src\\images\\b1.gif");
		ImageIcon b1d = new ImageIcon("src\\\\images\\\\b1d.gif");
		ImageIcon b1p = new ImageIcon("src\\\\images\\\\b1p.gif");
		
		ImageIcon b2 = new ImageIcon("src\\\\images\\\\b2.gif");
		ImageIcon b2d = new ImageIcon("src\\\\images\\\\b2d.gif");
		ImageIcon b2p = new ImageIcon("src\\\\images\\\\b2p.gif");
		
		ImageIcon b3 = new ImageIcon("src\\\\images\\\\b3.gif");
		ImageIcon b3d = new ImageIcon("src\\\\images\\\\b3d.gif");
		ImageIcon b3p = new ImageIcon("src\\\\images\\\\b3p.gif");
		
		ImageIcon b4 = new ImageIcon("src\\\\images\\\\b4.jpg");
		ImageIcon b4d = new ImageIcon("src\\\\images\\\\b4d.jpg");
		ImageIcon b4p = new ImageIcon("src\\\\images\\\\b4p.jpg");
		
		setDoubleBuffered(true);
		setLayout(new GridLayout(1, 4, 5, 5));
		
		AbstractButton btn = new JButton();
		
		btn.setIcon(b1);  // 기본아이콘
		btn.setPressedIcon(b1d);  // 눌렀을 때 아이콘
		btn.setRolloverIcon(b1p);  // 
		add(btn);
		
		btn = new JButton();
		
		btn.setIcon(b2);
		btn.setPressedIcon(b2d);
		btn.setRolloverIcon(b2p);
		add(btn);
		
		btn = new JButton();
		
		btn.setIcon(b3);
		btn.setPressedIcon(b3d);
		btn.setRolloverIcon(b3p);
		add(btn);
		
		btn = new JButton();
		
		btn.setIcon(b4);
		btn.setPressedIcon(b4d);
		btn.setRolloverIcon(b4p);
		add(btn);
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(600, 200);
	}
	
	public static void main(String[] args) {
		JFrame jff = new JFrame("JButton Test");
		
		JButton_2 panel = new JButton_2();
		
		jff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jff.setForeground(Color.green);
		jff.setBackground(Color.lightGray);
//		jff.setForeground(new Color(16, 98, 10));
//		jff.setBackground(new Color(189, 189, 189));
		jff.getContentPane().add(panel, "Center");
		
		jff.setSize(panel.getPreferredSize());
		jff.setVisible(true);
	}
	
}

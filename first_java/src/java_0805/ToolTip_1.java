package java_0805;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ToolTip_1 extends JFrame {
	
	public ToolTip_1(String title) {
		super(title);
		
		JButton btn = new JButton("<html><font size=7 bgcolor = rgb(150,250,150)>¹öÆ°ÀÔ´Ï´Ù.</font></html>");
		JLabel lbl = new JLabel("ToolTab Test");
		JTextArea txt = new JTextArea("==^^==");
		
//		btn.setToolTipText("<html><font size=7 color=green>Æ«ÆÁÆ«ÆÁ ^^^^</font></html>");
		btn.setToolTipText("<html><font size=7 bgcolor = red color=rgb(250,150,150)>Æ«ÆÁ¾îÂ¼°í</font></html>");
																	// bgcolor Ãß°¡
//		btn.setBackground(new Color(250,250,150));
		lbl.setToolTipText("<html><font size=10 color=rgb(150,250,250)>³ª´Â ÀÚ¹Ù ÃÊº¸°¡ ¾Æ´Õ´Ï´Ù.</font></html>");
//		lbl.setBackground(new Color(150,150,250));
		txt.setToolTipText("<html><font size=7 color=rgb(150,250,150)>Æ«ÆÁÀº Á¤¸» ÁÁÀº ±â´ÉÀÔ´Ï´Ù.</font></html>");
//		txt.setBackground(new Color(150,250,150));
		
		getContentPane().add("North", lbl);
		getContentPane().add("Center", txt);
		getContentPane().add(btn, "South");
		
//		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 350);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ToolTip_1("ToolTip Test~~~");
	}

}

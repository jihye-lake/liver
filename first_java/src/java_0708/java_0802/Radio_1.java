package java_0802;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Radio_1 extends JFrame {  // AWT와 중복되는 것만 J 붙음. 중복되지 않는 것들은 J가 붙지 않는다.
	
	JCheckBox win, linux, solaris;
	JRadioButton cat, dog, spider, woman, b, g, a;
	
	public Radio_1(String title) {
		super(title);
		
		getContentPane().setLayout(new FlowLayout());
		win = new JCheckBox("윈도우", false);
		linux = new JCheckBox("리눅스", true);
		solaris = new JCheckBox("솔라리스", false);
		
		ButtonGroup group = new ButtonGroup();
		cat = new JRadioButton("고양이", false);
		dog = new JRadioButton("개", true);
//		spider = new JRadioButton("거미", true);
		
		ButtonGroup group2 = new ButtonGroup();
		b = new JRadioButton("북망산", true);
		g = new JRadioButton("관악산", true);
		a = new JRadioButton("아차산", true);
		
		group.add(cat);
		group.add(dog);
//		group.add(spider);
		group.add(b);
		group.add(g);
		group.add(a);
		
		getContentPane().add(win);
		getContentPane().add(linux);
		getContentPane().add(solaris);
		getContentPane().add(cat);
		getContentPane().add(dog);
//		getContentPane().add(spider);
		getContentPane().add(new JLabel("                           "));  // 이렇게 하면 띄우기가 됨.
		getContentPane().add(b);
		getContentPane().add(g);
		getContentPane().add(a);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Radio_1("CheckBox & Radio Button Test");
	}
	
}

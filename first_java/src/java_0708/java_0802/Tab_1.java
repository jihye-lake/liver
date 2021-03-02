package java_0802;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Tab_1 extends JFrame implements ChangeListener {
	
	JTabbedPane pane;
	JLabel lbl_info;
	
	public Tab_1(String title) {
		super(title);
		
		JPanel one, two, three, four;
		pane = new JTabbedPane();
		lbl_info = new JLabel("           ");
		
		one = new JPanel();
		one.add(new JLabel("ù ��° ��"));
		one.add(new JTextField("�����Է�"));
		one.setBackground(new Color(50,250,75));
		
		pane.addTab("<html><font color=black>One</font></html>", one);
		
		two = new JPanel();
		two.add(new JLabel("�� ��° ��"));
		two.add(new JTextField("�����Է�"));
		two.setBackground(new Color(250,23,51));
		
		pane.addTab("<html><font color=blue>two</font></html>", two);
		
		three = new JPanel();
		three.add(new JLabel("�� ��° ��"));
		three.add(new JTextField("�����Է�"));
		three.setBackground(new Color(70,39,250));
		
		pane.addTab("<html><font color=red>three</font></html>", three);
		
		four = new JPanel();
		four.add(new JLabel("�� ��° ��"));
		four.add(new JTextField("�����Է�"));
		four.setBackground(new Color(207,144,255));
		
		pane.addTab("<html><font color=#cccc66>four</font></html>", four);
		
		pane.setSelectedIndex(1);
		pane.addChangeListener(this);
		
		getContentPane().add("North", new JLabel("Tab ��� ����"));
		getContentPane().add("Center", pane);
		getContentPane().add("South", lbl_info);
		
//		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
		
	}
	

	@Override
	public void stateChanged(ChangeEvent e) {
		
		int index = pane.getSelectedIndex();
		String msg = "<html><font size=7 color=green>" + pane.getTitleAt(index) + " Tab ���� �� </font></html>";
		
		lbl_info.setText(msg);
		pane.setSelectedIndex(index);
		
	}

	public static void main(String[] args) {
		new Tab_1("Tab Test");
	}
	
}

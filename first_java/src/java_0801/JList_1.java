package java_0801;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JList_1 extends JPanel {
	
	String[] str = {"대한민국","스위스","이집트","페루","캐나다","이탈리아","브라질"};
	
	JList list;
	
	Vector info_data;  // Vector => 동질이 아닌 이질의 데이터도 처리 가능함
	
	public JList_1() {
		setLayout(new BorderLayout());
		
		list = new JList();
		info_data = new Vector();
		
		for (int i = 0; i < 7; i++) {
			
			info_data.addElement(str[i]);  // 상속 관계에서 다른 메소드를 가질 수도 있음 synchronized 처리 되어 있음			
		}
		
		list.setListData(info_data);
		
		add("Center", new JScrollPane(list));
		add("South", new JLabel("<html><font size=6 color=blue>" + "리스트 Test </font></html>"));
		
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(200,150);
	}
	
	public static void main(String[] args) {
		JFrame jff = new JFrame("JList Test");
		
		JList_1 panel = new JList_1();
		
		jff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jff.setForeground(new Color(0,51,153));
		jff.setBackground(new Color(189,189,189));
		
		jff.getContentPane().add(panel, "Center");
		jff.setSize(panel.getPreferredSize());
		jff.setVisible(true);
		
	}

}

package java_0801;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButton_1 extends JPanel {
	
	public JButton_1() {
		
		setLayout(new GridLayout(1, 3, 5, 5));
		AbstractButton btn = new JButton("Ȯ��");
		
		add(btn);
		
		btn = new JButton("���");
		add(btn);
		
		btn = new JButton("�ǵ�����");
		add(btn);
		
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(400, 200);
		// Dimension() Dimension Ŭ������ ���� ��ü�� �ִ� ������Ʈ�� ���� ���� �� ���� ���̸� ĸ��ȭ �մϴ�.
	}
	
	public static void main(String[] args) {
		JFrame jff = new JFrame("JFrame Test");
		
		JButton_1 panel = new JButton_1();
		
		jff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // �� �����Ӹ� ������ ���α׷��� ���� �� ����.
		jff.getContentPane().add(panel, "Center");
		// JFrame �� JButton �� ����ϱ� ���� getContentPane().add() ó�� ����մϴ�.
		// AWT �� Frame ���� ȭ�鿡 ����Ʈ�� �߰��� ��쿡 add() �޼ҵ带 ���������
		// Swing ������ getContentPane().add() ó�� ����մϴ�.
		jff.setSize(panel.getPreferredSize());
		jff.setVisible(true);
	}

}

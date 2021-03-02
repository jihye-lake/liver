package java_0802;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame; // Frame �� BorderLayout
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonFrame extends JFrame implements ActionListener {  // �г� �� ���� ���� �ϳ��� �� �г��� ��´�
	
	private JRadioButton small, medium, large, americano, latte, cappuccino;
	private JLabel text, text2;
	private JPanel topPanel, secondPanel, sizePanel, resultPanel, resultPanel2, kofcf, boxPanel;
	
	public RadioButtonFrame() {
		setTitle("���� ��ư �׽�Ʈ");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("� ũ���� Ŀ�Ǹ� �ֹ��Ͻðڽ��ϱ�?");
		topPanel.add(label);
		add(topPanel, BorderLayout.NORTH);
		
		secondPanel = new JPanel();
		add(secondPanel, BorderLayout.CENTER);
		
		sizePanel = new JPanel();
		small = new JRadioButton("Small Size");
		medium = new JRadioButton("medium Size");
		large = new JRadioButton("large Size");
		
		kofcf = new JPanel();
		americano = new JRadioButton("americano");
		latte = new JRadioButton("latte");
		cappuccino = new JRadioButton("cappuccino");
		
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		ButtonGroup size1 = new ButtonGroup();
		size1.add(americano);
		size1.add(latte);
		size1.add(cappuccino);
		
		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);
		
		americano.addActionListener(this);
		latte.addActionListener(this);
		cappuccino.addActionListener(this);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		
		secondPanel.add(americano);
		secondPanel.add(latte);
		secondPanel.add(cappuccino);
		
		boxPanel = new JPanel(new GridLayout(3,1));
		
		boxPanel.add(sizePanel);
		boxPanel.add(new JLabel("Ŀ�� ������ �����ϼ���.", JLabel.CENTER));
		boxPanel.add(secondPanel);
		
		add(boxPanel, BorderLayout.CENTER);
		
		resultPanel = new JPanel(new GridLayout(2,1));   // ����κ� �ٽ��ϱ�
		text = new JLabel("ũ�Ⱑ ���õ��� �ʾҽ��ϴ�.", JLabel.CENTER);
		text2 = new JLabel("������ ���õ��� �ʾҽ��ϴ�.", JLabel.CENTER);
		text.setForeground(new Color(255,20,80));
		resultPanel.add(text);
		resultPanel.add(text2);
		add(resultPanel, BorderLayout.SOUTH);
		setVisible(true);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JRadioButton obj = (JRadioButton) e.getSource();  // obj �� ���� ����� �� ���� üũ�ϸ� ���� �߰� �� �� ����
																				// ���� text �� ���� ������� ������ obj ���� �� ���� ��
																				// å���� ���� �����̴ϱ� �߰��� �����صα�
		
		if(obj == small) {
			text.setText("Small ũ�Ⱑ ���õǾ����ϴ�.");
		}
		
		if(obj == medium) {
			text.setText("medium ũ�Ⱑ ���õǾ����ϴ�.");
		}
		
		if(obj == large) {
			text.setText("large ũ�Ⱑ ���õǾ����ϴ�.");
		}
		
		if(obj == americano) {
			text2.setText("americano�� ���õǾ����ϴ�.");
		}
		
		if(obj == latte) {
			text2.setText("latte�� ���õǾ����ϴ�.");
		}
		
		if(obj == cappuccino) {
			text2.setText("cappuccino�� ���õǾ����ϴ�.");
		}
		
	}
	
	public static void main(String[] args) {
		new RadioButtonFrame();
	}

}

package java_0802;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame; // Frame 은 BorderLayout
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonFrame extends JFrame implements ActionListener {  // 패널 세 개를 만들어서 하나에 두 패널을 담는다
	
	private JRadioButton small, medium, large, americano, latte, cappuccino;
	private JLabel text, text2;
	private JPanel topPanel, secondPanel, sizePanel, resultPanel, resultPanel2, kofcf, boxPanel;
	
	public RadioButtonFrame() {
		setTitle("라디오 버튼 테스트");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("어떤 크기의 커피를 주문하시겠습니까?");
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
		boxPanel.add(new JLabel("커피 종류를 선택하세요.", JLabel.CENTER));
		boxPanel.add(secondPanel);
		
		add(boxPanel, BorderLayout.CENTER);
		
		resultPanel = new JPanel(new GridLayout(2,1));   // 여기부분 다시하기
		text = new JLabel("크기가 선택되지 않았습니다.", JLabel.CENTER);
		text2 = new JLabel("종류가 선택되지 않았습니다.", JLabel.CENTER);
		text.setForeground(new Color(255,20,80));
		resultPanel.add(text);
		resultPanel.add(text2);
		add(resultPanel, BorderLayout.SOUTH);
		setVisible(true);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JRadioButton obj = (JRadioButton) e.getSource();  // obj 를 따로 만들면 두 군데 체크하면 따로 뜨게 할 수 있음
																				// 나는 text 를 따로 만들었기 때문에 obj 따로 안 만들어도 됨
																				// 책에는 없는 내용이니까 추가로 숙지해두기
		
		if(obj == small) {
			text.setText("Small 크기가 선택되었습니다.");
		}
		
		if(obj == medium) {
			text.setText("medium 크기가 선택되었습니다.");
		}
		
		if(obj == large) {
			text.setText("large 크기가 선택되었습니다.");
		}
		
		if(obj == americano) {
			text2.setText("americano가 선택되었습니다.");
		}
		
		if(obj == latte) {
			text2.setText("latte가 선택되었습니다.");
		}
		
		if(obj == cappuccino) {
			text2.setText("cappuccino가 선택되었습니다.");
		}
		
	}
	
	public static void main(String[] args) {
		new RadioButtonFrame();
	}

}

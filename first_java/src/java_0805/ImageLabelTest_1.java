package java_0805;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ImageLabelTest_1 extends JFrame implements ActionListener {
	private JPanel panel, panel1, panel2;
	private JLabel label;
	private JButton button, button1;
	
	public ImageLabelTest_1() {
		setTitle("이미지 레이블");
		setSize(400, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		panel = new JPanel();
		panel1 = new JPanel();
		
		label = new JLabel("이미지를 보려면 아래 버튼을 누르시오.");
		
		button = new JButton("이미지 레이블");
		ImageIcon icon = new ImageIcon("bttrfly1.png");
		button.setIcon(icon);
		
		button1 = new JButton("이미지 레이블1");
		ImageIcon icon1 = new ImageIcon("bttrfly2.png");
		button1.setIcon(icon1);
		
		button.addActionListener(this);
		button1.addActionListener(this);
		
		panel.add(label);  // panel 에 라벨을 넣고
//		panel2.add(label);
		
		panel1.add(button);  // panel1 에 버튼 두 개를 넣고
		panel1.add(button1);
		
		panel2 = new JPanel(new GridLayout(2,1));
		
		panel2.add(panel);  // panel2 에 panel 과 panel1 을 전부 넣음
		panel2.add(panel1);
		
		add(panel2);
//		add(panel2, BorderLayout.CENTER);
//		add(panel, BorderLayout.CENTER);
//		add(panel1, BorderLayout.SOUTH);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		ImageLabelTest_1 t = new ImageLabelTest_1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton obj = (JButton) e.getSource(); 
		
		if(obj == button) {
			ImageIcon orange = new ImageIcon("src\\images\\snack_bites.jpg");
			label.setIcon(orange);
			label.setText(null);
		}
		
		if(obj == button1) {
			ImageIcon cherry = new ImageIcon("src\\images\\snack_machi.jpg");
			label.setIcon(cherry);
			label.setText(null);
		}
		
		
		
	}


}
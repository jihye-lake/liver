package java_0805;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageLabelTest_3 extends JFrame {  // 버튼 여러 개가 다 먹으면서 이미지가 바뀌면서 나오려면 if 문으로 비교를 해줘야 함.
	private JPanel panel1, panel2, panel3;
	private JLabel label;
	private JButton button1, button2, button3;
	
	public ImageLabelTest_3() {		
		
		setTitle("이미지 레이블");
		setSize(470, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		label = new JLabel("이미지를 보려면 아래 버튼을 누르시오.");
		
		button1 = new JButton("이미지 레이블1");
		ImageIcon icon1 = new ImageIcon("bttrfly1.png");
		button1.setIcon(icon1);
		
		button2 = new JButton("이미지 레이블2");
		ImageIcon icon2 = new ImageIcon("bttrfly2.png");
		button2.setIcon(icon2);
		
		button3 = new JButton("이미지 레이블3");
		ImageIcon icon3 = new ImageIcon("bttrfly3.png");
		button3.setIcon(icon3);
		
		button1.addActionListener(new Handler());
		button2.addActionListener(new Handler());
		button3.addActionListener(new Handler());
		
		panel1.add(label);  // panel 에 라벨을 넣고
//		panel2.add(label);
		
		panel2.add(button1);  // panel1 에 버튼 두 개를 넣고
		panel2.add(button2);
		panel2.add(button3);
		
		panel3 = new JPanel(new GridLayout(1,3));
		
		panel3.add(panel1);  // panel2 에 panel 과 panel1 을 전부 넣음
		panel3.add(panel2);
		
		add(panel3);
//		add(panel2, BorderLayout.CENTER);
//		add(panel, BorderLayout.CENTER);
//		add(panel1, BorderLayout.SOUTH);
		setVisible(true);
		
	}
	
	class Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			JButton obj = (JButton) e.getSource(); 
			
			if(obj == button1) {
				ImageIcon bites = new ImageIcon("src\\images\\snack_bites.jpg");
				label.setIcon(bites);
				label.setText(null);
			}
			
			else if(obj == button2) {
				ImageIcon machi = new ImageIcon("src\\images\\snack_machi.jpg");
				label.setIcon(machi);
				label.setText(null);
			}
			
			else {
				ImageIcon gogumat = new ImageIcon("src\\images\\snack_gogumat.jpg");
				label.setIcon(gogumat);
				label.setText(null);
			}
			
			
			
		}
		
	}
	
	public static void main(String[] args) {
		ImageLabelTest_3 t = new ImageLabelTest_3();
	}

}
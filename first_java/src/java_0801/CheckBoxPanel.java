package java_0801;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxPanel extends JPanel implements ItemListener {
	JCheckBox[] buttons = new JCheckBox[4];
	String[] fruits = {"tomato", "cherry", "orange", "passion"};
	JLabel[] pictureLabel = new JLabel[4];
	ImageIcon[] icon = new ImageIcon[4];
	
	public CheckBoxPanel() {
		super(new GridLayout(0, 5));
		
		//체크 박스 생성
		for (int i = 0; i < 4; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
			buttons[i].addItemListener(this);
			pictureLabel[i] = new JLabel(fruits[i] + ".jpg");
			icon[i] = new ImageIcon(fruits[i] + ".jpg");
			
		}
		
		JPanel checkPanel = new JPanel(new GridLayout(0, 1));  // 버튼 그리드
		for (int i = 0; i < 4; i++) {
			checkPanel.add(buttons[i]);
			
			add(checkPanel);
			add(pictureLabel[0]);
			add(pictureLabel[1]);
			add(pictureLabel[2]);
			add(pictureLabel[3]);
			
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("CheckBoxDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CheckBoxPanel panel = new CheckBoxPanel();
		panel.setOpaque(true);
		frame.add(panel);
		frame.setSize(500, 200);
		frame.setVisible(true);
	}

	// 체크 박스의 아이템 이벤트를 처리한다.
	@Override
	public void itemStateChanged(ItemEvent e) {
		ImageIcon image = null;
		Object source = e.getItemSelectable();
		for (int i = 0; i < 4; i++) {
			if(source == buttons[i]) {
			if (e.getStateChange() == ItemEvent.DESELECTED) 
				pictureLabel[i].setIcon(null);
			else
				pictureLabel[i].setIcon(icon[i]);
				
			}
		}
		
	}

}

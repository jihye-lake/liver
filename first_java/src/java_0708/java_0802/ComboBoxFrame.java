package java_0802;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame implements ActionListener {
	JLabel label;
	
	public ComboBoxFrame() {
		setTitle("�޺� �ڽ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 260);
		
		String[] snack = {"snack_bites","snack_gogumat","snack_machi","snack_minis","snack_tintin"};
		JComboBox snackList = new JComboBox(snack);
		snackList.setSelectedIndex(0);
		snackList.addActionListener(this);
		
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		changePicture(snack[snackList.getSelectedIndex()]);
		add(snackList, BorderLayout.PAGE_START);
		add(label, BorderLayout.PAGE_END);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox) e.getSource();
		String name = (String) cb.getSelectedItem();
		changePicture(name);
		
	}
	
	protected void changePicture(String name) {
		ImageIcon icon = new ImageIcon("src\\images\\" + name + ".jpg");
		label.setIcon(icon);
		if (icon != null) {
			label.setText(null);		
			
		} else 
			label.setText("�̹����� �߰ߵ��� �ʾҽ��ϴ�.");
	}
	
	public static void main(String[] args) {
		ComboBoxFrame frame = new ComboBoxFrame();
	}

}

package java_0802;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame {
	private JButton button;
	private JTextField text, result;
	
	public TextFieldFrame() {
		setSize(300, 130);
		setTitle("���� ����ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		ButtonListener listener = new ButtonListener();  // ButtonListener ��ſ� Handler ���� ���ؼ� �Ʒ��� class�� Handler ���ְ� new Handler �� ������
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("���� �Է� : "));
		text = new JTextField(15);
		text.addActionListener(new Handler());
		panel.add(text);
		
		panel.add(new JLabel("������ �� : "));
		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(new Handler());
		panel.add(button);
		add(panel);
		setVisible(true);
		
	}
	
	private class Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
//			Object obj = e.getSource();  // �̰Ŷ� Line 48 �� ���ų�, 46�� ���ų�
			
			if (e.getSource() == button || e.getSource() == text) {  // ������ ��� ��
			
//			if (obj == button || obj == text) {
				String name = text.getText();
				int value = Integer.parseInt(name);
				result.setText("  " + value * value);  // " "�� �� ���� String�� �䱸�Ǵ� ������ int �� ���� ���̱� ������ " " �� ���� ��Ʈ������ �ٲ��ش�.
				text.requestFocus();
			}
		}
	}
	
	public static void main(String[] args) {
		new TextFieldFrame();
	}

}

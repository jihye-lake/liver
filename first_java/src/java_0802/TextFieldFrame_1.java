package java_0802;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldFrame_1 extends JFrame {  // Anonymous Class �� ����
	private JButton button;
	private JTextField text, result;
	
	public TextFieldFrame_1() {
		setSize(300, 130);
		setTitle("���� ����ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		ButtonListener listener = new ButtonListener();  // ButtonListener ��ſ� Handler ���� ���ؼ� �Ʒ��� class�� Handler ���ְ� new Handler �� ������
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("���� �Է� : "));
		text = new JTextField(15);
		text.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					
//			JButton obj = (JButton) e.getSource();  // if (e.get~ ��ſ� �̰� ��
					
					if (e.getSource() == text) {  // ������ ��� ��
						
//			if (obj == button) {
						String name = text.getText();
						int value = Integer.parseInt(name);
						result.setText("  " + value * value);  // " "�� �� ���� String�� �䱸�Ǵ� ������ int �� ���� ���̱� ������ " " �� ���� ��Ʈ������ �ٲ��ش�.
						text.requestFocus();
					}
				}
			
		});
		panel.add(text);
		
		panel.add(new JLabel("������ �� : "));
		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {  // ������ ��� ��
					
//			if (obj == button) {
					String name = text.getText();
					int value = Integer.parseInt(name);
					result.setText("  " + value * value);  // " "�� �� ���� String�� �䱸�Ǵ� ������ int �� ���� ���̱� ������ " " �� ���� ��Ʈ������ �ٲ��ش�.
					text.requestFocus();
				}
				
			}
		});
		
		panel.add(button);
		add(panel);
		setVisible(true);
		
	}
	
//	private class Handler implements ActionListener {  // ���� �ű�
//		public void actionPerformed(ActionEvent e) {
//			
////			JButton obj = (JButton) e.getSource();  // if (e.get~ ��ſ� �̰� ��
//			
//			if (e.getSource() == button || e.getSource() == text) {  // ������ ��� ��
//			
////			if (obj == button) {
//				String name = text.getText();
//				int value = Integer.parseInt(name);
//				result.setText("  " + value * value);  // " "�� �� ���� String�� �䱸�Ǵ� ������ int �� ���� ���̱� ������ " " �� ���� ��Ʈ������ �ٲ��ش�.
//				text.requestFocus();
//			}
//		}
//	}
	
	public static void main(String[] args) {
		new TextFieldFrame_1();
	}

}

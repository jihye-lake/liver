package java_0802;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldFrame_1 extends JFrame {  // Anonymous Class 로 변경
	private JButton button;
	private JTextField text, result;
	
	public TextFieldFrame_1() {
		setSize(300, 130);
		setTitle("제곱 계산하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		ButtonListener listener = new ButtonListener();  // ButtonListener 대신에 Handler 쓰기 위해서 아래에 class명 Handler 해주고 new Handler 로 고쳐줌
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력 : "));
		text = new JTextField(15);
		text.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					
//			JButton obj = (JButton) e.getSource();  // if (e.get~ 대신에 이걸 씀
					
					if (e.getSource() == text) {  // 위에를 대신 씀
						
//			if (obj == button) {
						String name = text.getText();
						int value = Integer.parseInt(name);
						result.setText("  " + value * value);  // " "를 안 쓰면 String이 요구되는 곳에서 int 를 쓰는 것이기 때문에 " " 로 쉽게 스트링으로 바꿔준다.
						text.requestFocus();
					}
				}
			
		});
		panel.add(text);
		
		panel.add(new JLabel("제곱한 값 : "));
		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {  // 위에를 대신 씀
					
//			if (obj == button) {
					String name = text.getText();
					int value = Integer.parseInt(name);
					result.setText("  " + value * value);  // " "를 안 쓰면 String이 요구되는 곳에서 int 를 쓰는 것이기 때문에 " " 로 쉽게 스트링으로 바꿔준다.
					text.requestFocus();
				}
				
			}
		});
		
		panel.add(button);
		add(panel);
		setVisible(true);
		
	}
	
//	private class Handler implements ActionListener {  // 위로 옮김
//		public void actionPerformed(ActionEvent e) {
//			
////			JButton obj = (JButton) e.getSource();  // if (e.get~ 대신에 이걸 씀
//			
//			if (e.getSource() == button || e.getSource() == text) {  // 위에를 대신 씀
//			
////			if (obj == button) {
//				String name = text.getText();
//				int value = Integer.parseInt(name);
//				result.setText("  " + value * value);  // " "를 안 쓰면 String이 요구되는 곳에서 int 를 쓰는 것이기 때문에 " " 로 쉽게 스트링으로 바꿔준다.
//				text.requestFocus();
//			}
//		}
//	}
	
	public static void main(String[] args) {
		new TextFieldFrame_1();
	}

}

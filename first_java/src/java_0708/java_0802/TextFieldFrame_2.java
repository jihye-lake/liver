package java_0802;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldFrame_2 extends JFrame implements ActionListener {  // this 로 변경
	private JButton button;
	private JTextField text, result;
	
	public TextFieldFrame_2() {
		setSize(300, 130);
		setTitle("제곱 계산하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력 : "));
		text = new JTextField(15);
		text.addActionListener(this);
			
		panel.add(text);
		
		panel.add(new JLabel("제곱한 값 : "));
		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(this);
			
		
		panel.add(button);
		add(panel);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new TextFieldFrame_2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		Object obj = e.getSource();  // 이거랑 Line 48 을 쓰거나, 46만 쓰거나
		
		if (e.getSource() == button || e.getSource() == text) {  // 위에를 대신 씀
		
//		if (obj == button || obj == text) {
			String name = text.getText();
			int value = Integer.parseInt(name);
			result.setText("  " + value * value);  // " "를 안 쓰면 String이 요구되는 곳에서 int 를 쓰는 것이기 때문에 " " 로 쉽게 스트링으로 바꿔준다.
			text.requestFocus();
		}
		
	}

}
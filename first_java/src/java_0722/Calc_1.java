package java_0722;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Exit extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

public class Calc_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("����");
		TextField tf = new TextField("0");
		
		tf.setEnabled(false); // Ȱ��ȭ�� �� �ż� �ԷºҰ��� ��
		
		ff.setSize(250, 200);
		ff.setLocation(900, 300);
		
		ff.add("North", tf); // ���Ǵ� �κ��� ���� ������
		
		Panel numPanel = new Panel();
		Button[] numButtons = null;
		numPanel.setLayout(new GridLayout(4,5,5,5));  // 4�� 5���� �׸���. String �� �Ϸķ� ��� 4�� 5���� ����.
																			// 5,5 �� ��ư���� ���鰣��
		numPanel.setBackground(new Color(210,255,198));
		
		ff.add("Center", numPanel);
		
		String[] numStr = {"7","8","9","/","CE","4","5","6","*","BS","1","2","3","-","1/x","0","+/-",".","+","="};
		
		numButtons = new Button[numStr.length];
		
		for (int i = 0; i < numStr.length; i++) {
			numButtons[i] = new Button(numStr[i]);
			numButtons[i].setForeground(new Color(0,0,0));
			numPanel.add(numButtons[i]);
			
			Exit end = new Exit();
			ff.addWindowListener(end);
						
		}
		
		ff.setResizable(false);  // ����� �ø��ų� ���� �� ����(true �� �ָ� ũ�� ���� ������ �⺻���� true)
		ff.setVisible(true);
		
	}

}

package java_0717;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class TextField_2 extends Frame{
	
	public TextField_2(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		TextArea txt1 = new TextArea(10, 30);  //10�� 30���� �����̴�(��Ʈ�� ���� �ٸ���)
		TextField txt2 = new TextField("�ȳ��ϼ���", 20);
		
		txt1.setText("�ݰ����ϴ�.");
		txt1.setBackground(new Color(178,235,244));
		txt1.setFont(new Font("�ü�ü", Font.ITALIC|Font.BOLD, 20));  // 17�� ��Ʈ ũ����. ITALIC(����̱�), BOLD(���ϰ�)
		txt1.setForeground(new Color(0,51,153));
		
		txt2.setEchoChar('#');
		txt2.setForeground(new Color(189,189,189));  // #�� ����
		
		add(txt1);
		add(txt2);
		
		setSize(500, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TextField_2("TextArea Test");
		
	}

}

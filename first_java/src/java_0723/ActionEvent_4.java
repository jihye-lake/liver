package java_0723;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_4 extends Frame implements ActionListener {
	
	TextField txt_1, txt_2;
	
	public ActionEvent_4(String str) {
		super(str);
		txt_1 = new TextField("문자를 입력하세요.", 20);
		txt_2 = new TextField("...", 20);
		
		txt_1.addActionListener(this);
		txt_2.addActionListener(this);
		
		add("North", txt_1);
		add("South", txt_2);
		
		setSize(300, 300);
		setVisible(true);
						
	}
	
	public static void main(String[] args) {
		new ActionEvent_4("ActionEvent Test");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		TextField obj = (TextField) e.getSource();
		
		if (obj == txt_1) {
			txt_2.setText(txt_1.getText());
			txt_1.setFocusable(false);
			txt_2.setFocusable(true);
			
		} else {
			txt_1.setText(txt_2.getText());
			txt_2.setFocusable(false);
			txt_1.setFocusable(true);
		}
		
	}

	
}

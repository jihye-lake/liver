package java_0729;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextEvent_1 extends Frame implements TextListener {
	
	TextField txt;
	Label lbl_info;
	
	public TextEvent_1(String title) {
		super(title);
		
		txt = new TextField(" �ؽ�Ʈ �Է�... ", 20);
		txt.addTextListener(this);
		txt.selectAll();  // �Ķ��� ������Ű��(�Է��ϱ� �� ���ϵ���)
		
		lbl_info = new Label("                                                  ");
		add("Center", lbl_info);
		add("South", txt);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextEvent_1("Text Event Test");
	}

	@Override
	public void textValueChanged(TextEvent e) {
		lbl_info.setText(txt.getText());  // get �� �������� ��, set �� ����ִ� ��
	}

}

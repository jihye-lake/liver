package java_0729;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TextEvent_2 extends Frame {
	
	TextField txt;
	TextArea txt_area;
	
	public TextEvent_2(String title) {
		super(title);
		txt_area = new TextArea();
		txt = new TextField("", 20);
		
		txt.addTextListener(new Handler());  // new Handler 가 이벤트를 처리할 Handler 를 가지고 있다는 뜻
		txt.addActionListener(new Handler());
		
		txt_area.setFocusable(false);
		
		txt_area.setEditable(false);
		
		addWindowListener(new Handler());
		
		add("North", new Label(" 글자를 입력하고 Enter "));
		add("Center", txt_area);
		add("South", txt);
		
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TextEvent_2("Text Event Test");
	}
	
	
	class Handler extends WindowAdapter implements ActionListener, TextListener {
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("윈도우 닫기");
			System.exit(0);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		txt.setText("");  // 텍스트는 지워버리고
		txt_area.append("\n");  //  개행시켜라
		
	}

	@Override
	public void textValueChanged(TextEvent e) {
		
		try {
			int i = txt.getText().length();
			if (i == 0) {
				return;
			}
			
			txt_area.append(" " + txt.getText().charAt(i-1));
		} catch (Exception e2) {
			System.out.println(e2.getMessage());		
		}
	}
		
	}

}

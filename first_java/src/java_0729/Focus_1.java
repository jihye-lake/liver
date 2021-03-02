package java_0729;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Focus_1 extends Frame implements FocusListener, ComponentListener, ActionListener{
	
	Button btn1, btn2, btn3;
	TextArea txt_info;
	
	public Focus_1(String title) {
		super(title);
		
		btn3 = new Button("화면에서 잠시 사라짐");
		btn3.addActionListener(this);
		
		txt_info = new TextArea();
		btn1 = new Button("왼쪽 버튼");
		btn2 = new Button("오른쪽 버튼");
		
		btn1.addFocusListener(this);
		btn2.addFocusListener(this);
		addComponentListener(this);
		
		
		Panel panel = new Panel();
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		add("Center", txt_info);
		add("South", panel);
		
		setSize(350, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Focus_1("Focus Event Test");
	}

	@Override
	public void focusGained(FocusEvent e) {
		
		Button obj = (Button) e.getSource();
		
		if (obj == btn1) {
			
			txt_info.append(btn1.getLabel() + " 포커스 얻음 \n ");
			
		} else

			txt_info.append(btn2.getLabel() + " 포커스 얻음 \n ");
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		
		Button obj = (Button) e.getSource();
		
		if (obj == btn1) {
			
			txt_info.append(btn1.getLabel() + " @포커스 잃음@ \n");
			
		} else
		
			txt_info.append(btn2.getLabel() + " @포커스 잃음@ \n");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			this.setVisible(false);
		
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		this.setVisible(true);
		
	}

	@Override
	public void componentResized(ComponentEvent e) {
		txt_info.append("컴포넌트 크기 변경 \n");
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		txt_info.append("#######컴포넌트 위치 변경####### \n");
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		txt_info.append("**********컴포넌트가 화면에서 나타남********** \n");
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		txt_info.append("&&&&&&&&&컴포넌트가 화면에서 사라짐&&&&&&&&& \n");
		
	}

}

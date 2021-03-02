package java_0724;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

public class Container_1 extends Frame implements ContainerListener, ActionListener{
	
	Panel panel;
	Button btn, btn_s1, btn_s2;
	
	public Container_1(String title) {
		super(title);
		
		panel = new Panel();
		panel.setSize(200, 200);
		add("Center", panel);
		
		panel.addContainerListener(this);
		
		btn = new Button("컴포넌트 추가");
		btn.addActionListener(this);
		add("South", btn);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Container_1("Container Test");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Button obj = (Button) e.getSource();  //  글자로 버튼 비교하기
		
		if (e.getActionCommand().equals("컴포넌트 추가")) {
			panel.add(btn_s1 = new Button("추가된 버튼"));
			panel.add(btn_s2 = new Button("추가된 버튼"));
			setVisible(true);
			btn.setLabel("컴포넌트 제거");
			
		}
		
		else {
//			panel.remove(btn_s1);  // removeall 을 해주면 한꺼번에 지울 수 있음
//			panel.remove(btn_s2); 
			panel.removeAll();
			btn.setLabel("컴포넌트 추가");
		}
		
	}

	@Override
	public void componentAdded(ContainerEvent e) {  // 컴포넌트가 추가 되면 
		
		setTitle("컴테이너에 컴포넌트 추가");  // 타이틀을 바꾸라는 뜻
		
	}

	@Override
	public void componentRemoved(ContainerEvent e) {
		setTitle("컴테이너에 컴포넌트 제거 @@@@@@@@@@@@@@");
		
	}

}

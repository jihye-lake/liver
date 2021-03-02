package java_0724;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Component_1 extends Frame implements ComponentListener, ActionListener {
																			// 네 개의 메소드 호출	// Actiomperformed 오버라이드
	
	TextArea txt;
	Button btn;
	
	public Component_1(String title) {
		super(title);
		
		btn = new Button("화면에서 잠시 사라짐");
		btn.addActionListener(this);
		
		add("South", btn);
		
		txt = new TextArea();
		add("Center", txt);
		addComponentListener(this);  // 프레임에 달아놨음
		
		setSize(300, 300);
		setVisible(true);
		

	}

	public static void main(String[] args) {
		new Component_1("Component Event Test");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
//			this.hide();
			this.setVisible(false);  // 화면에서 사라짐(hide 랑 같은 뜻, 화면을 숨기는 것)
			
			Thread.sleep(3000); // 3초, Thread 를 쓰기 위해서 try catch 를 이용해서 예외처리 해줬음
			
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		this.setVisible(true);  // 화면에 다시 보임
		
	}

		
		
		@Override
		public void componentResized(ComponentEvent e) {  // 크기가 바뀔 때 호출
			txt.append(" 컴포넌트 크기 변경 \n");
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {  // 컴포넌트가 움직일 때 발생
		txt.append(" @@@컴포넌트 위치 변경@@@ \n");
		
	}

	@Override
	public void componentShown(ComponentEvent e) {  // 컴포넌트가 화면상에 보일 때 나타남
		txt.append(" &&&&&컴포넌트가 화면에 나타남&&&&& \n");
	
	}

	@Override
	public void componentHidden(ComponentEvent e) {  // 컴포넌트가 보이지 않게 숨겨질 때 나타남
		txt.append(" %%%%%%%%%%컴포넌트가 숨겨짐%%%%%%%%%%% \n");  // 숨겨질 때는 텍스트가 보이지 않지만 화면에 나타나면 저번에 뿌렸던 것을 보여줌
		
	}

}

package java_0729;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEvent_1 extends Frame implements MouseListener{
	
	public MouseEvent_1(String title) {
		super(title);
		addMouseListener(this);  // 프레임에 mouselistener 를 달겠다는 뜻임
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MouseEvent_1("Mouse Event Test");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 버튼을 클릭");		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("@@@마우스 버튼을 누름@@@");		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("$$$$$$$$$$$$마우스 버튼을 놓음$$$$$$$$$$$$");		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("****************마우스가 프레임 안에 들어옴****************");		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("^^^^^^^^^^^^^^^^^^마우스가 프레임 밖으로 나감^^^^^^^^^^^^^^^^^");		
	}

}

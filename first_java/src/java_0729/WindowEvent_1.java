package java_0729;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 두 개짜리의 메소드를 갖는 건 Adapter 가 존재한다.

public class WindowEvent_1 extends Frame implements WindowListener {  //  하나만 쓰더라도 여섯 개를 전부 써줘야 하는데
																								//	그게 불합리해서 쓰는 게 WindowAdapter 임
	
	public WindowEvent_1(String title) {
		super(title);
		
		addWindowListener(this);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowEvent_1("Window Event Test");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("윈도우 열기$$");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("윈도우 닫기%%%");
		this.dispose(); // 프로그램 종료
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("윈도우 완전닫기기긱********");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("윈도우 아이콘화^^^^^^^^^^^^");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("윈도우 아이콘화 해제!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("윈도우 활성화))))))))))))))))))))))))))))))))))))))))))))");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("윈도우 비활성화%%%%%%%%%%%");
		
	}

}

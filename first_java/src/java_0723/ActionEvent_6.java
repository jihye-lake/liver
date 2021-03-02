package java_0723;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
//class Exit_9 extends WindowAdapter {
//	public void windowclosing(WindowEvent e) {
//		System.exit(0);
//	}
//}

public class ActionEvent_6 extends Frame {  // Handler 버전
	
	Label lid;
	Label lpwd;
	TextField tfId;  // TextField : 타이핑 공간
	TextField tfPwd;
	Button ok;
	
	public ActionEvent_6(String title) {
		super(title);
		
		lid = new Label("ID : ", Label.RIGHT);  // 우측에 붙는다
		lpwd = new Label("PWD : ", Label.RIGHT);  // 우측에 붙는다
		
		tfId = new TextField(10);  // 열 개의 글자를 담을 수 있음
		tfPwd = new TextField(10);
		tfPwd.setEchoChar('*');  // tfPwd 에는 별을 담는다
		ok = new Button("OK");
		// 다섯 개의 컴포넌트
		
		tfId.addActionListener(new EventHandler());  // 두 개의 tf , 하나의 버튼 총 세 군데에서 액션 이벤트를 발생시키고 있음
		tfPwd.addActionListener(new EventHandler());
		ok.addActionListener(new EventHandler());
		
		setLayout(new FlowLayout());  // 좌에서 우로 붙는다.
		
		add(lid);	add(tfId);
		add(lpwd);	add(tfPwd);
		add(ok);
		
		setSize(450, 80);
		setVisible(true);
		
//		Exit_9 end = new Exit_9();
//		addWindowListener(end);
	
	}
	
	public static void main(String[] args) {
		new ActionEvent_6("Login Test");
	}
	
	class EventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String id = tfId.getText(); // tfId.getText 를 id 에 담아라 => 사용자가 어떠한 글자를 쓰면 그걸 tf 에 담아라
			String password = tfPwd.getText();
			
			if (!id.equals("korea")) {
				System.out.println("입력하신 ID 가 존재하지 않습니다. 다시 입력해 주십시오.");
				tfId.requestFocus();  // 커서를 Id 위치에 갖다놔라
				tfId.selectAll();  // 전체를 반전시켜라 => 글자를 새로 처음부터 쓸 수 있음
				
			} else if (!password.equals("seoul")) {
				System.out.println("입력하신 password 는 틀렸습니다. 다시 입력해 주십시오.");
				tfPwd.requestFocus();
				tfPwd.selectAll();
				
			} else
				System.out.println(id + "님 어서오세요.");
			
		}
		
	}

}

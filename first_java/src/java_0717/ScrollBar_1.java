package java_0717;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;

public class ScrollBar_1 extends Frame {
	
	public ScrollBar_1(String title) {
		super(title);
		Scrollbar srb1 = new Scrollbar(Scrollbar.VERTICAL, 10, 100, 0, 255);  // 보더레이아웃 이건 수직
																				//10칸을 띄우고 100길이 만큼의 스크롤바를 만들어라 , 높이는 0~255인데 스크롤바가 움직일 수 있는 길이는 255-100이다
		Scrollbar srb2 = new Scrollbar(Scrollbar.HORIZONTAL, 100, 50, 0, 255);  //이건 수평
																				//100칸을 띄우고(100의 위치에서) 50길이만큼의 스크롤바를 만들어라, 수평의 전체 길이는 0~255이다. 스크롤바는 255-50만큼 움직일 수 있다.
		
		add("East", srb1); // 프레임 안에서 "" 안에 글자는 영향을 받기 때문에 대소문자에 유의해야한다.
		add("Center", new Label("스크롤바 테스트"));
		add("North", srb2);
		//아무것도 안 적고 add 만 적어버리면 한 곳에 몰리게 출력된다.
		
		setLocation(900, 300);
		setSize(200, 200);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new ScrollBar_1("ScrollBar Test");
	}

}

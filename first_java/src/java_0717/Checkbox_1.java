package java_0717;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Checkbox_1 extends Frame {
		
		public Checkbox_1(String str) {  // 이게 super(str) 으로 가서
			super(str); //여기까지 온 "체크박스 테스트"가 Frame으로 감
			setLayout(new FlowLayout());
			
			Checkbox cbx_1 = new Checkbox("와플", true);  //다중선택이 가능한 체크박스
			Checkbox cbx_2 = new Checkbox("호떡"); //여기에도 true false 써도 됨. 그러면 디폴트로 체크, 비체크를 알 수 있음.
			
			add(cbx_1);
			add(cbx_2);
			
			setLocation(800, 200);
			setSize(200,200);
			setVisible(true);
			
		}
		
		public static void main(String[] args) {
			new Checkbox_1("체크박스 테스트"); // => 이게 String str 으로 가고
		}
		
	}

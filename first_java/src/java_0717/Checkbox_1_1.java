package java_0717;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Checkbox_1_1 {
	public static void main(String[] args) {
	
	Frame ff = new Frame("체크박스 테스트");

			ff.setLayout(new FlowLayout());
			
			ff.setLocation(800, 200);
			ff.setSize(200,200);
			ff.setVisible(true);
			
			Checkbox cbx_1 = new Checkbox("국수", true);  //다중선택이 가능한 체크박스
			Checkbox cbx_2 = new Checkbox("우동"); //여기에도 true false 써도 됨. 그러면 디폴트로 체크, 비체크를 알 수 있음.
			Checkbox cbx_3 = new Checkbox("체리");
			Checkbox cbx_4 = new Checkbox("카레");
			Checkbox cbx_5 = new Checkbox("김밥");
			Checkbox cbx_6 = new Checkbox("쫄면");
			
			ff.add(cbx_1);
			ff.add(cbx_2);
			ff.add(cbx_3);
			ff.add(cbx_4);
			ff.add(cbx_5);
			ff.add(cbx_6);
			
			
	}
			
		}
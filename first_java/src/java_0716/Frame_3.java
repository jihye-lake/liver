package java_0716;

import java.awt.Frame;

public class Frame_3 extends Frame {  //Frame_2 방법과 Frame_3 방법을 둘 다 알아야 함. 상속받는 방법을 주로 쓰긴 함
	
		public Frame_3(String str) {
			super(str);  //Frame 가져옴
			setSize(300,300);
			setVisible(true);
		}
		
		public static void main(String[] args) {
			
			new Frame_3("프레임 최지혜");
		
	}

}

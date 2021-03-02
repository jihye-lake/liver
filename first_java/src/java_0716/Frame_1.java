package java_0716;

import java.awt.Frame;  //다른 컴포넌트를 담을 수 있는 컨테이너

public class Frame_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("최지혜");
		ff.setSize(300,300);
		ff.setVisible(true);  //true 쓰면 보여달라는 뜻. false 쓰면 안보여줌.
	}

}

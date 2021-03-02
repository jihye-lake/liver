package java_0716;

import java.awt.Color;
import java.awt.Frame;

public class Frame_2 {
	public static void main(String[] args) {
		
		Frame ff = new Frame();
		
		ff.setTitle("지혜지혜 최지혜"); //Frame 의 매개변수가 아닌 setTitle 에서 집어넣을 수도 있다.
		ff.setBackground(new Color(178, 235, 244));
		
		ff.setLocation(400, 400);  //위치 지정 안 해주면 가장 왼쪽 상단에 위치하게 된다
		ff.setSize(300, 300);
		ff.setVisible(true);
		
//		Frame ff_1 = new Frame();
//		
//		ff_1.setTitle("지혜지혜 최지혜"); //Frame 의 매개변수가 아닌 setTitle 에서 집어넣을 수도 있다.
//		ff_1.setBackground(new Color(16, 98, 10));
//		
//		ff_1.setLocation(200, 200);  //위치 지정 안 해주면 가장 왼쪽 상단에 위치하게 된다
//		ff_1.setSize(300, 300);
//		ff_1.setVisible(true);
//		
//		Frame ff_2 = new Frame();
//		
//		ff_2.setTitle("지혜지혜 최지혜"); //Frame 의 매개변수가 아닌 setTitle 에서 집어넣을 수도 있다.
//		ff_2.setBackground(new Color(0, 51, 153));
//		
//		ff_2.setLocation(600, 600);  //위치 지정 안 해주면 가장 왼쪽 상단에 위치하게 된다
//		ff_2.setSize(300, 300);
//		ff_2.setVisible(true);
	}

}

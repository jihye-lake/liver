package java_0717;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class List_2 {
	
	public static void main(String[] args) {
		
		Frame ff = new Frame("List - Select");
		ff.setSize(300, 200);
		ff.setLayout(new FlowLayout());
		
		List selectOne = new List(4);
		
		selectOne.setLocation(20, 40);
		selectOne.setSize(100, 120);
		
		selectOne.add("Student");
		selectOne.add("Teacher");
		selectOne.add("Driver");
		selectOne.add("Computer Programmer");
		selectOne.add("Sales Man");
		selectOne.add("Musician");
		selectOne.add("Director");
		
		List selectMany = new List(4, true);
//		selectMany.setLocation(150, 40);  // ff.setLayout(null); 인 경우에만 위치 줌
//		selectMany.setSize(100,120);
		
		selectMany.add("Student");  // Alt + Shift + R 누르면 같은 단어 전부 바꿀 수 있음
		selectMany.add("Teacher");
		selectMany.add("Driver");
		selectMany.add("Computer Programmer");
		selectMany.add("Sales Man");
		selectMany.add("Musician");
		selectMany.add("Director");
		
		ff.add(selectOne);
		ff.add(selectMany);
		ff.setVisible(true);
		
	}

}

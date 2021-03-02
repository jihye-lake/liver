package java_0717;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;

public class List_1 extends Frame{
	
	public List_1(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		List list = new List(4, false);  //3은 한 번에 세 개만 보여주겠다, false 는 단일선택만 가능, true 는 복수선택이 가능.
		
		Label lbl = new Label("List Test");
		add(lbl);
		
		list.add("386DX");
		list.add("486DX");
		list.add("486DX66");
		list.add("펜티엄");
		list.add("펜티엄4");
		list.add("에슬론XP");
		list.add("인텔 듀얼코어");
		
		add(list);
		setLocation(900, 200);
		setSize(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new List_1("list Test");
	}

}

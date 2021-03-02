package java_0723;

import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_5_1 extends Frame implements ActionListener {  // 다중선택, 결과가 나오게 하는 법
	
	List list;
	Label lbl_info;
	
	public ActionEvent_5_1(String title) {
		super(title);
		Panel panel = new Panel();
		list = new List(5, true);  // list true 는 다중선택이 가능
		
		list.add("서울");
		list.add("대구");
		list.add("대전");
		list.add("부산");
		list.add("광주");
		list.add("전주");
		list.add("울산");
		list.add("인천");
		list.add("제주");
		
		panel.add(list);
		
		lbl_info = new Label("                      ");
		list.addActionListener(this);
		
		add("Center", panel);
		add("South", lbl_info);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionEvent_5_1("ActionEvent Test");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String[] list_1 = list.getSelectedItems();  // 하나로 받을 때는 Item 이지만 여러개를 받을 때는 Items 임
		for (int i = 0; i < list_1.length; i++) {  // String 배열로 받은 것을 반복문으로 돌려서 받았다
			
			System.out.println(list_1[i] + " 찍고");
		}
		
	};

}
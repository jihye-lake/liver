package java_0723;

import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_5 extends Frame implements ActionListener {
	
	List list;
	Label lbl_info;
	
	public ActionEvent_5(String title) {
		super(title);
		Panel panel = new Panel();
		list = new List(5, false);
		
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
		new ActionEvent_5("ActionEvent Test");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		lbl_info.setText(list.getSelectedItem());  // 더블클릭하면 Frame 내의 List 에서 ActionEvent 가 발생함
		System.out.println(list.getSelectedItem() + "찍고");
		
	};

}

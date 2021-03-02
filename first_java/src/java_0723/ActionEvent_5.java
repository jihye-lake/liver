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
		
		list.add("����");
		list.add("�뱸");
		list.add("����");
		list.add("�λ�");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("��õ");
		list.add("����");
		
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
		
		lbl_info.setText(list.getSelectedItem());  // ����Ŭ���ϸ� Frame ���� List ���� ActionEvent �� �߻���
		System.out.println(list.getSelectedItem() + "���");
		
	};

}

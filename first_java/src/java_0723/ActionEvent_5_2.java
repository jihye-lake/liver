package java_0723;

import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_5_2 extends Frame implements ActionListener {
	
	List list;
	Label lbl_info;
	
	public ActionEvent_5_2(String title) {
		super(title);
		Panel panel = new Panel();
		list = new List(5,true);
		
		list.add("������");
		list.add("���");
		list.add("����");
		list.add("�쵿");
		list.add("��ġ����");
		list.add("Į����");
		list.add("���");
		list.add("�ø�");
		list.add("�����");
		
		panel.add(list);
		
		lbl_info = new Label("                          ");
		list.addActionListener(this);
		
		add("Center", panel);
		add("South", lbl_info);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ActionEvent_5_2("ActionEvent Test");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String[] list_1 = list.getSelectedItems();
		for (int i = 0; i < list_1.length; i++) {
			
			System.out.println(list_1[i] + " �԰� �ʹ�.");
			
		}
		
	}

}

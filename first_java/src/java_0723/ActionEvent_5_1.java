package java_0723;

import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_5_1 extends Frame implements ActionListener {  // ���߼���, ����� ������ �ϴ� ��
	
	List list;
	Label lbl_info;
	
	public ActionEvent_5_1(String title) {
		super(title);
		Panel panel = new Panel();
		list = new List(5, true);  // list true �� ���߼����� ����
		
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
		new ActionEvent_5_1("ActionEvent Test");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String[] list_1 = list.getSelectedItems();  // �ϳ��� ���� ���� Item ������ �������� ���� ���� Items ��
		for (int i = 0; i < list_1.length; i++) {  // String �迭�� ���� ���� �ݺ������� ������ �޾Ҵ�
			
			System.out.println(list_1[i] + " ���");
		}
		
	};

}
package java_0717;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;

public class List_1 extends Frame{
	
	public List_1(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		List list = new List(4, false);  //3�� �� ���� �� ���� �����ְڴ�, false �� ���ϼ��ø� ����, true �� ���������� ����.
		
		Label lbl = new Label("List Test");
		add(lbl);
		
		list.add("386DX");
		list.add("486DX");
		list.add("486DX66");
		list.add("��Ƽ��");
		list.add("��Ƽ��4");
		list.add("������XP");
		list.add("���� ����ھ�");
		
		add(list);
		setLocation(900, 200);
		setSize(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new List_1("list Test");
	}

}
